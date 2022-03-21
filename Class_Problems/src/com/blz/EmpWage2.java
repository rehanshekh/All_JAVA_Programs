package com.blz;

public class EmpWage2 {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int empHrs = 0;
        int EMP_IS_PRESENT = 1;
        int emp_wage = 0;
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == EMP_IS_PRESENT) {
            empHrs = 8;
        } else
            empHrs = 0;
        emp_wage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage:" + emp_wage);
    }
}

