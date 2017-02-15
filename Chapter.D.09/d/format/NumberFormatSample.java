package d.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatSample {

	public static void main(String[] args) {
		NumberFormatSample sample = new NumberFormatSample();
		sample.checkNumberFormat();
	}

	private final int DECIMAL = 1;
	private final int ONLY_INTEGER = 2;
	private final int CURRENCY = 3;
	private final int PERCENTAGE = 4;

	public void printFormattedNumber(double number, Locale locale, int type) {
		NumberFormat formatter = null;
		switch (type) {
		case DECIMAL:
			formatter = NumberFormat.getInstance(locale);
//			formatter.setMinimumFractionDigits(10);
//			formatter.setMinimumIntegerDigits(10);
			break;
		case ONLY_INTEGER:
			formatter = NumberFormat.getIntegerInstance(locale);
			break;
		case CURRENCY:
			formatter = NumberFormat.getCurrencyInstance(locale);
			break;
		case PERCENTAGE:
			formatter = NumberFormat.getPercentInstance(locale);
			break;
		default:
			return;
		}
		System.out.println(locale.getCountry() + ":" + formatter.format(number));
	}

	public void checkNumberFormat() {
		double number = 3.1415927;
		// double number=86400.1234;
		int type = DECIMAL;
		// int type=PERCENTAGE;
		// int type=ONLY_INTEGER;
		// int type=CURRENCY;
		printFormattedNumber(number, Locale.KOREA, type);
		printFormattedNumber(number, Locale.US, type);
		printFormattedNumber(number, Locale.FRANCE, type);
		printFormattedNumber(number, Locale.GERMANY, type);
	}

}
