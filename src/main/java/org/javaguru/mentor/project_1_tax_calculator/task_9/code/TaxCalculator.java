package org.javaguru.mentor.project_1_tax_calculator.task_9.code;

class TaxCalculator {

    double calculateTax(double income) {
        if (income <= 10_000) {
            return calculateTaxWhenIncomeUnder10k(income);
        }
        if (income > 10_000 && income <= 50_000) {
            return calculateTaxWhenIncomeBiggerThen10kAndUnder50k(income);
        }
        return 10_000 * 0.3
                + (50_000 - 10_000) * 0.4
                + (income - 50_000) * 0.5;
    }

    private double calculateTaxWhenIncomeUnder10k(double income) {
        return income * 0.3;
    }

    private double calculateTaxWhenIncomeBiggerThen10kAndUnder50k(double income) {
        return 10_000 * 0.3 + (income - 10_000) * 0.4;
    }

}
