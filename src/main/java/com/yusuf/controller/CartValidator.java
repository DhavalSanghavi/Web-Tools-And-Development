package com.yusuf.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import com.yusuf.pojo.ChartItem;
import com.yusuf.pojo.User;
public class CartValidator implements Validator {

	 public boolean supports(Class aClass)
	    {
	        return aClass.equals(ChartItem.class);
	    }

	    public void validate(Object obj, Errors errors)
	    {
	    	ChartItem user = (ChartItem) obj;
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Quantity", "error.invalid.user", "Quantity Required");
	        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.user", "Last Name Required");
	        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.invalid.user", "User Name Required");
	        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
	       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "error.invalid.user", "address Required");
	       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "error.invalid.user", "phonenumber Required");
	       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "error.invalid.user", "role Required");
	       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email.emailId", "error.invalid.email.emailId", "Email Required");
	    }

}
