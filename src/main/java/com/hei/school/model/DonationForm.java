package com.hei.school.model;

import lombok.Data;

@Data
public class DonationForm {
    private String fullName;
    private String email;
    private String paymentMethod;
    private String paymentReference;
}
