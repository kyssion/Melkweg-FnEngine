package org.mintflow.vertx.http.controller;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
@Inherited
public @interface ParamFromBody {
    String toName() default "";
    boolean toTyp() default false;
}
