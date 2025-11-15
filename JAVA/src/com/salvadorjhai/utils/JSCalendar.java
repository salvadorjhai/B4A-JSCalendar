package com.salvadorjhai.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.Author;
import anywheresoftware.b4a.BA.ShortName;
import anywheresoftware.b4a.BA.Version;

@ShortName("JSCalendar")
@Version(1.0F)
@Author("salvadorjhai")
public class JSCalendar extends AbsObjectWrapper<Calendar> {

	private BA mBA = null;
	private String mEventName = "";
	
    /**
     * Value of the {@code MONTH} field indicating the first month of the
     * year.
     */
    public static final int JANUARY = 0;

    /**
     * Value of the {@code MONTH} field indicating the second month of
     * the year.
     */
    public static final int FEBRUARY = 1;

    /**
     * Value of the {@code MONTH} field indicating the third month of the
     * year.
     */
    public static final int MARCH = 2;

    /**
     * Value of the {@code MONTH} field indicating the fourth month of
     * the year.
     */
    public static final int APRIL = 3;

    /**
     * Value of the {@code MONTH} field indicating the fifth month of the
     * year.
     */
    public static final int MAY = 4;

    /**
     * Value of the {@code MONTH} field indicating the sixth month of the
     * year.
     */
    public static final int JUNE = 5;

    /**
     * Value of the {@code MONTH} field indicating the seventh month of
     * the year.
     */
    public static final int JULY = 6;

    /**
     * Value of the {@code MONTH} field indicating the eighth month of
     * the year.
     */
    public static final int AUGUST = 7;

    /**
     * Value of the {@code MONTH} field indicating the ninth month of the
     * year.
     */
    public static final int SEPTEMBER = 8;

    /**
     * Value of the {@code MONTH} field indicating the tenth month of the
     * year.
     */
    public static final int OCTOBER = 9;

    /**
     * Value of the {@code MONTH} field indicating the eleventh month of
     * the year.
     */
    public static final int NOVEMBER = 10;

    /**
     * Value of the {@code MONTH} field indicating the twelfth month of
     * the year.
     */
    public static final int DECEMBER = 11;

    /**
     * Value of the {@code MONTH} field indicating the thirteenth month
     * of the year. Although {@code GregorianCalendar} does not use this
     * value, lunar calendars do.
     */
    public static final int UNDECIMBER = 12;

    /**
     * Value of the {@code DAY_OF_WEEK} field indicating Sunday.
     */
    public static final int SUNDAY = 1;

    /**
     * Value of the {@code DAY_OF_WEEK} field indicating Monday.
     */
    public static final int MONDAY = 2;

    /**
     * Value of the {@code DAY_OF_WEEK} field indicating Tuesday.
     */
    public static final int TUESDAY = 3;

    /**
     * Value of the {@code DAY_OF_WEEK} field indicating Wednesday.
     */
    public static final int WEDNESDAY = 4;

    /**
     * Value of the {@code DAY_OF_WEEK} field indicating Thursday.
     */
    public static final int THURSDAY = 5;

    /**
     * Value of the {@code DAY_OF_WEEK} field indicating Friday.
     */
    public static final int FRIDAY = 6;

