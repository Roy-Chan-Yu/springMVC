package com.pouchen.roy.controller.customvalid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.pouchen.roy.controller.MailConstraintValidator;

@Constraint(validatedBy = MailConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Mail {
	//error message
	public String message() default "must contain @pouchen.com";
	//represents group of constraints     
    public Class<?>[] groups() default {};  
    //represents additional information about annotation  
    public Class<? extends Payload>[] payload() default {}; 
}
