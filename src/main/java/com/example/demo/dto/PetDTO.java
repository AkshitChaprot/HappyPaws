package com.example.demo.dto;

public class PetDTO {
    private Long id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String gender;
    private String description;
    private String imageUrl;
    private String status;
    private Integer addedBy;
    private String type;

    // Constructors
    public PetDTO() {}

    public PetDTO(Long id, String name, String species, String breed, int age, String gender,
                  String description, String imageUrl, String status, Integer addedBy, String type) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.imageUrl = imageUrl;
        this.status = status;
        this.addedBy = addedBy;
        this.type = type;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getAddedBy() { return addedBy; }
    public void setAddedBy(Integer addedBy) { this.addedBy = addedBy; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
