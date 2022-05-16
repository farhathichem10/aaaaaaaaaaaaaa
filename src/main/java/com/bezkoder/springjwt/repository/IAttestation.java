package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Attestation;

public interface IAttestation extends JpaRepository<Attestation, Integer>{

}
