package com.ty.pancard_app_boot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.pancard_app_boot.dto.PanCard;
import com.ty.pancard_app_boot.dto.Person;
import com.ty.pancard_app_boot.repo.PersonRepo;
@Repository
public class PersonDao {
	@Autowired
	PersonRepo repo;
	
	
	public Person savePerson(Person person)
	{
		return repo.save(person);
	}
    public Person findByName(String name)
    {
    	return repo.findByName(name);
    }
    public Person findById(int id)
    {
    	return repo.findById(id).get();
    }
    public String deletePerson(int id)
    {
    	repo.deleteById(id);
    	return "deleted";
    }
    public Person updatePerson(int id,PanCard card)
    {
    	Person person=repo.findById(id).get();
    	person.setName(null);
    	person.setAddress(null);
    	
    	
    	person.setCard(card);
    	repo.save(person);
    	return person;
    }
    public List<Person> getAll()
    {
    	List<Person>all=repo.findAll();
    	return all;
    }
}

