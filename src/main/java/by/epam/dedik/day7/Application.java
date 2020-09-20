package by.epam.dedik.day7;

import java.util.Locale;
import java.util.ResourceBundle;

public class Application {
    public static void main(String[] args) {
        getLocale("en", "EN");
        getLocale("ru", "RU");
    }

    public static void getLocale(String language, String country) {
        Locale locale = new Locale(language, country);
        ResourceBundle resourceBundle  = ResourceBundle.getBundle("registration", locale);
        System.out.println(resourceBundle.getString("title"));
        System.out.println(resourceBundle.getString("name"));
        System.out.println(resourceBundle.getString("surname"));
        System.out.println(resourceBundle.getString("email"));
        System.out.println(resourceBundle.getString("password"));
        System.out.println(resourceBundle.getString("confirm"));
    }
}
