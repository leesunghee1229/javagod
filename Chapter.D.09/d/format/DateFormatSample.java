package d.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatSample {

	public static void main(String[] args) {
		DateFormatSample sample = new DateFormatSample();
		// sample.checkDateFormat();
		sample.checkSimpleDateFormat();
	}

	private final static int DATE = 1;
	private final static int TIME = 2;
	private final static int DATE_TIME = 3;

	public void checkDateFormat() {
		Date currentDate = new Date(1328054400000L);
		int style = DateFormat.DEFAULT;
		// int style=DateFormat.FULL;
		// int style=DateFormat.LONG;
		// int style=DateFormat.MEDIUM;
		// int style=DateFormat.SHORT;
		int formatType = DATE;
		// int formatType=TIME;
		// int formatType=DATE_TIME;
		printFormattedDateTime(currentDate, Locale.KOREA, style, formatType);
		printFormattedDateTime(currentDate, Locale.US, style, formatType);
		printFormattedDateTime(currentDate, Locale.FRANCE, style, formatType);
		printFormattedDateTime(currentDate, Locale.GERMANY, style, formatType);
	}

	public void printFormattedDateTime(Date date, Locale locale, int style, int formatType) {
		DateFormat formatter;
		switch (formatType) {
		case DATE:
			formatter = DateFormat.getDateInstance(style, locale);
			break;
		case TIME:
			formatter = DateFormat.getTimeInstance(style, locale);
			break;
		case DATE_TIME:
			formatter = DateFormat.getDateTimeInstance(style, style, locale);
			break;
		default:
			return;
		}
		String result = formatter.format(date);
		System.out.println(locale.getCountry() + ":" + result);
	}

	public void checkSimpleDateFormat() {
		Date date = new Date(1328054400000L);
		String pattern = "yyyy/MM/dd hh:mm";
		printDateWithPattern(pattern, date);
		
		pattern="MMM dÀÏ EEE";
		printDateWithPattern(pattern,date);

	}

	public void printDateWithPattern(String pattern, Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat();
		formatter.applyPattern(pattern);
		System.out.println(pattern + " => " + formatter.format(date));
	}

	
}
