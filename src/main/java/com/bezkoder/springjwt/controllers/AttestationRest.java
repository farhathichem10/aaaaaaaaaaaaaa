package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Attestation;
import com.bezkoder.springjwt.models.Produit;
import com.bezkoder.springjwt.repository.IAttestation;
import com.bezkoder.springjwt.repository.IProdRepository;

@CrossOrigin("*")

@RestController
@RequestMapping("/attestation")
public class AttestationRest {
	@Autowired IAttestation iat;
	@GetMapping("/getall")
	public List <Attestation> getall(){
		
		return (List <Attestation>) iat.findAll(); 
	}
	@PostMapping("/save")
	public void save (@RequestBody Attestation t) {
		iat.save(t);
		
	}

}
