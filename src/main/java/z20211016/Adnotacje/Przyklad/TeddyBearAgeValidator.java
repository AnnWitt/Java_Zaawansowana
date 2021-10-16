package z20211016.Adnotacje.Przyklad;

import java.lang.reflect.Field;

public class TeddyBearAgeValidator {

    public static boolean validate(Object o) throws IllegalAccessException {
        // z obiektu pobieram jego pola
        Field[] fields = o.getClass().getDeclaredFields();
        // dla każdego pola robie sprawdzenie czy posiada moja adnotacje
        for (Field field : fields) {
            Adnot.MinMaxValue annotation = field.getAnnotation(Adnot.MinMaxValue.class);
            if (annotation != null) { // dla adnotacji weryfikuje czy istnieje
                // (jeśli nie istnieje: annotation == null)
                field.setAccessible(true); // upubliczniam metodę
                int age = (int) field.get(o); // pobieram wartość pola field z obiektu o
                if (age < annotation.minValue() || age > annotation.maxValue()) {
                    // weryfikuje wartość z min/max z adnotacji
                    return false;
                    // wartość wykracza poza zakres
                } field.setAccessible(false); // uprywatniam metodę
            }
        } return true;
    }
}

