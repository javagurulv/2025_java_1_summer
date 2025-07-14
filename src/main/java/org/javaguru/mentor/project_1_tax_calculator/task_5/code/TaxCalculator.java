package org.javaguru.mentor.project_1_tax_calculator.task_5.code;

class TaxCalculator {

    double calculateTax(double income) {
        if (income <= 10_000) {
            return income * 0.3;
        }
        return 0.0;
    }

}
