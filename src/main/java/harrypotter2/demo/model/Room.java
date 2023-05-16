package harrypotter2.demo.model;

import harrypotter2.demo.model.types.HouseType;
import harrypotter2.demo.model.types.PetType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    private HouseType houseType;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Student> students = new HashSet<>();


    public Room(HouseType houseType, Set<Student> students) {
        this.houseType = houseType;
        this.students = students;
    }

}
