package com.functionalinterfaces.datetimeutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtil {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
