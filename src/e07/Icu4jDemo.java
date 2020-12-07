package e07;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

import java.util.Locale;


public class Icu4jDemo {

    public static void main(String[] args) {

        double x = 12345.67;

        NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();

        String str = numberFormatter.format(x);

        System.out.println(str);

        RuleBasedNumberFormat ruleBasedNumberFormatter = new RuleBasedNumberFormat(
                new ULocale("lt", "LT"), RuleBasedNumberFormat.SPELLOUT);

        System.out.println(ruleBasedNumberFormatter.format(x));

    }
}
