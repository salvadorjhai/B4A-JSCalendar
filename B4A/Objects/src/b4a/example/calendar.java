package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class calendar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.calendar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.calendar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvv5 = null;
public anywheresoftware.b4j.object.JavaObject _vv3 = null;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.calendar  _vvvvv3(String _field,int _value) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub Add(field As String, value As Int) As C";
 //BA.debugLineNum = 46;BA.debugLine="cal.RunMethod(\"add\", Array As Object(jo.GetField(";
_vv3.RunMethod("add",new Object[]{_vvvvvvvvv5.GetField(_field),(Object)(_value)});
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4a.example.calendar)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Dim jo As JavaObject";
_vvvvvvvvv5 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 6;BA.debugLine="Dim cal As JavaObject";
_vv3 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public Object  _vvvvv4(String _field) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub Get(field As String) As Object";
 //BA.debugLineNum = 37;BA.debugLine="Return cal.RunMethod(\"get\", Array As Object(jo.Ge";
if (true) return _vv3.RunMethod("get",new Object[]{_vvvvvvvvv5.GetField(_field)});
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvv5(String _field) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="public Sub getActualMaximum(field As String) As Ob";
 //BA.debugLineNum = 51;BA.debugLine="Return cal.RunMethod(\"getActualMaximum\", Array As";
if (true) return _vv3.RunMethod("getActualMaximum",new Object[]{_vvvvvvvvv5.GetField(_field)});
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub getDay As Int";
 //BA.debugLineNum = 93;BA.debugLine="Return Get(\"DATE\")";
if (true) return (int)(BA.ObjectToNumber(_vvvvv4("DATE")));
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return 0;
}
public int  _getvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub getDayOfMonth As Int";
 //BA.debugLineNum = 101;BA.debugLine="Return getDay";
if (true) return _getvvvvvvvv3();
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return 0;
}
public int  _getvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub getDayOfWeek() As Int";
 //BA.debugLineNum = 110;BA.debugLine="Return Get(\"DAY_OF_WEEK\")";
if (true) return (int)(BA.ObjectToNumber(_vvvvv4("DAY_OF_WEEK")));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return 0;
}
public int  _getvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub getDayOfYear As Int";
 //BA.debugLineNum = 120;BA.debugLine="Return Get(\"DAY_OF_YEAR\")";
if (true) return (int)(BA.ObjectToNumber(_vvvvv4("DAY_OF_YEAR")));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return 0;
}
public int  _getvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="public Sub getFirstDayOfWeek As Int";
 //BA.debugLineNum = 56;BA.debugLine="Return cal.RunMethod(\"getFirstDayOfWeek\", Null)";
if (true) return (int)(BA.ObjectToNumber(_vv3.RunMethod("getFirstDayOfWeek",(Object[])(__c.Null))));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return 0;
}
public int  _getvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub getMonth As Int";
 //BA.debugLineNum = 75;BA.debugLine="Return Get(\"MONTH\") + 1";
if (true) return (int) ((double)(BA.ObjectToNumber(_vvvvv4("MONTH")))+1);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return 0;
}
public Object  _getvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="public Sub getTime As Object";
 //BA.debugLineNum = 65;BA.debugLine="Return cal.RunMethod(\"getTime\", Null)";
if (true) return _vv3.RunMethod("getTime",(Object[])(__c.Null));
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public Object  _getvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Public Sub getTimeZone As Object";
 //BA.debugLineNum = 70;BA.debugLine="Return cal.RunMethod(\"getTimeZone\", Null)";
if (true) return _vv3.RunMethod("getTimeZone",(Object[])(__c.Null));
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub getWeekdayNames As List";
 //BA.debugLineNum = 137;BA.debugLine="Return DateUtils.GetDaysNames";
if (true) return _vvvv0._getdaysnames(getActivityBA());
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub getYear As Int";
 //BA.debugLineNum = 84;BA.debugLine="Return Get(\"YEAR\")";
if (true) return (int)(BA.ObjectToNumber(_vvvvv4("YEAR")));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="jo.InitializeStatic(\"java.util.Calendar\")";
_vvvvvvvvv5.InitializeStatic("java.util.Calendar");
 //BA.debugLineNum = 12;BA.debugLine="cal = jo.RunMethod(\"getInstance\", Null)";
