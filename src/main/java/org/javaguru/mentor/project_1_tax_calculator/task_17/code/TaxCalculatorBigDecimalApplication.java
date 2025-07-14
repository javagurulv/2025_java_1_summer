package org.javaguru.mentor.project_1_tax_calculator.task_17.code;

import java.math.BigDecimal;

class TaxCalculatorBigDecimalApplication {

    public static void main(String[] args) {
        TaxCalculatorBigDecimal calculator = new TaxCalculatorBigDecimal();

        BigDecimal tax1 = calculator.calculateTax(new BigDecimal("5000"));
        System.out.println("Tax: " + tax1);

        BigDecimal tax2 = calculator.calculateTax(new BigDecimal("20000"));
        System.out.println("Tax: " + tax2);

        BigDecimal tax3 = calculator.calculateTax(new BigDecimal("60000"));
        System.out.println("Tax: " + tax3);
    }

}
