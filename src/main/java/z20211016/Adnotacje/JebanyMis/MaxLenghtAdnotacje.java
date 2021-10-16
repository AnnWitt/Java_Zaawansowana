package z20211016.Adnotacje.JebanyMis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(value = ElementType.FIELD) //do jakich elementow zastosowac
@Target(ElementType.FIELD) //do jakich elementow zastosowac, tożsame z powyzszym bo jedno
@Retention(RetentionPolicy.RUNTIME) //gdzie ma dzialas, podczas runtime
public @interface MaxLenghtAdnotacje { //z @int staje sie dopiero adnotacja
    int maxValue() default 15;
}
