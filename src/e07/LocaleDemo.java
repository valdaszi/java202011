package e07;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        System.out.println(Arrays.asList(locales));


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        locale = Locale.JAPAN;
        System.out.println(locale);
        Locale.setDefault(locale);

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        locale = Locale.forLanguageTag("lt"); // "lt_LT"
        System.out.println(locale);
        Locale.setDefault(locale);

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        System.out.println(1234567.12);

        // Skaiciai:

        NumberFormat numberFormatter = NumberFormat.getNumberInstance();
        System.out.println(numberFormatter.format(1234567.12));

        numberFormatter = NumberFormat.getNumberInstance(Locale.JAPAN);
        System.out.println(numberFormatter.format(1234567.12));

        numberFormatter = NumberFormat.getNumberInstance(Locale.GERMANY);
        System.out.println(numberFormatter.format(1234567.12));

        // Pinigai:

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        currencyFormatter.setCurrency(Currency.getInstance("USD"));
        currencyFormatter.setGroupingUsed(false);
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));
    }

}
