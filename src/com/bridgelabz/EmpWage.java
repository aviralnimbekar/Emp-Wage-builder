package com.bridgelabz;

/**
 * Purpose - Employee Wage Computation program for multiple companies
 *
 * @author - Aviral N
 * @version - 1.0
 * date     - 18-08-2021
 */
public class EmpWage {

    public static final int IS_PRESENT = 1;

    /**
     * Purpose - checks whether an EMP is present or absent
     */
    public void attendanceCheck() {

        int empRandomCheck = (int) (Math.random() * 2);

        if (empRandomCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWage attendanceCheck = new EmpWage();

        attendanceCheck.attendanceCheck();
    }
}
