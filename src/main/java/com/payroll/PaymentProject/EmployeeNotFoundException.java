package com.payroll.PaymentProject;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
