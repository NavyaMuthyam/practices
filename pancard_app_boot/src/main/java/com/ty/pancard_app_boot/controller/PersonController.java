package com.ty.pancard_app_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.pancard_app_boot.dao.PersonDao;
import com.ty.pancard_app_boot.dto.Person;



@RestController
public class PersonController {
	@Autowired
	PersonDao dao;

	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person) {
		return dao.savePerson(person);
	}

//	@GetMapping("getP")
//	public Person findByName(@RequestParam String name)
//	{
//		return dao.findByName(name);
//	}
	@GetMapping("/get/{id}")
	public Person findById(@PathVariable int id) {
		return dao.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePerson(@PathVariable int id) {
		dao.deletePerson(id);
		return "deleted";
	}

	@PutMapping("/update/{id}")
	public Person updatePerson(@RequestBody Person person, @PathVariable int pid, @RequestParam int panid) {

		Person person1 = dao.findById(pid);

		if (person1 != null) {
			person.setId(pid);
			person.getCard().setId(panid);
			return dao.savePerson(person);
		} else {
			return null;
		}

	}
	@GetMapping("/getAll")
	public List<Person> getAll() {

		return dao.getAll();
	}

}