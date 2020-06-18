package com.kodilla.hibernate.manytomany.facade;

public class SearchingProcessingException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "Company doesn't exist";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee doesn't exist";

    public SearchingProcessingException(String message) {
        super(message);
    }
}
