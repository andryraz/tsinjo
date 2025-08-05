package com.hei.school.model;

import java.time.LocalDate;

public class Payment {
    private String reference;
    private String method;
    private LocalDate date;
    private int amount;
    private PaymentStatus status;
}