package com.crudEscuela.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crudEscuela.entity.Alumno;

public interface AlumnoDao extends JpaRepository<Alumno, Integer> {
	
	@Query("Select a from Alumno a where a.idalumno=?1")
	public Alumno finByIdStundent(Integer idalumno);

}
