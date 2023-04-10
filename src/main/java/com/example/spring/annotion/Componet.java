package com.example.spring.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Componet {
    String value() default "";
}
