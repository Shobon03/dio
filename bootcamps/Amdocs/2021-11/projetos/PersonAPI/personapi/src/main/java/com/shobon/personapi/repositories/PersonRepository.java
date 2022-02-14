package com.shobon.personapi.repositories;

import com.shobon.personapi.entities.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
