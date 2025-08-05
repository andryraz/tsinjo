/*package com.hei.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.hei.school.model.*;
import com.hei.school.repository.*;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;
    private final DonorRepository donorRepository;
    private final PaymentRepository paymentRepository;
    private final VolaClient volaClient;

    public List<Donation> findAll() {
        return donationRepository.findAllByOrderByPaymentDateDesc();
    }

    public void saveDonation(DonationForm form) {
        Donor donor = donorRepository.findByEmail(form.getEmail())
                .orElseGet(() -> {
                    Donor d = new Donor(UUID.randomUUID(), form.getFullName(), form.getEmail());
                    return donorRepository.save(d);
                });

        Payment payment = Payment.builder()
                .id(UUID.randomUUID())
                .reference(form.getPaymentReference())
                .method(form.getPaymentMethod())
                .date(LocalDateTime.now())
                .amount(0) // à récupérer plus tard via Vola
                .status(PaymentStatus.VERIFYING)
                .build();

        paymentRepository.save(payment);
        volaClient.verifyPayment(payment.getReference());

        Donation donation = new Donation(UUID.randomUUID(), donor, payment);
        donationRepository.save(donation);
    }
}*/
