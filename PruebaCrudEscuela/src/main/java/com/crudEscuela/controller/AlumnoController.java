package com.crudEscuela.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudEscuela.dao.AlumnoDao;
import com.crudEscuela.entity.Alumno;

@RestController
@RequestMapping("/alumno")
@CrossOrigin("*")
public class AlumnoController {
	
	
	@Autowired
	private AlumnoDao alumnoDao;
	
	
	@PostMapping("/student")
	public Alumno saveAlumno(@RequestBody Alumno alumno) {
		return alumnoDao.save(alumno);
	}
	
	@GetMapping("/students")
	public List<Alumno> listAlumnos() {
		return alumnoDao.findAll();
	}
	
	@PutMapping("/student/{idstudent}")
	public Alumno updateAlumno(@PathVariable("idstudent") Integer idstudent, @RequestBody Alumno alumno) {
		Alumno student = alumnoDao.finByIdStundent(idstudent);
		
		student.setName(alumno.getName());
		student.setLastname(alumno.getLastname());
		student.setEge(alumno.getEge());
		student.setSex(alumno.getSex());
		student.setIdalumno(alumno.getIdalumno());
		student.setSalon(alumno.getSalon());
		return alumnoDao.save(student);
		
	}
	
	
	@DeleteMapping("/student/{idstudent}")
	public void deleteAlumno(@PathVariable("idstudent") Integer idstudent) {
		alumnoDao.deleteById(idstudent);
	}

}
