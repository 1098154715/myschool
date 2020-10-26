package com.example.cxk.demo.service.customannotation.impl;

import com.example.cxk.demo.service.customannotation.ValSearch;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author cxk
 * @date 2020/8/7 9:59
 */
public class ValidationPhone  implements ConstraintValidator<ValSearch,Object> {
    private  long min=1;
    private  long max=1;
    @Override
    public void initialize(ValSearch constraintAnnotation) {
        min=constraintAnnotation.min();
        max=constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if(o == null){
            return true;
        }

        if(o.toString().trim().length()>=min && o.toString().trim().length()<=max){
            return true;
        }

        return false;
    }
}
