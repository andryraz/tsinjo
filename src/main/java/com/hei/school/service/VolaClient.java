// package com.hei.school.service;
//
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.stereotype.Component;
// import org.springframework.web.reactive.function.client.WebClient;
//
// @Component
// @Slf4j
// public class VolaClient {
//    private static final String BASE_URL =
// "https://42cwka3n4ifcp7ufheyrpmph240iuaxo.lambda-url.eu-west-3.on.aws";
//    private static final String API_KEY = "your-api-key"; // Remplacez par votre vraie clé API
//
//    private final WebClient webClient = WebClient.builder()
//            .baseUrl(BASE_URL)
//            .defaultHeader("Authorization", "Bearer " + API_KEY)
//            .build();
//
//    public void verifyPayment(String reference) {
//        webClient.post()
//                .uri("/v3/payments/verify")
//                .bodyValue("{"reference":"" + reference + ""}")
//                .retrieve()
//                .bodyToMono(String.class)
//                .doOnError(err -> log.error("Erreur de vérification Vola", err))
//                .subscribe();
//    }
// }
