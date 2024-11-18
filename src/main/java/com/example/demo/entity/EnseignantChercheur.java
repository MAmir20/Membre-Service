package com.example.demo.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity @DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NonNull
	private String grade;
	@NonNull
	private String etablissement;
}
