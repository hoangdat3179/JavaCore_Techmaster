package vn.techmaster;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface MyAnnotation {
    String name() default "default value";
    String depcripion();
}
