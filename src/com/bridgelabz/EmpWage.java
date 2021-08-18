package com.bridgelabz;

/**
 * Purpose - Employee Wage Computation program for multiple companies
 *
 * @author - Aviral N
 * @version - 1.2
 * date     - 18-08-2021
 */
public class EmpWage {

    public static final int IS_PRESENT = 1;
    public static final int FULL_TIME_WORKING_HR = 8;

    /**
     * Purpose - checks whether an EMP is present or absent
     *
     * @return - workingHrPerDay (8hr, 0hr)
     */
    public static int attendanceCheck() {

        int workingHrPerDay;
        int empRandomCheck = (int) (Math.random() * 2);

        if (empRandomCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
            workingHrPerDay = FULL_TIME_WORKING_HR;
        } else {
            System.out.println("Employee is Absent");
            workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }

    /**
     * Purpose - Calculates daily wage if emp is  present
     *
     * @param workingHrPerDay working hrs of an EMP in a day (8, 0)
     * @return dailyWage (160, 0)
     */
    public int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWage empWageCalculator = new EmpWage();

        int workingHrPerDay = empWageCalculator.attendanceCheck();
        empWageCalculator.dailyWage(workingHrPerDay);
    }
}
