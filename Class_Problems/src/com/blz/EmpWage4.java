package com.blz;

public class EmpWage3 {

        public static void main(String[] args) {
        int IS_PRESENT = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int empHrs = 0;
        int empwage = 0;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck){
          case IS_PART_TIME:
            empHrs=4;
            break;
          case IS_PRESENT:
            empHrs=8;
            break;
          default:
            empHrs=0;
        }
        empwage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage:" + empwage);

    }

    }

