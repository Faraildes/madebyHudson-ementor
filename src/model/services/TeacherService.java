package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.Teacher;

public class TeacherService {

	public List<Teacher> findAll(){
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher(1, "Maria", new Date(), "12345678989", "987654123", 10000.00));
		list.add(new Teacher(1, "Marta", new Date(), "12345671234", "987656547", 15000.00));
		list.add(new Teacher(1, "Mariana", new Date(), "12343458989", "987243576", 11000.00));
		return list;
	}
		
}
