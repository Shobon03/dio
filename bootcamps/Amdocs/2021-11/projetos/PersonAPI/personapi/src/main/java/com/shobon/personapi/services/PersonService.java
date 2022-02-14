package com.shobon.personapi.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;

import com.shobon.personapi.dto.mapper.PersonMapper;
import com.shobon.personapi.dto.request.PersonDTO;
import com.shobon.personapi.dto.response.MessageResponseDTO;
import com.shobon.personapi.entities.Person;
import com.shobon.personapi.exception.PersonNotFoundException;
import com.shobon.personapi.repositories.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public MessageResponseDTO create(PersonDTO personDTO) {

        Person person = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(person);

        MessageResponseDTO mr = createMessageResponse("Person created with ID ", savedPerson.getId());

        return mr;

    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {

        Person person = personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
        return personMapper.toDTO(person);

    }

    public List<PersonDTO> listAll() {

        List<Person> people = personRepository.findAll();
        return people.stream().map(personMapper::toDTO).collect(Collectors.toList());

    }

    public MessageResponseDTO update(Long id, PersonDTO personDTO) throws PersonNotFoundException {

        personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException());

        Person updatedPerson = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(updatedPerson);

        MessageResponseDTO mr = createMessageResponse("Person successfully updated with ID ", savedPerson.getId());

        return mr;

    }

    public void delete(Long id) throws PersonNotFoundException {

        personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException());
        personRepository.deleteById(id);

    }

    public MessageResponseDTO createMessageResponse(String s, Long ID) {

        return MessageResponseDTO.builder().message(s + ID).build();

    }

}
