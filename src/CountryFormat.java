import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CountryFormat {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println("today is " + date.toString());

        Locale japan = new Locale(Locale.JAPAN.getLanguage(), Locale.JAPAN.getCountry());
        Locale china = new Locale(Locale.CHINA.getLanguage(), Locale.CHINA.getCountry());
        Locale korea = new Locale(Locale.KOREA.getLanguage(), Locale.KOREA.getCountry());

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, japan);
        System.out.println("Japan: " + dateFormat.format(date));

        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, china);
        System.out.println("China: " + dateFormat1.format(date));

        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, korea);
        System.out.println("Korea: " + dateFormat2.format(date));

    }

}
