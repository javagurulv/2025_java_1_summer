package org.javaguru.mentor.project_1_tax_calculator.task_7.code;

class TaxCalculator {

    double calculateTax(double income) {
        if (income <= 10_000) {
            return income * 0.3;
        }
        if (income > 10_000 && income <= 50_000) {
            return 10_000 * 0.3 + (income - 10_000) * 0.4;
        }
        return 10_000 * 0.3
                + (50_000 - 10_000) * 0.4
                + (income - 50_000) * 0.5;
    }

}
