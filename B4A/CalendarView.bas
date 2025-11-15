Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Event: onDateClick(data as calendarItem)
#Event: onDateLongClick(data as calendarItem)
#Event: onDrawMonth(label as Label)
#Event: onDrawWeekdays(label as Label)
#Event: onDrawCalendarItem(data as calendarItem)

Sub Class_Globals
	Type calendarItem(panel As Panel, date As String)

	Private cal As Calendar
	'
	Private weekdays As List
	Private numWeeks As Int = 6
	Private thisMonth As Int
	Private thisYear As Int
	Private thisDay  As Int
	
	'
	Private mContainer As Panel
	'
	Private lblMonth As Label
	
	Private cellHeight As Int = 50dip
	Private cellWidth As Int
	Private mContainerDate As Panel
	'
	Private mCallback As Object
	Private mEventName As String	
	
	'month header format, refer to: https://developer.android.com/reference/java/text/SimpleDateFormat.html
	Public FormatHeaderMonth As String = "MMMM"
	'format for calendarItem date
	Public FormatCalendarDateItem As String = "MM-dd-yyyy"
	Public CalendarMonthItemColor As Int = Colors.White
	Public CalendarMonthItemAlternateColor As Int = Colors.LightGray
	Public HighlightCurrentDate As Boolean = True
	Public HighlightCurrentDateColor As Int = Colors.Cyan
	Public ShowHeaderMonth As Boolean = True
	Public ShowHeaderWeekdays As Boolean = True
	'will trigger custom draw events
	'Public CustomDraw As Boolean = False
End Sub

'Initializes the object.
'callback - Activity
Public Sub Initialize(callback As Object, EventName As String) As CalendarView
	cal.Initialize
	'
	thisMonth = cal.MonthValue
	thisYear = cal.YearValue
	thisDay = cal.DayValue
	'
	mCallback = callback
	mEventName = EventName
	Return Me
End Sub
 
Public Sub GetMonth As String
	Return cal.ToString2(FormatHeaderMonth)
End Sub

Public Sub MovePreviousMonth
	cal.MonthValue = cal.MonthValue - 2
	redraw
End Sub

Public Sub MoveNextMonth
	cal.MonthValue = cal.MonthValue
	redraw
End Sub

'Build calendar item to panel
Public Sub Build(v As Panel)
	mContainer = v
	mContainer.RemoveAllViews
	
	'Draw Month
	lblMonth.Initialize("")
	mContainer.AddView(lblMonth, 0dip, 0dip, mContainer.Width, 50dip)
	lblMonth.Color = Colors.White
	lblMonth.TextColor = Colors.Black
	lblMonth.Gravity = Gravity.CENTER
	lblMonth.Text = GetMonth
	If ShowHeaderMonth = False Then lblMonth.Height = 0dip
	'event
	Dim event As String = mEventName & "_onDrawMonth"
	If SubExists(mCallback, event) Then
		CallSubDelayed2(mCallback, event, lblMonth)
	End If
	
	
	'Draw weekdays
	Dim T As Int = lblMonth.Height, L As Int = 0
	cellWidth = Ceil(mContainer.Width / 7)
	cellHeight = 50dip	
	If ShowHeaderWeekdays = False Then cellHeight = 0dip	
	weekdays = DateUtils.GetDaysNames
	For i = 0 To weekdays.Size - 1
		Dim weekday As String = weekdays.Get(i)
		'
		Private lblWeekdays As Label
		lblWeekdays.Initialize("")
		mContainer.AddView(lblWeekdays, L, T, cellWidth, cellHeight)
		'customize
		lblWeekdays.Color = Colors.White
		lblWeekdays.TextColor = Colors.Black
		lblWeekdays.Gravity = Gravity.CENTER
		lblWeekdays.Text = weekday
		'event
		Dim event As String = mEventName & "_onDrawWeekdays"
		If SubExists(mCallback, event) Then
			CallSubDelayed2(mCallback, event, lblWeekdays)
		End If
		'
		L = L + cellWidth
	Next
	t = t + cellHeight 'month height + weekdays height
	
	'numWeeks = cal.getActualMinimum(cal.WEEK_OF_MONTH)
	cellHeight = (mContainer.Height - t) / numWeeks '((Activity.Height - t) / 2) / numWeeks
	
	mContainerDate.Initialize("")
	mContainer.AddView(mContainerDate, 0dip, T, mContainer.Width, cellHeight * numWeeks)
	'
	redraw
