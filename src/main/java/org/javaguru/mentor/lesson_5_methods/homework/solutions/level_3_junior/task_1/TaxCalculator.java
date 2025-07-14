package org.javaguru.mentor.lesson_5_methods.homework.solutions.level_3_junior.task_1;

// Простое решение, но не совсем верное.
// В финансах не используют тип данных double.
class TaxCalculator {

    public double calculateTax(double income) {
        double tax = 0.0;

        if (income < 10000) {
            tax = income * 0.30;
        }

        if (income >= 10000 && income < 50000) {
            double tax10k = 10000 * 0.30;
            double tax10kPlus = (income - 10000) * 0.40;
            tax = tax10k + tax10kPlus;
        }

        if (income >= 50000) {
            double tax10k = 10000 * 0.30;
            double tax50k = 40000 * 0.40;
            double tax50kPlus = (income - 50000) * 0.50;
            return tax10k + tax50k + tax50kPlus;
        }

        return tax;
    }

}