    /**
     * Value of the {@code DAY_OF_WEEK} field indicating Saturday.
     */
    public static final int SATURDAY = 7;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * era, e.g., AD or BC in the Julian calendar. This is a calendar-specific
     * value; see subclass documentation.
     *
     * @see GregorianCalendar#AD
     * @see GregorianCalendar#BC
     */
    public static final int ERA = 0;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * year. This is a calendar-specific value; see subclass documentation.
     */
    public static final int YEAR = 1;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * month. This is a calendar-specific value. The first month of the year is
     * {@code JANUARY}; the last depends on the number of months in a
     * year.
     *
     * @see #JANUARY
     * @see #FEBRUARY
     * @see #MARCH
     * @see #APRIL
     * @see #MAY
     * @see #JUNE
     * @see #JULY
     * @see #AUGUST
     * @see #SEPTEMBER
     * @see #OCTOBER
     * @see #NOVEMBER
     * @see #DECEMBER
     * @see #UNDECIMBER
     */
    public static final int MONTH = 2;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * week number within the current year. The first week of the year, as
     * defined by {@code getFirstDayOfWeek()} and
     * {@code getMinimalDaysInFirstWeek()}, has value 1. Subclasses
     * define the value of {@code WEEK_OF_YEAR} for days before the first
     * week of the year.
     *
     * @see #getFirstDayOfWeek
     * @see #getMinimalDaysInFirstWeek
     */
    public static final int WEEK_OF_YEAR = 3;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * week number within the current month. The first week of the month, as
     * defined by {@code getFirstDayOfWeek()} and
     * {@code getMinimalDaysInFirstWeek()}, has value 1. Subclasses
     * define the value of {@code WEEK_OF_MONTH} for days before the
     * first week of the month.
     *
     * @see #getFirstDayOfWeek
     * @see #getMinimalDaysInFirstWeek
     */
    public static final int WEEK_OF_MONTH = 4;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * day of the month. This is a synonym for {@code DAY_OF_MONTH}. The
     * first day of the month has value 1.
     *
     * @see #DAY_OF_MONTH
     */
    public static final int DATE = 5;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * day of the month. This is a synonym for {@code DATE}. The first
     * day of the month has value 1.
     *
     * @see #DATE
     */
    public static final int DAY_OF_MONTH = 5;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * day number within the current year. The first day of the year has value
     * 1.
     */
    public static final int DAY_OF_YEAR = 6;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * day of the week. This field takes values {@code SUNDAY},
     * {@code MONDAY}, {@code TUESDAY}, {@code WEDNESDAY},
     * {@code THURSDAY}, {@code FRIDAY}, and
     * {@code SATURDAY}.
     *
     * @see #SUNDAY
     * @see #MONDAY
     * @see #TUESDAY
     * @see #WEDNESDAY
     * @see #THURSDAY
     * @see #FRIDAY
     * @see #SATURDAY
     */
    public static final int DAY_OF_WEEK = 7;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * ordinal number of the day of the week within the current month. Together
     * with the {@code DAY_OF_WEEK} field, this uniquely specifies a day
     * within a month. Unlike {@code WEEK_OF_MONTH} and
     * {@code WEEK_OF_YEAR}, this field's value does <em>not</em>
     * depend on {@code getFirstDayOfWeek()} or
     * {@code getMinimalDaysInFirstWeek()}. {@code DAY_OF_MONTH 1}
     * through {@code 7} always correspond to <code>DAY_OF_WEEK_IN_MONTH
     * 1</code>;
     * {@code 8} through {@code 15} correspond to
     * {@code DAY_OF_WEEK_IN_MONTH 2}, and so on.
     * {@code DAY_OF_WEEK_IN_MONTH 0} indicates the week before
     * {@code DAY_OF_WEEK_IN_MONTH 1}. Negative values count back from
     * the end of the month, so the last Sunday of a month is specified as
     * {@code DAY_OF_WEEK = SUNDAY, DAY_OF_WEEK_IN_MONTH = -1}. Because
     * negative values count backward they will usually be aligned differently
     * within the month than positive values. For example, if a month has 31
     * days, {@code DAY_OF_WEEK_IN_MONTH -1} will overlap
     * {@code DAY_OF_WEEK_IN_MONTH 5} and the end of {@code 4}.
     *
     * @see #DAY_OF_WEEK
     * @see #WEEK_OF_MONTH
     */
    public static final int DAY_OF_WEEK_IN_MONTH = 8;

