package com.crudEscuela.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crudEscuela.entity.Salon;

public interface SalonDao extends JpaRepository<Salon, Integer>{
	
	@Query("Select s from Salon s where s.idsalon=?1")
	public Salon findByIdSalon(Integer idsalon);

}
