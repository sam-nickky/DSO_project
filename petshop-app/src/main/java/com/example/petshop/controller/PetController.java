package com.example.petshop.controller;
import com.example.petshop.model.Pet;
import com.example.petshop.service.PetService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/pets")
public class PetController {
    private final PetService petService;
    public PetController(PetService petService) { this.petService = petService; }
    @GetMapping
    public List<Pet> getAllPets() { return petService.getAllPets(); }
    @GetMapping("/{id}")
    public Pet getPetById(@PathVariable Long id) { return petService.getPetById(id).orElse(null); }
    @PostMapping
    public Pet addPet(@RequestBody Pet pet) { return petService.savePet(pet); }
    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) { petService.deletePet(id); }
}