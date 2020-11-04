package com.crudEscuela.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salones")
public class Salon {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idsalon;
	private String roomnumber;

	public Integer getIdsalon() {
		return idsalon;
	}

	public void setIdsalon(Integer idsalon) {
		this.idsalon = idsalon;
	}

	public String getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}

	@Override
	public String toString() {
		return "Salon [idsalon=" + idsalon + ", roomnumber=" + roomnumber + "]";
	}

}
