package com.dinein.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.dinein.model.DineInForm;

public class DineInMgmtValidator implements Validator  {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return DineInForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"mobNo","phoneNo.required");
	}

}
