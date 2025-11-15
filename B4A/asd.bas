Type=Activity
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim cal As JSCalendar
	Dim weekdays As List
	Dim numWeeks As Int = 6
	Dim thisMonth As Int
	Dim thisYear As Int
	Dim thisDay  As Int
	
	Dim lblMonth As Label
	Dim cellHeight As Int
	Dim cellWidth As Int
	Dim SV As ScrollView
	'
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.RemoveAllViews
	
	StartActivity(asdd)
	return 
	
	Dim cal2 As Calendar
	cal2.Initialize
	Log(cal2.Time)
	Log(cal2.DayOfWeek)
'	Log(cal2.TimeZone)
'	Log(cal2.FirstDayOfWeek)
'	Log(cal2.Month)
'	Log(cal2.Day)
'	Log(cal2.Year)
'	cal2.Initialize3(1990, 5, 1, 0, 0)
'	Log(cal2.Time)
'	Log(cal2.ToString("MMMM"))
'		
	cal.Initialize
	thisMonth = cal.MonthValue
	thisYear = cal.YearValue
	thisDay = cal.DayValue
	
	Dim W As Int = Activity.Width / 2
	Dim btnPrev As Button
	btnPrev.Initialize("btnPrev")
	Activity.AddView(btnPrev,0dip, 0dip, W, 50dip)
	btnPrev.Text = "Previous"

	Dim btnNext As Button
	btnNext.Initialize("btnNext")
	Activity.AddView(btnNext, W, 0dip, W, 50dip)
	btnNext.Text = "Next"
	
	'
	lblMonth.Initialize("")
	Activity.AddView(lblMonth, 0dip, 50dip, 100%x, 40dip)
	lblMonth.Color = Colors.White
	lblMonth.TextColor = Colors.Black
	lblMonth.Gravity = Gravity.CENTER
	lblMonth.Text = cal.Month
	
	' create header	
	weekdays = DateUtils.GetDaysNames
	Dim lbl As Label
	Dim T As Int = btnNext.Height + lblMonth.Height, L As Int = 0
	cellWidth = Activity.Width / 7
	For i = 0 To weekdays.Size - 1
		Dim weekday As String = weekdays.Get(i)
		'
		lbl.Initialize("")
		lbl.Color = Colors.White
		lbl.TextColor = Colors.Black
		lbl.Gravity = Gravity.CENTER
		lbl.Text = weekday
		Activity.AddView(lbl, L, T, cellWidth, 40dip)
		L = L + cellWidth
	Next
	
	'cal.getActualMaximum("WEEK_OF_MONTH")
	t = t + 40dip
	cellHeight = ((Activity.Height - t) / 2) / numWeeks
	
	SV.Initialize(1000dip)
	Activity.AddView(SV, 0dip, T, 100%x, cellHeight * numWeeks)

	SetupCalendarView
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnPrev_Click
	cal.MonthValue = cal.MonthValue - 2
	SetupCalendarView
End Sub

Sub btnNext_Click
	cal.MonthValue = cal.MonthValue
	SetupCalendarView
End Sub
 
Sub SetupCalendarView
	SV.Panel.RemoveAllViews
	
	lblMonth.Text = cal.ToString2("MMMM")
	
	cal.DayOfMonthValue = 1
	cal.DayOfMonthValue = cal.DayOfMonthValue + (1 - cal.DayOfWeekValue)
	 
	Dim lbl As Label
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
			
			Dim inMonth As Boolean
			If mMonth = thisMonth Then
				inMonth = True
			End If
			Dim inYear As Boolean
			If mYear = thisYear Then
				inYear = True
			End If
			
			Dim isToday As Boolean
			
			If inYear And inMonth And (mdayOfYear = thisDay) Then
				isToday = True
			End If			
			
			Dim isFirstOfMonth As Boolean
			If mDayOfMonth = 1 Then
				isFirstOfMonth = True
			End If
 		
			Dim dayOfMonth As String = ""
			dayOfMonth = cal.DayOfMonthValue
			If isFirstOfMonth Then
				dayOfMonth = cal.ToString2("MMM") & "/" & dayOfMonth
			End If
			
			'
			lbl.Initialize("")
'			If inMonth = False Then
'				lbl.Color = Colors.LightGray
'			Else
'				lbl.Color = Colors.White
'			End If
			If (mMonth Mod 2) = 0 Then
				lbl.Color = Colors.LightGray
			Else
				lbl.Color = Colors.White
			End If
			
			If isToday Then
				lbl.Typeface = Typeface.DEFAULT_BOLD
				lbl.Color = Colors.White
			End If			
			lbl.TextColor = Colors.Black
			lbl.Gravity = Gravity.CENTER
			lbl.Text = dayOfMonth
			SV.Panel.AddView(lbl, L, T, cellWidth, cellHeight)
			L = L + cellWidth
			 
			cal.DayOfMonthValue = cal.DayOfMonthValue + 1			
		Next		
		t = t + cellHeight		
	Next
End Sub