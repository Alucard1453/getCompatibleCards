package com.alberto.springboot.cardprofile.apirest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_card")
    private int idCard;
	
	@Column(name="name_card")
    private String nameCard;
	
	public CreditCard() {}

	public CreditCard(int idCard, String nameCard) {
		this.idCard = idCard;
		this.nameCard = nameCard;
	}

	public int getIdCard() {
		return idCard;
	}

	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}

	public String getNameCard() {
		return nameCard;
	}

	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}
}
