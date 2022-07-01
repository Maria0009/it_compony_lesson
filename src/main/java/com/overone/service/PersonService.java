package com.overone.service;

import com.overone.model.Person;
import com.overone.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
}
