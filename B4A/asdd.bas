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
	Dim CV As CalendarView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

	Dim W As Int = Activity.Width / 2
	Dim btnPrev As Button
	btnPrev.Initialize("btnPrev")
	Activity.AddView(btnPrev,0dip, 0dip, W, 50dip)
	btnPrev.Text = "Previous"
	'
	Dim btnNext As Button
	btnNext.Initialize("btnNext")
	Activity.AddView(btnNext, W, 0dip, W, 50dip)
	btnNext.Text = "Next"
	'
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0dip, btnNext.Height, 100%x, (Activity.Height - btnNext.Height) / 2)
	'
	CV.Initialize(Me, "calendar")
	CV.FormatHeaderMonth = "MMMM yyyy"
	CV.Build(p)
	'
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
 
Sub btnPrev_Click
	CV.MovePreviousMonth
End Sub

Sub btnNext_Click
	CV.MoveNextMonth
End Sub
 
Sub calendar_onDateClick(data As calendarItem)
	ToastMessageShow(data.date, False)
End Sub

Sub calendar_onDateLongClick(data As calendarItem)
	ToastMessageShow(data.date, False)
	data.panel.Color = Colors.Magenta 	
End Sub

Sub calendar_onDrawWeekdays(label As Label)
	label.Text = label.Text.SubString2(0,3)
	label.Typeface = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Typeface.STYLE_BOLD_ITALIC)
End Sub

Sub calendar_onDrawCalendarItem(data As calendarItem)
	
End Sub

Sub calendar_onDrawMonth(label As Label)
	label.Typeface = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Typeface.STYLE_BOLD_ITALIC)
	label.TextSize = 18
End Sub