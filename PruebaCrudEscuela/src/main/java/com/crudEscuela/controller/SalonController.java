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

import com.crudEscuela.dao.SalonDao;
import com.crudEscuela.entity.Salon;

@RestController
@RequestMapping("/salon")
@CrossOrigin("*")
public class SalonController {
	
	@Autowired
	private SalonDao salonDao;
	
	
	@PostMapping("/room")
	public Salon saveSalon(@RequestBody Salon salon) {
		return salonDao.save(salon);
	}
	
	@GetMapping("/rooms")
	public List<Salon> listSalon(){
		return salonDao.findAll();
	}
	
	@PutMapping("/room/{idroom}")
	public Salon updateSalon(@PathVariable("idroom") Integer idroom, @RequestBody Salon salon) {
		Salon room = salonDao.findByIdSalon(idroom);
		room.setIdsalon(salon.getIdsalon());
		room.setRoomnumber(salon.getRoomnumber());
		return salonDao.save(room);
	}
	
	
	
	@DeleteMapping("/room/{idroom}")
	public void deleteSalon(@PathVariable("idroom") Integer idroom) {
		salonDao.deleteById(idroom);
	}

}
