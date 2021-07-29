package com.alberto.springboot.cardprofile.apirest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="relation")
public class Relation {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int idRelation;
	
	@Column(name="salary_from")
    private float salaryFrom;
	
	@Column(name="salary_to")
    private float salaryTo;
	
	@Column(name="age_from")
    private int ageFrom;
	
	@Column(name="age_to")
    private int ageTo;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_passion")
	private Passion passion;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_card")
	private CreditCard creditCard;
	
	public Relation() {}

	public Relation(int id, float salaryFrom, float salaryTo, int ageFrom, int ageTo, Passion passion,
			CreditCard creditCard) {
		this.idRelation = id;
		this.salaryFrom = salaryFrom;
		this.salaryTo = salaryTo;
		this.ageFrom = ageFrom;
		this.ageTo = ageTo;
		this.passion = passion;
		this.creditCard = creditCard;
	}

	public int getId() {
		return idRelation;
	}

	public void setId(int idRelation) {
		this.idRelation = idRelation;
	}

	public float getSalaryFrom() {
		return salaryFrom;
	}

	public void setSalaryFrom(float salaryFrom) {
		this.salaryFrom = salaryFrom;
	}

	public float getSalaryTo() {
		return salaryTo;
	}

	public void setSalaryTo(float salaryTo) {
		this.salaryTo = salaryTo;
	}

	public int getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(int ageFrom) {
		this.ageFrom = ageFrom;
	}

	public int getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(int ageTo) {
		this.ageTo = ageTo;
	}

	public Passion getPassion() {
		return passion;
	}

	public void setPassion(Passion passion) {
		this.passion = passion;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
}
