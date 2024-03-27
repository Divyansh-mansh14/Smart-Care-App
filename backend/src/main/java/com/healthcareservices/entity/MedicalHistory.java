package com.healthcareservices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medical_history")
public class MedicalHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="dat")
	private String date;
	
	@Column(name="condition")
	private String condition;
	
	@Column(name="treatment")
	private String treatment;
	
	@Column(name="doctor")
	private String doctor;

	public MedicalHistory() {
		super();
	}

	public MedicalHistory(String date, String condition, String treatment, String doctor) {
		super();
		this.date = date;
		this.condition = condition;
		this.treatment = treatment;
		this.doctor = doctor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getPrescription() {
		return treatment;
	}

	public void setPrescription(String treatment) {
		this.treatment = treatment;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
}
