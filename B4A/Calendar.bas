Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'https://developer.android.com/reference/java/util/Calendar.html
'
'
Sub Class_Globals
	Private jo As JavaObject
	Private cal As JavaObject
	
	'Field number for get and set indicating the era, e.g., AD or BC in the Julian calendar.
	Dim const CONST_ERA As Int = 0
	'Field number for get and set indicating the day of the month. This is a synonym for DAY_OF_MONTH. The first day of the month has value 1
	Dim const CONST_DATE As Int = 5			
	'Field number for get and set indicating the day of the month. This is a synonym for DATE. The first day of the month has value 1.
	Dim const CONST_DAY_OF_MONTH As Int = 5
	'Field number for get and set indicating the day of the week. This field takes values SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY.
	Dim const CONST_DAY_OF_WEEK As Int = 7
	'Field number for get and set indicating the ordinal number of the day of the week within the current month.
	Dim const CONST_DAY_OF_WEEK_IN_MONTH As Int = 8
	'Field number for get and set indicating the day number within the current year. The first day of the year has value 1.
	Dim const CONST_DAY_OF_YEAR As Int = 6
	'Field number for get and set indicating the hour of the morning or afternoon. HOUR is used for the 12-hour clock (0 - 11). Noon and midnight are represented by 0, not by 12. E.g., at 10:04:15.250 PM the HOUR is 10.
	Dim const CONST_HOUR As Int = 10
	'Field number for get and set indicating the hour of the day. HOUR_OF_DAY is used for the 24-hour clock. E.g., at 10:04:15.250 PM the HOUR_OF_DAY is 22.
	Dim const CONST_HOUR_OF_DAY As Int = 11
	'Field number for get and set indicating the millisecond within the second. E.g., at 10:04:15.250 PM the MILLISECOND is 250.
	Dim const CONST_MILLISECOND As Int = 14
	'Field number for get and set indicating the minute within the hour. E.g., at 10:04:15.250 PM the MINUTE is 4.
	Dim const CONST_MINUTE As Int = 12
	'Field number for get and set indicating the month. This is a calendar-specific value. The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0; the last depends on the number of months in a year.
	Dim const CONST_MONTH As Int = 2
	'Field number for get and set indicating the second within the minute. E.g., at 10:04:15.250 PM the SECOND is 15.
	Dim const CONST_SECOND As Int = 13
	'Field number for get and set indicating the week number within the current month.
	Dim const CONST_WEEK_OF_MONTH As Int = 4
	'Field number for get and set indicating the week number within the current year.
	Dim const CONST_WEEK_OF_YEAR As Int = 3	
	'Field number for get and set indicating the year.
	Dim const CONST_YEAR As Int = 1
	'Field number for get and set indicating the raw offset from GMT in milliseconds.
	Dim const CONST_ZONE_OFFSET As Int = 15
End Sub

'Initializes the object. Gets a calendar using the default time zone and locale.
Public Sub Initialize
	jo.InitializeStatic("java.util.Calendar")
	cal = jo.RunMethod("getInstance", Null)
End Sub

'Initializes the object. Sets the values for the calendar fields YEAR, MONTH[0...11], and DAY_OF_MONTH.
Public Sub Initialize2(year As Int, month As Int, date As Int)
	jo.InitializeStatic("java.util.Calendar")
	cal = jo.RunMethod("getInstance", Null)
	cal.RunMethod("set", Array As Object(year, month+1, date))
End Sub

'Initializes the object. Sets the values for the calendar fields YEAR, MONTH[0...11], DAY_OF_MONTH, HOUR_OF_DAY, and MINUTE.
Public Sub Initialize3(year As Int, month As Int, date As Int, hourOfDay As Int, minute As Int)
	jo.InitializeStatic("java.util.Calendar")
	cal = jo.RunMethod("getInstance", Null)
	cal.RunMethod("set", Array As Object(year, month+1, date, hourOfDay, minute))
End Sub

'Initializes the object. Sets the values for the fields YEAR, MONTH[0...11], DAY_OF_MONTH, HOUR_OF_DAY, MINUTE, and SECOND.
Public Sub Initialize4(year As Int, month As Int, date As Int, hourOfDay As Int, minute As Int, second As Int)
	jo.InitializeStatic("java.util.Calendar")
	cal = jo.RunMethod("getInstance", Null)
	cal.RunMethod("set", Array As Object(year, month+1, date, hourOfDay, minute, second))
End Sub