    /**
     * Field number for {@code get} and {@code set} indicating
     * whether the {@code HOUR} is before or after noon. E.g., at
     * 10:04:15.250 PM the {@code AM_PM} is {@code PM}.
     *
     * @see #AM
     * @see #PM
     * @see #HOUR
     */
    public static final int AM_PM = 9;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * hour of the morning or afternoon. {@code HOUR} is used for the
     * 12-hour clock. E.g., at 10:04:15.250 PM the {@code HOUR} is 10.
     *
     * @see #AM_PM
     * @see #HOUR_OF_DAY
     */
    public static final int HOUR = 10;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * hour of the day. {@code HOUR_OF_DAY} is used for the 24-hour
     * clock. E.g., at 10:04:15.250 PM the {@code HOUR_OF_DAY} is 22.
     *
     * @see #HOUR
     */
    public static final int HOUR_OF_DAY = 11;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * minute within the hour. E.g., at 10:04:15.250 PM the {@code MINUTE}
     * is 4.
     */
    public static final int MINUTE = 12;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * second within the minute. E.g., at 10:04:15.250 PM the
     * {@code SECOND} is 15.
     */
    public static final int SECOND = 13;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * millisecond within the second. E.g., at 10:04:15.250 PM the
     * {@code MILLISECOND} is 250.
     */
    public static final int MILLISECOND = 14;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * raw offset from GMT in milliseconds.
     */
    public static final int ZONE_OFFSET = 15;

    /**
     * Field number for {@code get} and {@code set} indicating the
     * daylight savings offset in milliseconds.
     */
    public static final int DST_OFFSET = 16;

    /**
     * This is the total number of fields in this calendar.
     */
    public static final int FIELD_COUNT = 17;

    /**
     * Value of the {@code AM_PM} field indicating the period of the day
     * from midnight to just before noon.
     */
    public static final int AM = 0;

    /**
     * Value of the {@code AM_PM} field indicating the period of the day
     * from noon to just before midnight.
     */
    public static final int PM = 1;

    /**
     * Requests both {@code SHORT} and {@code LONG} styles in the map returned by
     * {@link #getDisplayNames}.
     * @since 1.6
     */
    public static final int ALL_STYLES = 0;

    /**
     * Requests short names (such as "Jan") from
     * {@link #getDisplayName} or {@link #getDisplayNames}.
     * @since 1.6
     */
    public static final int SHORT = 1;

    /**
     * Requests long names (such as "January") from
     * {@link #getDisplayName} or {@link #getDisplayNames}.
     * @since 1.6
     */
    public static final int LONG = 2;

    private static final String[] FIELD_NAMES = { "ERA", "YEAR", "MONTH",
            "WEEK_OF_YEAR", "WEEK_OF_MONTH", "DAY_OF_MONTH", "DAY_OF_YEAR",
            "DAY_OF_WEEK", "DAY_OF_WEEK_IN_MONTH", "AM_PM", "HOUR",
            "HOUR_OF_DAY", "MINUTE", "SECOND", "MILLISECOND",
            "ZONE_OFFSET", "DST_OFFSET" };
	
    /**
     * Constructs a new instance of the {@code Calendar} subclass appropriate for the
     * default {@code Locale}.
     *
     * @return a {@code Calendar} subclass instance set to the current date and time in
     *         the default {@code Timezone}.
     */
	public JSCalendar Initialize(final BA ba) {
		this.mBA = ba; 
		this.setObject(Calendar.getInstance());
		return this;
	}
	
    /**
     * Constructs a new instance of the {@code Calendar} subclass appropriate for the
     * specified {@code Locale}.
     *
     * @param locale
     *            the locale to use.
     * @return a {@code Calendar} subclass instance set to the current date and time.
     */
	public JSCalendar Initialize2(final BA ba,Locale locale) {
		this.mBA = ba;		
		this.setObject(Calendar.getInstance(locale));
		return this;		
	}
	
	/**
     * Constructs a new instance of the {@code Calendar} subclass appropriate for the
     * default {@code Locale}, using the specified {@code TimeZone}.
     *
     * @param timezone
     *            the {@code TimeZone} to use.
     * @return a {@code Calendar} subclass instance set to the current date and time in
     *         the specified timezone.
     */
	public JSCalendar Initialize3(final BA ba,TimeZone timezone) {
		this.mBA = ba;
		this.setObject(Calendar.getInstance(timezone));
		return this;		
	}
	
	/**
     * Constructs a new instance of the {@code Calendar} subclass appropriate for the
     * specified {@code Locale}.
     *
     * @param timezone
     *            the {@code TimeZone} to use.
     * @param locale
     *            the {@code Locale} to use.
     * @return a {@code Calendar} subclass instance set to the current date and time in
     *         the specified timezone.
     */
	public JSCalendar Initialize4(final BA ba,TimeZone timezone, Locale locale) {
		this.mBA = ba;	
		this.setObject(Calendar.getInstance(timezone, locale));
		return this;		
	}
	
