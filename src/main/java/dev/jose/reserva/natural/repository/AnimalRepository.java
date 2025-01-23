package dev.jose.reserva.natural.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.jose.reserva.natural.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>  {

    Page<Animal> findByFamily(String family, Pageable pageable);
    List<Animal> findByCountryOfOrigin(String country);
    List<Animal> findByFamilyAndType(String family, String type);
    Optional<Animal> findByName(String name);

}
