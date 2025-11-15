package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class calendarview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.calendarview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.calendarview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.salvadorjhai.utils.JSCalendar _vv3 = null;
public anywheresoftware.b4a.objects.collections.List _vv4 = null;
public int _vv5 = 0;
public int _vv6 = 0;
public int _vv7 = 0;
public int _vv0 = 0;
public anywheresoftware.b4a.objects.PanelWrapper _vvv1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvv2 = null;
public int _vvv3 = 0;
public int _vvv4 = 0;
public anywheresoftware.b4a.objects.PanelWrapper _vvv5 = null;
public Object _vvv6 = null;
public String _vvv7 = "";
public String _vvv0 = "";
public String _vvvv1 = "";
public int _vvvv2 = 0;
public int _vvvv3 = 0;
public boolean _vvvv4 = false;
public int _vvvv5 = 0;
public boolean _vvvv6 = false;
public boolean _vvvv7 = false;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public static class _calendaritem{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.PanelWrapper panel;
public String date;
public void Initialize() {
IsInitialized = true;
panel = new anywheresoftware.b4a.objects.PanelWrapper();
date = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _v5(anywheresoftware.b4a.objects.PanelWrapper _v) throws Exception{
String _event = "";
int _t = 0;
int _l = 0;
int _i = 0;
String _weekday = "";
anywheresoftware.b4a.objects.LabelWrapper _lblweekdays = null;
 //BA.debugLineNum = 71;BA.debugLine="Public Sub Build(v As Panel)";
 //BA.debugLineNum = 72;BA.debugLine="mContainer = v";
_vvv1 = _v;
 //BA.debugLineNum = 73;BA.debugLine="mContainer.RemoveAllViews";
_vvv1.RemoveAllViews();
 //BA.debugLineNum = 76;BA.debugLine="lblMonth.Initialize(\"\")";
_vvv2.Initialize(ba,"");
 //BA.debugLineNum = 77;BA.debugLine="mContainer.AddView(lblMonth, 0dip, 0dip, mContain";
_vvv1.AddView((android.view.View)(_vvv2.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),_vvv1.getWidth(),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 78;BA.debugLine="lblMonth.Color = Colors.White";
_vvv2.setColor(__c.Colors.White);
 //BA.debugLineNum = 79;BA.debugLine="lblMonth.TextColor = Colors.Black";
_vvv2.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 80;BA.debugLine="lblMonth.Gravity = Gravity.CENTER";
_vvv2.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 81;BA.debugLine="lblMonth.Text = GetMonth";
_vvv2.setText(BA.ObjectToCharSequence(_v6()));
 //BA.debugLineNum = 82;BA.debugLine="If ShowHeaderMonth = False Then lblMonth.Height =";
if (_vvvv6==__c.False) { 
_vvv2.setHeight(__c.DipToCurrent((int) (0)));};
 //BA.debugLineNum = 84;BA.debugLine="Dim event As String = mEventName & \"_onDrawMonth\"";
_event = _vvv7+"_onDrawMonth";
 //BA.debugLineNum = 85;BA.debugLine="If SubExists(mCallback, event) Then";
if (__c.SubExists(ba,_vvv6,_event)) { 
 //BA.debugLineNum = 86;BA.debugLine="CallSubDelayed2(mCallback, event, lblMonth)";
__c.CallSubDelayed2(ba,_vvv6,_event,(Object)(_vvv2));
 };
 //BA.debugLineNum = 91;BA.debugLine="Dim T As Int = lblMonth.Height, L As Int = 0";
_t = _vvv2.getHeight();
_l = (int) (0);
 //BA.debugLineNum = 92;BA.debugLine="cellWidth = Ceil(mContainer.Width / 7)";
_vvv4 = (int) (__c.Ceil(_vvv1.getWidth()/(double)7));
 //BA.debugLineNum = 93;BA.debugLine="cellHeight = 50dip";
_vvv3 = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 94;BA.debugLine="If ShowHeaderWeekdays = False Then cellHeight = 0";
if (_vvvv7==__c.False) { 
_vvv3 = __c.DipToCurrent((int) (0));};
 //BA.debugLineNum = 95;BA.debugLine="weekdays = DateUtils.GetDaysNames";
_vv4 = _vvvv0._getdaysnames(ba);
 //BA.debugLineNum = 96;BA.debugLine="For i = 0 To weekdays.Size - 1";
{
final int step19 = 1;
final int limit19 = (int) (_vv4.getSize()-1);
_i = (int) (0) ;
for (;(step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19) ;_i = ((int)(0 + _i + step19))  ) {
 //BA.debugLineNum = 97;BA.debugLine="Dim weekday As String = weekdays.Get(i)";
_weekday = BA.ObjectToString(_vv4.Get(_i));
 //BA.debugLineNum = 99;BA.debugLine="Private lblWeekdays As Label";
_lblweekdays = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 100;BA.debugLine="lblWeekdays.Initialize(\"\")";
_lblweekdays.Initialize(ba,"");
 //BA.debugLineNum = 101;BA.debugLine="mContainer.AddView(lblWeekdays, L, T, cellWidth,";
_vvv1.AddView((android.view.View)(_lblweekdays.getObject()),_l,_t,_vvv4,_vvv3);
 //BA.debugLineNum = 103;BA.debugLine="lblWeekdays.Color = Colors.White";
_lblweekdays.setColor(__c.Colors.White);
 //BA.debugLineNum = 104;BA.debugLine="lblWeekdays.TextColor = Colors.Black";
_lblweekdays.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 105;BA.debugLine="lblWeekdays.Gravity = Gravity.CENTER";
_lblweekdays.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 106;BA.debugLine="lblWeekdays.Text = weekday";
_lblweekdays.setText(BA.ObjectToCharSequence(_weekday));
 //BA.debugLineNum = 108;BA.debugLine="Dim event As String = mEventName & \"_onDrawWeekd";
_event = _vvv7+"_onDrawWeekdays";
 //BA.debugLineNum = 109;BA.debugLine="If SubExists(mCallback, event) Then";
if (__c.SubExists(ba,_vvv6,_event)) { 
 //BA.debugLineNum = 110;BA.debugLine="CallSubDelayed2(mCallback, event, lblWeekdays)";
__c.CallSubDelayed2(ba,_vvv6,_event,(Object)(_lblweekdays));
 };
 //BA.debugLineNum = 113;BA.debugLine="L = L + cellWidth";
_l = (int) (_l+_vvv4);
 }
};
 //BA.debugLineNum = 115;BA.debugLine="t = t + cellHeight 'month height + weekdays heigh";
_t = (int) (_t+_vvv3);
 //BA.debugLineNum = 118;BA.debugLine="cellHeight = (mContainer.Height - t) / numWeeks '";
_vvv3 = (int) ((_vvv1.getHeight()-_t)/(double)_vv5);
 //BA.debugLineNum = 120;BA.debugLine="mContainerDate.Initialize(\"\")";
_vvv5.Initialize(ba,"");
 //BA.debugLineNum = 121;BA.debugLine="mContainer.AddView(mContainerDate, 0dip, T, mCont";
_vvv1.AddView((android.view.View)(_vvv5.getObject()),__c.DipToCurrent((int) (0)),_t,_vvv1.getWidth(),(int) (_vvv3*_vv5));
 //BA.debugLineNum = 123;BA.debugLine="redraw";
_vv1();
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _cellpanel_click() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _b = null;
String _event = "";
 //BA.debugLineNum = 228;BA.debugLine="private Sub cellPanel_Click";
 //BA.debugLineNum = 229;BA.debugLine="Dim b As Panel = Sender";
_b = new anywheresoftware.b4a.objects.PanelWrapper();
_b.setObject((android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 230;BA.debugLine="Dim event As String = mEventName & \"_onDateClick\"";
_event = _vvv7+"_onDateClick";
 //BA.debugLineNum = 231;BA.debugLine="If SubExists(mCallback, event) Then";
if (__c.SubExists(ba,_vvv6,_event)) { 
 //BA.debugLineNum = 232;BA.debugLine="CallSub2(mCallback, event, b.Tag)";
__c.CallSubNew2(ba,_vvv6,_event,_b.getTag());
 };
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _cellpanel_longclick() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _b = null;
String _event = "";
 //BA.debugLineNum = 236;BA.debugLine="private Sub cellPanel_LongClick";
 //BA.debugLineNum = 237;BA.debugLine="Dim b As Panel = Sender";
_b = new anywheresoftware.b4a.objects.PanelWrapper();
_b.setObject((android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 238;BA.debugLine="Dim event As String = mEventName & \"_onDateLongCl";
_event = _vvv7+"_onDateLongClick";
 //BA.debugLineNum = 239;BA.debugLine="If SubExists(mCallback, event) Then";
if (__c.SubExists(ba,_vvv6,_event)) { 
 //BA.debugLineNum = 240;BA.debugLine="CallSub2(mCallback, event, b.Tag)";
__c.CallSubNew2(ba,_vvv6,_event,_b.getTag());
 };
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Type calendarItem(panel As Panel, date As String)";
;
 //BA.debugLineNum = 10;BA.debugLine="Private cal As JSCalendar";
_vv3 = new com.salvadorjhai.utils.JSCalendar();
 //BA.debugLineNum = 12;BA.debugLine="Private weekdays As List";
_vv4 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Private numWeeks As Int = 6";
_vv5 = (int) (6);
 //BA.debugLineNum = 14;BA.debugLine="Private thisMonth As Int";
_vv6 = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private thisYear As Int";
_vv7 = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private thisDay  As Int";
_vv0 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private mContainer As Panel";
_vvv1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lblMonth As Label";
_vvv2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private cellHeight As Int = 50dip";
_vvv3 = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 24;BA.debugLine="Private cellWidth As Int";
_vvv4 = 0;
 //BA.debugLineNum = 25;BA.debugLine="Private mContainerDate As Panel";
_vvv5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private mCallback As Object";
_vvv6 = new Object();
 //BA.debugLineNum = 28;BA.debugLine="Private mEventName As String";
_vvv7 = "";
 //BA.debugLineNum = 31;BA.debugLine="Public FormatHeaderMonth As String = \"MMMM\"";
_vvv0 = "MMMM";
 //BA.debugLineNum = 33;BA.debugLine="Public FormatCalendarDateItem As String = \"MM-dd-";
_vvvv1 = "MM-dd-yyyy";
 //BA.debugLineNum = 34;BA.debugLine="Public CalendarMonthItemColor As Int = Colors.Whi";
_vvvv2 = __c.Colors.White;
 //BA.debugLineNum = 35;BA.debugLine="Public CalendarMonthItemAlternateColor As Int = C";
_vvvv3 = __c.Colors.LightGray;
 //BA.debugLineNum = 36;BA.debugLine="Public HighlightCurrentDate As Boolean = True";
_vvvv4 = __c.True;
 //BA.debugLineNum = 37;BA.debugLine="Public HighlightCurrentDateColor As Int = Colors.";
_vvvv5 = __c.Colors.Cyan;
 //BA.debugLineNum = 38;BA.debugLine="Public ShowHeaderMonth As Boolean = True";
_vvvv6 = __c.True;
 //BA.debugLineNum = 39;BA.debugLine="Public ShowHeaderWeekdays As Boolean = True";
_vvvv7 = __c.True;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _v6() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub GetMonth As String";
 //BA.debugLineNum = 58;BA.debugLine="Return cal.ToString2(FormatHeaderMonth)";
if (true) return _vv3.ToString2(_vvv0);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4a.example.calendarview  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize(callback As Object, EventNam";
 //BA.debugLineNum = 47;BA.debugLine="cal.Initialize";
_vv3.Initialize(ba);
 //BA.debugLineNum = 49;BA.debugLine="thisMonth = cal.MonthValue";
_vv6 = _vv3.getMonthValue();
 //BA.debugLineNum = 50;BA.debugLine="thisYear = cal.YearValue";
_vv7 = _vv3.getYearValue();
 //BA.debugLineNum = 51;BA.debugLine="thisDay = cal.DayValue";
_vv0 = _vv3.getDayValue();
 //BA.debugLineNum = 52;BA.debugLine="mCallback = callback";
_vvv6 = _callback;
 //BA.debugLineNum = 53;BA.debugLine="mEventName = EventName";
_vvv7 = _eventname;
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4a.example.calendarview)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public String  _v7() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub MoveNextMonth";
 //BA.debugLineNum = 67;BA.debugLine="cal.MonthValue = cal.MonthValue";
_vv3.setMonthValue(_vv3.getMonthValue());
 //BA.debugLineNum = 68;BA.debugLine="redraw";
_vv1();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _v0() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub MovePreviousMonth";
 //BA.debugLineNum = 62;BA.debugLine="cal.MonthValue = cal.MonthValue - 2";
_vv3.setMonthValue((int) (_vv3.getMonthValue()-2));
 //BA.debugLineNum = 63;BA.debugLine="redraw";
_vv1();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _vv1() throws Exception{
int _t = 0;
int _week = 0;
int _l = 0;
int _day = 0;
int _mdayofyear = 0;
int _mmonth = 0;
int _myear = 0;
int _mdayofmonth = 0;
boolean _inmonth = false;
boolean _inyear = false;
boolean _istoday = false;
boolean _isfirstofmonth = false;
String _datetext = "";
anywheresoftware.b4a.objects.PanelWrapper _cellpanel = null;
b4a.example.calendarview._calendaritem _calitem = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _event = "";
 //BA.debugLineNum = 131;BA.debugLine="Private Sub redraw";
 //BA.debugLineNum = 132;BA.debugLine="mContainerDate.RemoveAllViews";
_vvv5.RemoveAllViews();
 //BA.debugLineNum = 135;BA.debugLine="lblMonth.Text = GetMonth";
_vvv2.setText(BA.ObjectToCharSequence(_v6()));
 //BA.debugLineNum = 138;BA.debugLine="cal.DayOfMonthValue = 1";
_vv3.setDayOfMonthValue((int) (1));
 //BA.debugLineNum = 139;BA.debugLine="cal.DayOfMonthValue = cal.DayOfMonthValue + (1 -";
_vv3.setDayOfMonthValue((int) (_vv3.getDayOfMonthValue()+(1-_vv3.getDayOfWeekValue())));
 //BA.debugLineNum = 141;BA.debugLine="Dim T As Int = 0";
_t = (int) (0);
 //BA.debugLineNum = 143;BA.debugLine="For week = 1 To numWeeks";
{
final int step6 = 1;
final int limit6 = _vv5;
_week = (int) (1) ;
for (;(step6 > 0 && _week <= limit6) || (step6 < 0 && _week >= limit6) ;_week = ((int)(0 + _week + step6))  ) {
 //BA.debugLineNum = 144;BA.debugLine="Dim L As Int = 0";
_l = (int) (0);
 //BA.debugLineNum = 145;BA.debugLine="For day = 1 To weekdays.Size";
{
final int step8 = 1;
final int limit8 = _vv4.getSize();
_day = (int) (1) ;
for (;(step8 > 0 && _day <= limit8) || (step8 < 0 && _day >= limit8) ;_day = ((int)(0 + _day + step8))  ) {
 //BA.debugLineNum = 150;BA.debugLine="Dim mdayOfYear As Int = cal.DayValue";
_mdayofyear = _vv3.getDayValue();
 //BA.debugLineNum = 151;BA.debugLine="Dim mMonth As Int = cal.MonthValue";
_mmonth = _vv3.getMonthValue();
 //BA.debugLineNum = 152;BA.debugLine="Dim mYear As Int = cal.YearValue";
_myear = _vv3.getYearValue();
 //BA.debugLineNum = 153;BA.debugLine="Dim mDayOfMonth As Int = cal.DayOfMonthValue";
_mdayofmonth = _vv3.getDayOfMonthValue();
 //BA.debugLineNum = 156;BA.debugLine="Dim inMonth As Boolean";
_inmonth = false;
 //BA.debugLineNum = 157;BA.debugLine="If mMonth = thisMonth Then";
if (_mmonth==_vv6) { 
 //BA.debugLineNum = 158;BA.debugLine="inMonth = True";
_inmonth = __c.True;
 };
 //BA.debugLineNum = 162;BA.debugLine="Dim inYear As Boolean";
_inyear = false;
 //BA.debugLineNum = 163;BA.debugLine="If mYear = thisYear Then";
if (_myear==_vv7) { 
 //BA.debugLineNum = 164;BA.debugLine="inYear = True";
_inyear = __c.True;
 };
 //BA.debugLineNum = 168;BA.debugLine="Dim isToday As Boolean";
_istoday = false;
 //BA.debugLineNum = 169;BA.debugLine="If inYear And inMonth And (mdayOfYear = thisDay";
if (_inyear && _inmonth && (_mdayofyear==_vv0)) { 
 //BA.debugLineNum = 170;BA.debugLine="isToday = True";
_istoday = __c.True;
 };
 //BA.debugLineNum = 174;BA.debugLine="Dim isFirstOfMonth As Boolean";
_isfirstofmonth = false;
 //BA.debugLineNum = 175;BA.debugLine="Dim dateText As String = mDayOfMonth";
_datetext = BA.NumberToString(_mdayofmonth);
 //BA.debugLineNum = 176;BA.debugLine="If mDayOfMonth = 1 Then isFirstOfMonth = True";
if (_mdayofmonth==1) { 
_isfirstofmonth = __c.True;};
 //BA.debugLineNum = 177;BA.debugLine="If isFirstOfMonth Then dateText = cal.ToString2";
if (_isfirstofmonth) { 
_datetext = _vv3.ToString2("MMM")+"/"+BA.NumberToString(_mdayofmonth);};
 //BA.debugLineNum = 180;BA.debugLine="Private cellPanel As Panel";
_cellpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 181;BA.debugLine="cellPanel.Initialize(\"cellPanel\")";
_cellpanel.Initialize(ba,"cellPanel");
 //BA.debugLineNum = 184;BA.debugLine="Dim calItem As calendarItem";
_calitem = new b4a.example.calendarview._calendaritem();
 //BA.debugLineNum = 185;BA.debugLine="calItem.Initialize";
_calitem.Initialize();
 //BA.debugLineNum = 186;BA.debugLine="calItem.panel = cellPanel";
_calitem.panel = _cellpanel;
 //BA.debugLineNum = 187;BA.debugLine="calItem.date = cal.ToString2(FormatCalendarDate";
_calitem.date = _vv3.ToString2(_vvvv1);
 //BA.debugLineNum = 188;BA.debugLine="cellPanel.Tag = calItem";
_cellpanel.setTag((Object)(_calitem));
 //BA.debugLineNum = 190;BA.debugLine="mContainerDate.AddView(cellPanel, L, T, cellWid";
_vvv5.AddView((android.view.View)(_cellpanel.getObject()),_l,_t,_vvv4,_vvv3);
 //BA.debugLineNum = 191;BA.debugLine="If (mMonth Mod 2) = 0 Then";
if ((_mmonth%2)==0) { 
 //BA.debugLineNum = 192;BA.debugLine="cellPanel.Color = CalendarMonthItemAlternateCo";
_cellpanel.setColor(_vvvv3);
 }else {
 //BA.debugLineNum = 194;BA.debugLine="cellPanel.Color = CalendarMonthItemColor";
_cellpanel.setColor(_vvvv2);
 };
 //BA.debugLineNum = 196;BA.debugLine="If isToday Then";
if (_istoday) { 
 //BA.debugLineNum = 197;BA.debugLine="cellPanel.Color = CalendarMonthItemColor";
_cellpanel.setColor(_vvvv2);
 };
 //BA.debugLineNum = 201;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 202;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 203;BA.debugLine="If isToday And HighlightCurrentDate = True Then";
if (_istoday && _vvvv4==__c.True) { 
 //BA.debugLineNum = 204;BA.debugLine="lbl.Color = HighlightCurrentDateColor";
_lbl.setColor(_vvvv5);
 //BA.debugLineNum = 205;BA.debugLine="lbl.Typeface = Typeface.DEFAULT_BOLD";
_lbl.setTypeface(__c.Typeface.DEFAULT_BOLD);
 };
 //BA.debugLineNum = 207;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 208;BA.debugLine="lbl.Gravity = Gravity.CENTER";
_lbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 209;BA.debugLine="lbl.Text = dateText";
_lbl.setText(BA.ObjectToCharSequence(_datetext));
 //BA.debugLineNum = 212;BA.debugLine="cellPanel.AddView(lbl, 0dip, 0dip, cellWidth, c";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),_vvv4,_vvv3);
 //BA.debugLineNum = 214;BA.debugLine="Dim event As String = mEventName & \"_onDrawCale";
_event = _vvv7+"_onDrawCalendarItem";
 //BA.debugLineNum = 215;BA.debugLine="If SubExists(mCallback, event) Then";
if (__c.SubExists(ba,_vvv6,_event)) { 
 //BA.debugLineNum = 216;BA.debugLine="CallSubDelayed2(mCallback, event, calItem)";
__c.CallSubDelayed2(ba,_vvv6,_event,(Object)(_calitem));
 };
 //BA.debugLineNum = 220;BA.debugLine="cal.DayOfMonthValue = cal.DayOfMonthValue + 1";
_vv3.setDayOfMonthValue((int) (_vv3.getDayOfMonthValue()+1));
 //BA.debugLineNum = 221;BA.debugLine="L = L + cellWidth";
_l = (int) (_l+_vvv4);
 }
};
 //BA.debugLineNum = 223;BA.debugLine="t = t + cellHeight";
_t = (int) (_t+_vvv3);
 }
};
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _vv2() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub Refresh";
 //BA.debugLineNum = 128;BA.debugLine="Build(mContainer)";
_v5(_vvv1);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