	/**
     * Adds the specified amount to a {@code Calendar} field.
     *
     * @param field
     *            the {@code Calendar} field to modify.
     * @param value
     *            the amount to add to the field.
     * @throws IllegalArgumentException
     *                if {@code field} is {@code DST_OFFSET} or {@code
     *                ZONE_OFFSET}.
     */
    public JSCalendar Add(int field, int value) {
    	this.getObjectOrNull().add(field, value);
    	return this;
    }
    
    /**
     * Clears all of the fields of this {@code Calendar}. All fields are initialized to
     * zero.
     */
    public JSCalendar Clear() {
    	this.getObjectOrNull().clear();
    	return this;
    }
    
    /**
     * Gets the value of the specified field after computing the field values by
     * calling {@code complete()} first.
     *
     * @param field
     *            the field to get.
     * @return the value of the specified field.
     *
     * @throws IllegalArgumentException
     *                if the fields are not set, the time is not set, and the
     *                time cannot be computed from the current field values.
     * @throws ArrayIndexOutOfBoundsException
     *                if the field is not inside the range of possible fields.
     *                The range is starting at 0 up to {@code FIELD_COUNT}.
     */
    public int get(int field) {
    	return this.getObjectOrNull().get(field);
    }
    
    /**
     * Gets the minimum value of the specified field for the current date.
     *
     * @param field
     *            the field.
     * @return the minimum value of the specified field.
     */
    public int getActualMinimum(int field) {
    	return this.getObjectOrNull().getActualMinimum(field);
    }
    
    /**
     * Returns an array of locales for which custom {@code Calendar} instances
     * are available.
     * <p>Note that Android does not support user-supplied locale service providers.
     */
    public Locale[] getAvailableLocales() {
    	return this.getObjectOrNull().getAvailableLocales();
    }
    
    /**
     * Gets the first day of the week for this {@code Calendar}.
     *
     * @return the first day of the week.
     */
    public int getFirstDayOfWeek() {
    	return this.getObjectOrNull().getFirstDayOfWeek();
    }
    
    /**
     * Gets the greatest minimum value of the specified field. This is the
     * biggest value that {@code getActualMinimum} can return for any possible
     * time.
     *
     * @param field
     *            the field.
     * @return the greatest minimum value of the specified field.
     */
    public int getGreatestMinimum(int field) {
    	return this.getObjectOrNull().getGreatestMinimum(field);
    }
    
    /**
     * Gets the smallest maximum value of the specified field. This is the
     * smallest value that {@code getActualMaximum()} can return for any
     * possible time.
     *
     * @param field
     *            the field number.
     * @return the smallest maximum value of the specified field.
     */
    public int getLeastMaximum(int field) {
    	return this.getObjectOrNull().getLeastMaximum(field);
    }
    
    /**
     * Gets the greatest maximum value of the specified field. This returns the
     * biggest value that {@code get} can return for the specified field.
     *
     * @param field
     *            the field.
     * @return the greatest maximum value of the specified field.
     */
    public int getMaximum(int field) {
    	return this.getObjectOrNull().getMaximum(field);
    }
    
    /**
     * Gets the minimal days in the first week of the year.
     *
     * @return the minimal days in the first week of the year.
     */
    public int getMinimalDaysInFirstWeek() {
    	return this.getObjectOrNull().getMinimalDaysInFirstWeek();
    }
    
    /**
     * Gets the smallest minimum value of the specified field. this returns the
     * smallest value thet {@code get} can return for the specified field.
     *
     * @param field
     *            the field number.
     * @return the smallest minimum value of the specified field.
     */
    public int getMinimum(int field) {
    	return this.getObjectOrNull().getMinimum(field);
    }
    
    /**
     * Gets the time of this {@code Calendar} as a {@code Date} object.
     *
     * @return a new {@code Date} initialized to the time of this {@code Calendar}.
     *
     * @throws IllegalArgumentException
     *                if the time is not set and the time cannot be computed
     *                from the current field values.
     */
    public Date getTime() {
    	return this.getObjectOrNull().getTime();
    }
    