End Sub

'Redraw all items
Public Sub Refresh
	Build(mContainer)
End Sub
 
Private Sub redraw
	mContainerDate.RemoveAllViews
	
	'set month text
	lblMonth.Text = GetMonth

	'Draw dates
	cal.DayOfMonthValue = 1
	cal.DayOfMonthValue = cal.DayOfMonthValue + (1 - cal.DayOfWeekValue)
	'	
	Dim T As Int = 0
	 
	For week = 1 To numWeeks
		Dim L As Int = 0
		For day = 1 To weekdays.Size
			'boolean inMonth = cal.get(Calendar.MONTH) == thisMonth;
			'boolean inYear  = cal.get(Calendar.YEAR) == todayYear;
			'boolean isToday = inYear && inMonth && (cal.get(Calendar.DAY_OF_YEAR) == today);
			'boolean isFirstOfMonth = cal.get(Calendar.DAY_OF_MONTH) == 1;
			Dim mdayOfYear As Int = cal.DayValue
			Dim mMonth As Int = cal.MonthValue
			Dim mYear As Int = cal.YearValue
			Dim mDayOfMonth As Int = cal.DayOfMonthValue
			
			'in current month
			Dim inMonth As Boolean
			If mMonth = thisMonth Then
				inMonth = True
			End If
			
			'in current year
			Dim inYear As Boolean
			If mYear = thisYear Then
				inYear = True
			End If
			
			'is today
			Dim isToday As Boolean			
			If inYear And inMonth And (mdayOfYear = thisDay) Then
				isToday = True
			End If
			
			'is first month
			Dim isFirstOfMonth As Boolean
			Dim dateText As String = mDayOfMonth
			If mDayOfMonth = 1 Then isFirstOfMonth = True
			If isFirstOfMonth Then dateText = cal.ToString2("MMM") & "/" & mDayOfMonth
			
			'Draw cell panel
			Private cellPanel As Panel
			cellPanel.Initialize("cellPanel")
			
			'item data
			Dim calItem As calendarItem
			calItem.Initialize
			calItem.panel = cellPanel
			calItem.date = cal.ToString2(FormatCalendarDateItem)
			cellPanel.Tag = calItem
			
			mContainerDate.AddView(cellPanel, L, T, cellWidth, cellHeight)
			If (mMonth Mod 2) = 0 Then
				cellPanel.Color = CalendarMonthItemAlternateColor
			Else
				cellPanel.Color = CalendarMonthItemColor
			End If		
			If isToday Then
				cellPanel.Color = CalendarMonthItemColor
			End If
			
			' draw content
			Dim lbl As Label
			lbl.Initialize("")
			If isToday And HighlightCurrentDate = True Then
				lbl.Color = HighlightCurrentDateColor
				lbl.Typeface = Typeface.DEFAULT_BOLD
			End If
			lbl.TextColor = Colors.Black
			lbl.Gravity = Gravity.CENTER
			lbl.Text = dateText
			
			'then add content to cellPanel
			cellPanel.AddView(lbl, 0dip, 0dip, cellWidth, cellHeight)
			
			Dim event As String = mEventName & "_onDrawCalendarItem"
			If SubExists(mCallback, event) Then
				CallSubDelayed2(mCallback, event, calItem)
			End If
			
			'increase day value
			cal.DayOfMonthValue = cal.DayOfMonthValue + 1
			L = L + cellWidth
		Next
		t = t + cellHeight
	Next
	
End Sub

private Sub cellPanel_Click
	Dim b As Panel = Sender
	Dim event As String = mEventName & "_onDateClick"
	If SubExists(mCallback, event) Then
		CallSub2(mCallback, event, b.Tag)
	End If
End Sub

private Sub cellPanel_LongClick
	Dim b As Panel = Sender
	Dim event As String = mEventName & "_onDateLongClick"
	If SubExists(mCallback, event) Then		
		CallSub2(mCallback, event, b.Tag)
	End If
End Sub