package com.shobon.personapi.dto.mapper;

import com.shobon.personapi.dto.request.PersonDTO;
import com.shobon.personapi.entities.Person;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Mapping(target = "birthDay", source = "birthDay", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);

}
