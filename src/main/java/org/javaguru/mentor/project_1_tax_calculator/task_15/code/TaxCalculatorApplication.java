package org.javaguru.mentor.project_1_tax_calculator.task_15.code;

class TaxCalculatorApplication {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        double tax1 = calculator.calculateTax(5000);
        System.out.println("Tax: " + tax1);

        double tax2 = calculator.calculateTax(20000);
        System.out.println("Tax: " + tax2);

        double tax3 = calculator.calculateTax(60000);
        System.out.println("Tax: " + tax3);
    }

}