'Returns the value of the given calendar field. 
Public Sub Get(field As String) As Object
	Return cal.RunMethod("get", Array As Object(jo.GetField(field)))
End Sub
'Returns the value of the given calendar field.
Public Sub Get2(constValue As Int) As Object
	Return cal.RunMethod("get", Array As Object(constValue))
End Sub
'Sets the given calendar field to the given value.
Public Sub Set(field As String, value As Object) As Calendar
	cal.RunMethod("set", Array As Object(jo.GetField(field), value))
	Return Me
End Sub
'Sets the given calendar field to the given value.
Public Sub Set2(constValue As Int, value As Object) As Object
	Return cal.RunMethod("set", Array As Object(constValue, value))
End Sub
'Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules.
Public Sub Add(field As String, value As Int) As Calendar
	cal.RunMethod("add", Array As Object(jo.GetField(field), value))
	Return Me
End Sub
'Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules.
Public Sub Add2(constValue As Int, value As Int) As Calendar
	cal.RunMethod("add", Array As Object(constValue, value))
	Return Me
End Sub
'Returns the maximum value that the specified calendar field could have, given the time value of this Calendar.
public Sub getActualMaximum(field As String) As Object
	Return cal.RunMethod("getActualMaximum", Array As Object(jo.GetField(field)))
End Sub

'Gets/Sets what the first day of the week is; e.g., SUNDAY in the U.S., MONDAY in France.
public Sub getFirstDayOfWeek As Int
	Return cal.RunMethod("getFirstDayOfWeek", Null)
End Sub
'Gets/Sets what the first day of the week is; e.g., SUNDAY in the U.S., MONDAY in France.
public Sub setFirstDayOfWeek(value As Int)
	cal.RunMethod("setFirstDayOfWeek", Array As Object(value))
End Sub

'Returns a Date object representing this Calendar's time value (millisecond offset from the Epoch").
public Sub getTime As Object
	Return cal.RunMethod("getTime", Null)
End Sub

'Gets the time zone.
Public Sub getTimeZone As Object
	Return cal.RunMethod("getTimeZone", Null)
End Sub
 
'Get/Set month between [0...11]
Public Sub getMonthValue As Int
	Return Get("MONTH") 
End Sub
'Get/Set month between [0...11]
Public Sub setMonthValue(value As Int)
	Set("MONTH", value)
End Sub

'Get/Set year
Public Sub getYearValue As Int
	Return Get("YEAR")
End Sub
'Get/Set year
Public Sub setYearValue(value As Int)
	Set("YEAR", value)
End Sub

'Get/Set day (day of month) (same as DAY_OF_MONTH)
Public Sub getDayValue As Int
	Return Get("DATE")
End Sub
'Get/Set day (day of month) (same as DAY_OF_MONTH)
Public Sub setDayValue(value As Int)
	Set("DATE", value)
End Sub
'Get/Set day (day of month) (same as DATE)
Public Sub getDayOfMonthValue As Int
	Return getDayValue
End Sub
'Get/Set day (day of month) (same as DATE)
Public Sub setDayOfMonthValue(value As Int)
	setDayValue(value)
End Sub

'Get/Set day of week [1...7][SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
Public Sub getDayOfWeekValue() As Int
	Return Get("DAY_OF_WEEK")
End Sub

'Get/Set day of week [1...7][SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
Public Sub setDayOfWeekValue(value As Int)
	Set("DAY_OF_WEEK", value)
End Sub

'Get/Set day number within the current year.
Public Sub getDayOfYearValue As Int
	Return Get("DAY_OF_YEAR")
End Sub
'Get/Set day number within the current year.
Public Sub setDayOfYearValue(value As Int)
	Set("DAY_OF_YEAR", value)
End Sub

'Return a string representation of this calendar.
Public Sub ToString() As String
	Return cal.RunMethod("toString", Null)
End Sub

'Return to simple format. 
'Refer to: https://developer.android.com/reference/java/text/SimpleDateFormat.html
Public Sub ToString2(format As String) As String
	Dim DateFormat As JavaObject
	DateFormat.InitializeNewInstance("java.text.SimpleDateFormat", Array As String(format))
	Return DateFormat.RunMethod("format", Array As Object(getTime))	
End Sub

'Return weeekdays name [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
Public Sub getWeekdayNames As List
	Return DateUtils.GetDaysNames
End Sub

'Public Sub setDayOfMonth(value As Int)
'	Set("DAY_OF_MONTH", value)
'End Sub
'Public Sub getDayOfMonth As Int
'	Return Get("DAY_OF_MONTH")
'End Sub
