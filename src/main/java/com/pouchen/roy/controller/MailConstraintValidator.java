package com.pouchen.roy.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.cfg.context.Constrainable;

import com.pouchen.roy.controller.customvalid.Mail;

public class MailConstraintValidator implements ConstraintValidator<Mail, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean result = value.contains("@pouchen.com");
		return result;
	}
	
}
