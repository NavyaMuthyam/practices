package com.ty.pancard_app_boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.pancard_app_boot.dto.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

	public Person findByName(String name);
}
