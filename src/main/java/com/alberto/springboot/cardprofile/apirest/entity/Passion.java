package com.alberto.springboot.cardprofile.apirest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passion")
public class Passion {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_passion")
    private int idPassion;
	
	@Column(name="name_passion")
    private String namePassion;
	
	public Passion() {}

	public Passion(int idPassion, String namePassion) {
		this.idPassion = idPassion;
		this.namePassion = namePassion;
	}

	public int getIdPassion() {
		return idPassion;
	}

	public void setIdPassion(int idPassion) {
		this.idPassion = idPassion;
	}

	public String getNamePassion() {
		return namePassion;
	}

	public void setNamePassion(String namePassion) {
		this.namePassion = namePassion;
	}
}
