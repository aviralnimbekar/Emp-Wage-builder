package com.bridgelabz;

/**
 * Purpose - Employee Wage Computation program for multiple companies
 *
 * @author - Aviral N
 * @version - 1.6
 * date     - 18-08-2021
 */
public class EmpWage {

    public static final int IS_PRESENT = 1, IS_PART_TIME_PRESENT = 2;
    public static final int FULL_TIME_WORKING_HR = 8, PART_TIME_WORKING_HR = 4,
            WORKING_DAY_FOR_MONTH = 20, TOTAL_WORKING_HRS = 100;

    /**
     * Purpose - checks whether an EMP is full time present, part-time present or absent
     *
     * @return - workingHrPerDay (8hr, 4hr, 0hr)
     */
    public int attendanceCheck() {

        int workingHrPerDay;
        int empRandomCheck = (int) (Math.random() * 3);

        if (empRandomCheck == IS_PRESENT) {
            System.out.println("Employee is full time Present");
            workingHrPerDay = FULL_TIME_WORKING_HR;

        } else if (empRandomCheck == IS_PART_TIME_PRESENT) {
            System.out.println("Employee is part time Present");
            workingHrPerDay = PART_TIME_WORKING_HR;

        } else {
            System.out.println("Employee is Absent");
            workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }

    /**
     * Purpose - Calculates daily wage if emp is  present
     *
     * @param workingHrPerDay working hrs of an EMP in a day (8, 4, 0)
     * @return dailyWage (160, 80, 0)
     */
    public int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }

    /**
     * Purpose - checks attendance and calculate working per hr using case switch method
     *
     * @return workingHrPerDay (8hr, 4hr, 0hr)
     */
    public int switchCase() {

        int workingHrPerDay;
        int rand = (int) (Math.random() * 3);

        switch (rand) {

            case IS_PRESENT:
                System.out.println("Employee is full time Present");
                workingHrPerDay = FULL_TIME_WORKING_HR;
                break;

            case IS_PART_TIME_PRESENT:
                System.out.println("Employee is part time Present");
                workingHrPerDay = PART_TIME_WORKING_HR;
                break;

            default:
                System.out.println("Employee is absent");
                workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }

    /**
     * Purpose - Calculate wage for a month
     *
     * @return monthly wage
     */
    public static int monthlyWage() {

        int monthlyWage = 0, workingHrsPerMonth = 0;

        EmpWage monthlyWageCalculator = new EmpWage();

        for (int i = 1; i <= WORKING_DAY_FOR_MONTH; i++) {
            System.out.println("Day-" + i);

            if (workingHrsPerMonth >= TOTAL_WORKING_HRS)
                break;

            int workingHrsPerDay = monthlyWageCalculator.attendanceCheck();
            int dailyWage = monthlyWageCalculator.dailyWage(workingHrsPerDay);

            monthlyWage += dailyWage;
            workingHrsPerMonth += workingHrsPerDay;

        }
        System.out.println("Working Hrs Per Month = " + workingHrsPerMonth);
        return monthlyWage;
    }

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWage empWageCalculator = new EmpWage();

        int monthlyWage = empWageCalculator.monthlyWage();
        System.out.println("Monthly wage of EMP : " + monthlyWage);
    }
}