    /**
     * Computes the time from the fields if required and returns the time.
     *
     * @return the time of this {@code Calendar}.
     *
     * @throws IllegalArgumentException
     *                if the time is not set and the time cannot be computed
     *                from the current field values.
     */
    public long getTimeInMillis() {
    	return this.getObjectOrNull().getTimeInMillis();
    }
    
    /**
     * Gets the timezone of this {@code Calendar}.
     *
     * @return the {@code TimeZone} used by this {@code Calendar}.
     */
    public TimeZone getTimeZone() {
    	return this.getObjectOrNull().getTimeZone();
    }
    
    /**
     * Adds the specified amount to the specified field and wraps the value of
     * the field when it goes beyond the maximum or minimum value for the
     * current date. Other fields will be adjusted as required to maintain a
     * consistent date.
     *
     * @param field
     *            the field to roll.
     * @param value
     *            the amount to add.
     */
    public JSCalendar roll(int field, int value) {
    	this.getObjectOrNull().roll(field, value);
    	return this;
    }
    
    /**
     * Increment or decrement the specified field and wrap the value of the
     * field when it goes beyond the maximum or minimum value for the current
     * date. Other fields will be adjusted as required to maintain a consistent
     * date.
     *
     * @param field
     *            the number indicating the field to roll.
     * @param increment
     *            {@code true} to increment the field, {@code false} to decrement.
     */
    public JSCalendar roll2(int field, boolean increment) {
    	this.getObjectOrNull().roll(field, increment);
    	return this;
    }
    
    /**
     * Sets a field to the specified value.
     *
     * @param field
     *            the code indicating the {@code Calendar} field to modify.
     * @param value
     *            the value.
     */
    public JSCalendar Set(int field, int value) {
    	this.getObjectOrNull().set(field, value);
    	return this;
    }
    
    /**
     * Sets the year, month and day of the month fields. Other fields are not
     * changed.
     *
     * @param year
     *            the year.
     * @param month
     *            the month.
     * @param day
     *            the day of the month.
     */
    public JSCalendar Set2(int year, int month, int day) {
    	this.getObjectOrNull().set(year, month, day);
    	return this;
    }
    
    /**
     * Sets the year, month, day of the month, hour of day and minute fields.
     * Other fields are not changed.
     *
     * @param year
     *            the year.
     * @param month
     *            the month.
     * @param day
     *            the day of the month.
     * @param hourOfDay
     *            the hour of day.
     * @param minute
     *            the minute.
     */
    public JSCalendar Set3(int year, int month, int day, int hourOfDay,
            int minute) {
    	this.getObjectOrNull().set(year, month, day, hourOfDay, minute);
    	return this;
    }
    
    /**
     * Sets the year, month, day of the month, hour of day, minute and second
     * fields. Other fields are not changed.
     *
     * @param year
     *            the year.
     * @param month
     *            the month.
     * @param day
     *            the day of the month.
     * @param hourOfDay
     *            the hour of day.
     * @param minute
     *            the minute.
     * @param second
     *            the second.
     */
    public JSCalendar Set4(int year, int month, int day, int hourOfDay,
            int minute, int second) {
    	this.getObjectOrNull().set(year, month, day, hourOfDay, minute, second);
    	return this;
    }
    
    /**
     * Sets the first day of the week for this {@code Calendar}.
     *
     * @param value
     *            a {@code Calendar} day of the week.
     */
    public JSCalendar SetFirstDayOfWeek(int value) {
    	this.getObjectOrNull().setFirstDayOfWeek(value);
    	return this;
    }
	
    /**
     * Sets the minimal days in the first week of the year.
     *
     * @param value
     *            the minimal days in the first week of the year.
     */
    public JSCalendar SetMinimalDaysInFirstWeek(int value) {
    	this.getObjectOrNull().setMinimalDaysInFirstWeek(value);
    	return this;
    }
    
    /**
     * Sets the time of this {@code Calendar}.
     *
     * @param date
     *            a {@code Date} object.
     */
    public JSCalendar SetTime(Date date) {
    	this.getObjectOrNull().setTime(date);
    	return this;
    }
    
