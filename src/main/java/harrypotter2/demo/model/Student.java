package harrypotter2.demo.model;

import harrypotter2.demo.model.types.PetType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private PetType petType;

    public Student(String name, PetType petType) {
        this.name = name;
        this.petType = petType;
    }

}
