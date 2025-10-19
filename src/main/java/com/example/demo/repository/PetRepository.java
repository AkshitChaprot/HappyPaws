package com.example.demo.repository;

import com.example.demo.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    @Query(value = "SELECT * FROM pets", nativeQuery = true)
    List<Pet> getAllPets();
}