_vv3.setObject((java.lang.Object)(_vvvvvvvvv5.RunMethod("getInstance",(Object[])(__c.Null))));
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvv7(int _year,int _month,int _date) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize2(year As Int, month As Int,";
 //BA.debugLineNum = 17;BA.debugLine="jo.InitializeStatic(\"java.util.Calendar\")";
_vvvvvvvvv5.InitializeStatic("java.util.Calendar");
 //BA.debugLineNum = 18;BA.debugLine="cal = jo.RunMethod(\"getInstance\", Null)";
_vv3.setObject((java.lang.Object)(_vvvvvvvvv5.RunMethod("getInstance",(Object[])(__c.Null))));
 //BA.debugLineNum = 19;BA.debugLine="cal.RunMethod(\"set\", Array As Object(year, month+";
_vv3.RunMethod("set",new Object[]{(Object)(_year),(Object)(_month+1),(Object)(_date)});
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvv0(int _year,int _month,int _date,int _hourofday,int _minute) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize3(year As Int, month As Int,";
 //BA.debugLineNum = 24;BA.debugLine="jo.InitializeStatic(\"java.util.Calendar\")";
_vvvvvvvvv5.InitializeStatic("java.util.Calendar");
 //BA.debugLineNum = 25;BA.debugLine="cal = jo.RunMethod(\"getInstance\", Null)";
_vv3.setObject((java.lang.Object)(_vvvvvvvvv5.RunMethod("getInstance",(Object[])(__c.Null))));
 //BA.debugLineNum = 26;BA.debugLine="cal.RunMethod(\"set\", Array As Object(year, month+";
_vv3.RunMethod("set",new Object[]{(Object)(_year),(Object)(_month+1),(Object)(_date),(Object)(_hourofday),(Object)(_minute)});
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvv1(int _year,int _month,int _date,int _hourofday,int _minute,int _second) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize4(year As Int, month As Int,";
 //BA.debugLineNum = 31;BA.debugLine="jo.InitializeStatic(\"java.util.Calendar\")";
_vvvvvvvvv5.InitializeStatic("java.util.Calendar");
 //BA.debugLineNum = 32;BA.debugLine="cal = jo.RunMethod(\"getInstance\", Null)";
_vv3.setObject((java.lang.Object)(_vvvvvvvvv5.RunMethod("getInstance",(Object[])(__c.Null))));
 //BA.debugLineNum = 33;BA.debugLine="cal.RunMethod(\"set\", Array As Object(year, month+";
_vv3.RunMethod("set",new Object[]{(Object)(_year),(Object)(_month+1),(Object)(_date),(Object)(_hourofday),(Object)(_minute),(Object)(_second)});
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public b4a.example.calendar  _vvvvvvv2(String _field,Object _value) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub Set(field As String, value As Object) A";
 //BA.debugLineNum = 41;BA.debugLine="cal.RunMethod(\"set\", Array As Object(jo.GetField(";
_vv3.RunMethod("set",new Object[]{_vvvvvvvvv5.GetField(_field),_value});
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4a.example.calendar)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _setvvvvvvvv3(int _value) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub setDay(value As Int)";
 //BA.debugLineNum = 97;BA.debugLine="Set(\"DATE\", value)";
_vvvvvvv2("DATE",(Object)(_value));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvv4(int _value) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub setDayOfMonth(value As Int)";
 //BA.debugLineNum = 105;BA.debugLine="setDay(value)";
_setvvvvvvvv3(_value);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvv5(int _value) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub setDayOfWeek(value As Int)";
 //BA.debugLineNum = 115;BA.debugLine="Set(\"DAY_OF_WEEK\", value)";
_vvvvvvv2("DAY_OF_WEEK",(Object)(_value));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvv6(int _value) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub setDayOfYear(value As Int)";
 //BA.debugLineNum = 124;BA.debugLine="Set(\"DAY_OF_YEAR\", value)";
_vvvvvvv2("DAY_OF_YEAR",(Object)(_value));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvv7(int _value) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="public Sub setFirstDayOfWeek(value As Int)";
 //BA.debugLineNum = 60;BA.debugLine="cal.RunMethod(\"setFirstDayOfWeek\", Array As Objec";
_vv3.RunMethod("setFirstDayOfWeek",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvv0(int _value) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub setMonth(value As Int)";
 //BA.debugLineNum = 79;BA.debugLine="Set(\"MONTH\", value - 1)";
_vvvvvvv2("MONTH",(Object)(_value-1));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvv4(int _value) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub setYear(value As Int)";
 //BA.debugLineNum = 88;BA.debugLine="Set(\"YEAR\", value)";
_vvvvvvv2("YEAR",(Object)(_value));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvv2(String _format) throws Exception{
anywheresoftware.b4j.object.JavaObject _dateformat = null;
 //BA.debugLineNum = 129;BA.debugLine="Public Sub ToString(format As String) As String";
 //BA.debugLineNum = 130;BA.debugLine="Dim DateFormat As JavaObject";
_dateformat = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 131;BA.debugLine="DateFormat.InitializeNewInstance(\"java.text.Simpl";
_dateformat.InitializeNewInstance("java.text.SimpleDateFormat",(Object[])(new String[]{_format}));
 //BA.debugLineNum = 132;BA.debugLine="Return DateFormat.RunMethod(\"format\", Array As Ob";
if (true) return BA.ObjectToString(_dateformat.RunMethod("format",new Object[]{_getvvvvvvvvv1()}));
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
