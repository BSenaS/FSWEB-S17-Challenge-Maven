package com.workintech.spring17challenge.validation;

import com.workintech.spring17challenge.exceptions.ApiException;
import org.springframework.http.HttpStatus;

public class CourseValidation {

    //credit değeri hiçbir şekilde 0'dan küçük olamaz. 4'ten büyük olamaz.
    public static void checkCredit(Integer credit) {
        if (credit == null || credit < 0 || credit > 4) {
            throw new ApiException("Credit must be between 0 and 4", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkId(Integer id) {
        if (id == null || id < 0) {
            throw new ApiException("ID must be a positive integer", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new ApiException("Name cannot be null or empty", HttpStatus.BAD_REQUEST);
        }
    }
}
