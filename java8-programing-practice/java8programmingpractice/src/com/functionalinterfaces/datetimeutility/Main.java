package com.functionalinterfaces.datetimeutility;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateUtil.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateUtil.formatDate(invoiceDate, "dd/MM/yyyy");
        String format3 = DateUtil.formatDate(invoiceDate, "yyyy-MM-dd");

        System.out.println("Invoice Date (Format 1): " + format1);
        System.out.println("Invoice Date (Format 2): " + format2);
        System.out.println("Invoice Date (Format 3): " + format3);
    }
}
