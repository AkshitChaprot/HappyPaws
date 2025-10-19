package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.entity.Pet;
import com.example.demo.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService service;

    public PetController(PetService service) {
        this.service = service;
    }
    @GetMapping
    public List<Pet> getAllPets() {
        return service.getAllPets();
    }

    }
