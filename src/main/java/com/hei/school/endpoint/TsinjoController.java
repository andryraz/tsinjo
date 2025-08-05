package com.hei.school.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TsinjoController {
  @GetMapping("/tsinjo")
  public String home() {
    return "tsinjo";
  }

  //    public String showPage(Model model) {
  //        model.addAttribute("donations", donationService.findAll());
  //        model.addAttribute("helps", helpService.findAll());
  //        model.addAttribute("newDonationForm", new DonationForm());
  //        return "tsinjo";
  //    }

  //    @PostMapping("/tsinjo/donate")
  //    public String donate(@ModelAttribute DonationForm form) {
  //        // créer Donor et Payment (en VERIFYING)
  //        // enregistrer Donation
  //        // soumettre le paiement à Vola
  //        return "redirect:/tsinjo";
  //    }
}
