package com.pouchen.roy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pouchen.roy.bean.Reservation;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservation/reservation-page";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation reservation) {
		return "reservation/confirmation-page";
	}
	
	@RequestMapping("/submitForm1")
	public String submitForm1(@ModelAttribute("reservation") Reservation reservation) {
		
		return "reservation/confirmed-page";
	}
	
}
