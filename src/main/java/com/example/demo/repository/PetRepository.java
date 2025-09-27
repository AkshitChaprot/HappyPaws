package com.example.demo.repository;

import com.example.demo.entity.Pet;
import com.example.demo.dto.PetNameDTO;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    @Query("SELECT new com.example.demo.dto.PetNameDTO(p.name) FROM Pet p")
    List<PetNameDTO> fetchAllNames();

    List<Pet> findByType(String type);
    List<Pet> findByNameContainingIgnoreCase(String name);
}
