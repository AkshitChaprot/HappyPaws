package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.entity.Pet;
import com.example.demo.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService service;

    public PetController(PetService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Pet addPet(@RequestBody PetDTO dto) {
        return service.savePet(dto);
    }

    @PostMapping("/names")
    public List<PetNameDTO> getNames() {
        return service.getAllNames();
    }

    @PostMapping("/all")
    public List<Pet> getAllPets() {
        return service.getAllPets();
    }

    @PostMapping("/update")
    public Pet updatePet(@RequestBody PetUpdateRequest request) {
        return service.updatePet(request.id, request.dto);
    }

    @PostMapping("/delete")
    public String deletePet(@RequestBody PetIdDTO request) {
        service.deletePet(request.id);
        return "Deleted";
    }

    @PostMapping("/search/type")
    public List<Pet> searchByType(@RequestBody PetDTO dto) {
        return service.searchByType(dto.type);
    }

    @PostMapping("/search/name")
    public List<Pet> searchByName(@RequestBody PetDTO dto) {
        return service.searchByName(dto.name);
    }

    // Helper DTO for update
    public static class PetUpdateRequest {
        public Long id;
        public PetDTO dto;
    }
}
