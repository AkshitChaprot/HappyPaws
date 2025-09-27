package com.example.demo.service;

import com.example.demo.dto.*;
import com.example.demo.entity.Pet;
import com.example.demo.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository repo;

    public PetService(PetRepository repo) {
        this.repo = repo;
    }

    public Pet savePet(PetDTO dto) {
        Pet pet = new Pet();
        pet.setName(dto.name);
        pet.setType(dto.type);
        pet.setAge(dto.age);
        pet.setImageUrl(dto.imageUrl);
        return repo.save(pet);
    }

    public List<PetNameDTO> getAllNames() {
        return repo.fetchAllNames();
    }

    public List<Pet> getAllPets() {
        return repo.findAll();
    }

    public Pet updatePet(Long id, PetDTO dto) {
        Pet pet = repo.findById(id).orElseThrow();
        pet.setName(dto.name);
        pet.setType(dto.type);
        pet.setAge(dto.age);
        pet.setImageUrl(dto.imageUrl);
        return repo.save(pet);
    }

    public void deletePet(Long id) {
        repo.deleteById(id);
    }

    public List<Pet> searchByType(String type) {
        return repo.findByType(type);
    }

    public List<Pet> searchByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }
}
