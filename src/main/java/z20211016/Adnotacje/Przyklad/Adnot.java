package z20211016.Adnotacje.Przyklad;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Adnot {
    @Target(value = ElementType.FIELD)
    @Retention(value = RetentionPolicy.RUNTIME)
    public @interface MinMaxValue {
        int minValue();
        int maxValue() default 10;
    }
}
