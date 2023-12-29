package org.example;

public class AccountingDepartment {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.calculateSalary("Ahmet", 26,250);
        System.out.println();
        calculate.calculateSalary("Ayşe", 20,350);
        System.out.println();
        calculate.calculateSalary("Fatma", 30,550);

    }
}