package com.maciejwalkowiak.wiremock.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(WireMockSpringExtension.class)
public @interface EnableWiremock {
    ConfigureWiremock[] value() default {};
}
