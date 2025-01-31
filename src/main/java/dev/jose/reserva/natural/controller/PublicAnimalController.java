package dev.jose.reserva.natural.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.jose.reserva.natural.model.Animal;
import dev.jose.reserva.natural.repository.AnimalRepository;

@RestController
@RequestMapping("/public")
public class PublicAnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/animals")
    public Page<Animal> getAnimals(Pageable pageable) {
        return animalRepository.findAll(pageable);
    }

    @GetMapping("/animals/family/{family}")
    public Page<Animal> getByFamily(@PathVariable String family, Pageable pageable) {
        return animalRepository.findByFamily(family, pageable);
    }

    @GetMapping("/animals/country/{country}")
    public List<Animal> getByCountry(@PathVariable String country) {
        return animalRepository.findByCountry(country);
    }

    @GetMapping("/animals/family-type/{family}-{type}")
    public List<Animal> getForFamilyAndType (@RequestParam String family, @RequestParam String type) {
        return animalRepository.findByFamilyAndType(family, type);
    }

}
