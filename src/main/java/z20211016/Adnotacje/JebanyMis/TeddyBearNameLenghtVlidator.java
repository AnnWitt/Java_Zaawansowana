package z20211016.Adnotacje.JebanyMis;

import z20211016.Adnotacje.Przyklad.Adnot;

import java.lang.reflect.Field;

public class TeddyBearNameLenghtVlidator {

    public static boolean validate(Object o) {
        Field[] fields=o.getClass().getDeclaredFields();

        for (Field field : fields) {
            MaxLenghtAdnotacje annotation = field.getAnnotation(MaxLenghtAdnotacje.class);
            if (annotation != null) { //czyili bylo opisane
                field.setAccessible(true); // upubliczniam metodę
                String value= null;
                try {
                    value = (String) field.get(o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                //int age = (int) field.get(o); // pobieram wartość pola field z obiektu o
                if (value.length() > annotation.maxValue()) {
                    // weryfikuje wartość z min/max z adnotacji
                    return false;
                } field.setAccessible(false); // uprywatniam metodę
            }
        } return true;
    }

}