    /**
     * Sets the time of this {@code Calendar}.
     *
     * @param milliseconds
     *            the time as the number of milliseconds since Jan. 1, 1970.
     */
    public JSCalendar SetTimeInMillis(long milliseconds) {
    	this.getObjectOrNull().setTimeInMillis(milliseconds);
    	return this;
    }
    
    /**
     * Sets the {@code TimeZone} used by this Calendar.
     *
     * @param timezone
     *            a {@code TimeZone}.
     */
    public JSCalendar SetTimeZone(TimeZone timezone) {
    	this.getObjectOrNull().setTimeZone(timezone);
    	return this;
    }
    
    /**
     * Returns the string representation of this {@code Calendar}.
     */
    public String ToString() {
    	return this.getObjectOrNull().toString();
    }
    
    /**
     * Returns the string representation of this {@code Calendar}.
     */
    public String ToString2(String pattern) {
    	SimpleDateFormat SF = new SimpleDateFormat(pattern);
    	return SF.format(this.getTime());
    }
    
    /**
     * Returns a human-readable string for the value of {@code field}
     * using the given style and locale. If no string is available, returns null.
     * The value is retrieved by invoking {@code get(field)}.
     *
     * <p>For example, {@code getDisplayName(MONTH, SHORT, Locale.US)} will return "Jan"
     * while {@code getDisplayName(MONTH, LONG, Locale.US)} will return "January".
     *
     * @param field the field
     * @param style {@code SHORT} or {@code LONG}
     * @param locale the locale
     * @return the display name, or null
     * @throws NullPointerException if {@code locale == null}
     * @throws IllegalArgumentException if {@code field} or {@code style} is invalid
     * @since 1.6
     */
    public String getDisplayName(int field, int style, Locale locale) {
    	return this.getObjectOrNull().getDisplayName(field, style, locale);
    }
    
    public int getDayValue() {
    	return this.getObjectOrNull().get(DATE);
    }
 
    public int getMonthValue() {
    	return this.getObjectOrNull().get(MONTH);
    }
    /*
     * 
     */
    public int getYearValue() {
    	return this.getObjectOrNull().get(YEAR);
    }    
 
    public int getDayOfMonthValue() {
    	return this.getObjectOrNull().get(DAY_OF_MONTH);
    }
    /*
     * 
     */
    public int getDayOfWeekValue() {
    	return this.getObjectOrNull().get(DAY_OF_WEEK);
    }
 
    public int getDayOfWeekInMonthValue() {
    	return this.getObjectOrNull().get(DAY_OF_WEEK_IN_MONTH);
    }
 
    public int getDayOfYearValue() {
    	return this.getObjectOrNull().get(DAY_OF_YEAR);
    }
    

    /***
     * Set/Get calendar day value (DATE/DAY_OF_MONTH)
     * @param value
     */
	public void setDayValue(int value) {
		this.getObjectOrNull().set(DATE, value);
	}

	/***
	 * Set/Get calendar month value
	 * @param value
	 */
	public void setMonthValue(int value) {
		this.getObjectOrNull().set(MONTH, value);
	}

	/***
	 * Set/Get calendar year value
	 * @param value
	 */
	public void setYearValue(int value) {
		this.getObjectOrNull().set(YEAR, value);
	}

	/***
	 * Set/Get calendar day of month value
	 * @param value
	 */
	public void setDayOfMonthValue(int value) {
		this.getObjectOrNull().set(DAY_OF_MONTH, value);
	}

	/***
	 * Set/Get calendar day of week value (sunday...saturday)
	 * @param value
	 */
	public void setDayOfWeekValue(int value) {
		this.getObjectOrNull().set(DAY_OF_WEEK, value);
	}

	/***
	 * Set/Get calendar day of week in month value
	 * @param value
	 */
	public void setDayOfWeekInMonthValue(int value) {
		this.getObjectOrNull().set(DAY_OF_WEEK_IN_MONTH, value);
	}

	/***
	 * Set/Get calendar day of year value
	 * @param value
	 */
	public void setDayOfYearValue(int value) {
		this.getObjectOrNull().set(DAY_OF_YEAR, value);
	}
    
    
}
