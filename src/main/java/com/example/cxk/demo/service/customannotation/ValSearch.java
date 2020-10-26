package com.example.cxk.demo.service.customannotation;

import com.example.cxk.demo.service.customannotation.impl.ValidationPhone;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author cxk
 * @date 2020/8/7 9:51
 */
@Constraint(validatedBy= ValidationPhone.class)
public @interface ValSearch {
    String message() default "参数校验不通过，请重新输入";;

    long min();

    long max();


    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
