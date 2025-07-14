package org.javaguru.mentor.project_1_tax_calculator.task_16.code;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorBigDecimal {

    BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("10000")) <= 0) {
            return calculateTaxWhenIncomeUnder10k(income);
        }
        if (income.compareTo(new BigDecimal("10000")) > 0
                && income.compareTo(new BigDecimal("50000")) <= 0) {
            return calculateTaxWhenIncomeBiggerThen10kAndUnder50k(income);
        }
        return calculateTaxWhenIncomeBiggerThen50k(income);
    }

    private BigDecimal calculateTaxWhenIncomeUnder10k(BigDecimal income) {
        return income.multiply(new BigDecimal("0.3"))
                .setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateTaxWhenIncomeBiggerThen10kAndUnder50k(BigDecimal income) {
        BigDecimal tenk = new BigDecimal("10000");
        BigDecimal tax_rate_03 = new BigDecimal("0.3");
        BigDecimal tax_rate_04 = new BigDecimal("0.4");

        BigDecimal tax_1 = tenk.multiply(tax_rate_03);
        BigDecimal tax_2 = income.subtract(tenk).multiply(tax_rate_04);

        return tax_1.add(tax_2).setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateTaxWhenIncomeBiggerThen50k(BigDecimal income) {
        BigDecimal tenk = new BigDecimal("10000");
        BigDecimal fiftyk = new BigDecimal("50000");
        BigDecimal tax_rate_03 = new BigDecimal("0.3");
        BigDecimal tax_rate_04 = new BigDecimal("0.4");
        BigDecimal tax_rate_05 = new BigDecimal("0.5");

        BigDecimal tax_1 = tenk.multiply(tax_rate_03);
        BigDecimal tax_2 = fiftyk.subtract(tenk).multiply(tax_rate_04);
        BigDecimal tax_3 = income.subtract(fiftyk).multiply(tax_rate_05);

        return tax_1.add(tax_2).add(tax_3).setScale(2, RoundingMode.HALF_UP);
    }

}
