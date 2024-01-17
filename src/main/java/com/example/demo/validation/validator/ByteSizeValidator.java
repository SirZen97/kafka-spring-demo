package com.example.demo.validation.validator;

import com.example.demo.validation.annotation.BytesSize;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.nio.charset.Charset;

public class ByteSizeValidator implements ConstraintValidator<BytesSize,String> {
    private int max;
    private int min;
    private String charsetName;
    @Override
    public void initialize(BytesSize constraintAnnotation) {
        max = constraintAnnotation.max();
        min = constraintAnnotation.min();
        charsetName = constraintAnnotation.charsetName();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s==null||s.isEmpty()){
            return true;
        }
        int bytesOfStr = s.getBytes(Charset.forName(charsetName)).length;
        return bytesOfStr<=max&&bytesOfStr>=min;
    }
}
