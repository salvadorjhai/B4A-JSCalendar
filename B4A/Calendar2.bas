Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	Dim jo As JavaObject
	jo.InitializeNewInstance("Calendar2", Null)
	jo.RunMethod("DrawWidget", Null)
End Sub

#if JAVA
import java.text.*;
import java.util.Calendar;

public void DrawWidget() {
	int numWeeks = 6;
	Calendar cal = Calendar.getInstance();
    int today = cal.get(Calendar.DAY_OF_YEAR);
    int todayYear = cal.get(Calendar.YEAR);
    int thisMonth = cal.get(Calendar.MONTH);
	
	int todayDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	cal.add(Calendar.DAY_OF_MONTH, 1 - todayDayOfWeek);
	
	DateFormatSymbols dfs = DateFormatSymbols.getInstance();
    String[] weekdays = dfs.getShortWeekdays();
    for (int day = Calendar.SUNDAY; day <= Calendar.SATURDAY; day++) {
        String weekday = weekdays[day];
		BA.Log(weekday);
    }
	
	
}
#End If