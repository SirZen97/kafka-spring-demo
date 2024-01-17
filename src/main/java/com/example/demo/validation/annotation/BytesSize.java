package com.example.demo.validation.annotation;

import com.example.demo.validation.validator.ByteSizeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {ByteSizeValidator.class})
public @interface BytesSize {
    String charsetName()  default "UTF-8";
    int max() default Integer.MAX_VALUE;

    int min()  default 0;

    String message() default "字符串所占字节数超过限制";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
