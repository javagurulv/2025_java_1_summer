package org.javaguru.mentor.lesson_5_methods.homework.solutions.level_3_junior.task_1;

class TaxCalculatorApplication {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        System.out.println("Income 9000, tax = " + calculator.calculateTax(9000));
        System.out.println("Income 11000, tax = " + calculator.calculateTax(11000));
        System.out.println("Income 48000, tax = " + calculator.calculateTax(48000));
        System.out.println("Income 55000, tax = " + calculator.calculateTax(55000));
    }

}
