package com.example.demo.service;

import com.example.demo.entity.Pet;
import com.example.demo.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public List<Pet> getAllPets() {
        return repository.getAllPets();
    }
}
