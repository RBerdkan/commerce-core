package com.commercecore;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("usage: app <unitPrice> <quantity>");
            System.exit(2);
        }
        var unitPrice = new BigDecimal(args[0]);
        var quantity = Integer.parseInt(args[1]);
        var total = unitPrice.multiply(BigDecimal.valueOf(quantity)).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Total: " + total);
    }
}
