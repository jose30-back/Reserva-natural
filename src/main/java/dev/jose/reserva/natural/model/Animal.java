package dev.jose.reserva.natural.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false)
    private String name;
    private String type;
    private String family;
    private String gender;
    private String country;
    private LocalDate dateOfEntry;

    public Animal() {
    }    

    public Animal(long id, String name, String type, String family, String gender, String country,
            LocalDate dateOfEntry) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.family = family;
        this.gender = gender;
        this.country = country;
        this.dateOfEntry = dateOfEntry;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;

    }
}