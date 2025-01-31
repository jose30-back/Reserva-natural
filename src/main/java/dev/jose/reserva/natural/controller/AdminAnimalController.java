package dev.jose.reserva.natural.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.jose.reserva.natural.model.Animal;
import dev.jose.reserva.natural.repository.AnimalRepository;

@RestController
@RequestMapping("/private")
public class AdminAnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping("/animals")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @DeleteMapping("/animals/{id}")
    public void deleteAnimal(@PathVariable long id) {
        animalRepository.deleteById(id);
    }

    @PutMapping("/animals/{id}")
    public Animal editAnimal(@PathVariable Long id, @RequestBody Animal animal) {
        animal.setId(id);
        return animalRepository.save(animal);
    }

    @GetMapping("/animals/total")
    public long getTotalAmount() {
        return animalRepository.count();
    }

    @GetMapping("/animals/{nombre}")
    public Optional<Animal> obtenerPorNombre(@PathVariable String nombre) {
        return animalRepository.findByName(nombre);
    }

}
