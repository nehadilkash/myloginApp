package com.neha.mylogin.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.neha.mylogin.model.User;

@Component
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		User user=(User) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		
		
		if(user.getUsername().length()<6||user.getUsername().length()>8)
		{
			errors.rejectValue("username", "Size.userForm.username");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if(user.getPassword().length()<6||user.getPassword().length()>8)
		{
			errors.rejectValue("password", "Size.userForm.username");
		}
		if(!user.getPassword().equals(user.getPasswordConfirm()))
		{
			errors.rejectValue("password", "Diff.userForm.passwordConfirm");
		}
	}

}
