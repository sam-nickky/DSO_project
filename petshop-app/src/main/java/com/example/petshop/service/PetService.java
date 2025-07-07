package com.example.petshop.service;
import com.example.petshop.model.Pet;
import com.example.petshop.repository.PetRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class PetService {
    private final PetRepository petRepository;
    public PetService(PetRepository petRepository) { this.petRepository = petRepository; }
    public List<Pet> getAllPets() { return petRepository.findAll(); }
    public Optional<Pet> getPetById(Long id) { return petRepository.findById(id); }
    public Pet savePet(Pet pet) { return petRepository.save(pet); }
    public void deletePet(Long id) { petRepository.deleteById(id); }
}