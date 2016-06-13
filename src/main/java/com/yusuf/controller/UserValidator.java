package com.yusuf.controller;

import com.yusuf.pojo.User;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

public class UserValidator implements Validator {

    public boolean supports(Class aClass)
    {
        return aClass.equals(User.class);
    }

    public void validate(Object obj, Errors errors)
    {
        User user = (User) obj;
        String a = user.getUsername();
        String q=   a.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "error.invalid.user", "First Name Required");
        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "error.invalid.user", "Last Name Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.invalid.user", "User Name Required");
        user.setFirstname(q);
        String b = user.getPassword();
        String r=   a.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
        user.setFirstname(q);
       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email.emailId", "error.invalid.email.emailId", "Email Required");
    }
}
