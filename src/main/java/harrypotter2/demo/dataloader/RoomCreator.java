package harrypotter2.demo.dataloader;

import harrypotter2.demo.model.Room;
import harrypotter2.demo.model.Student;
import harrypotter2.demo.model.types.HouseType;
import harrypotter2.demo.model.types.PetType;
import harrypotter2.demo.repository.RoomRepository;
import harrypotter2.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Set;

@Configuration
public class RoomCreator {
    @Bean
    ApplicationRunner runner(RoomRepository roomRepository,
                             StudentRepository studentRepository) {
        return args -> {
            Student hermioneGranger = new Student("Hermione Granger", PetType.OWL);
            Student dracoMalfoy = new Student("Draco Malfoy", PetType.CAT);
            Student harryPotter = new Student("Harry Potter", PetType.NONE);
            Student nevilleLongbottom = new Student("Neville Longbottom", PetType.RAT);
            studentRepository.save(hermioneGranger);
            studentRepository.save(dracoMalfoy);
            studentRepository.save(harryPotter);
            studentRepository.save(nevilleLongbottom);

            Room room1 = new Room(HouseType.GRYFFINDOR, Set.of(hermioneGranger));
            Room room2 = new Room(HouseType.HUFFLEPUFF, Set.of(harryPotter));
            Room room3 = new Room(HouseType.RAVENCLAW, Set.of(nevilleLongbottom));
            Room room4 = new Room(HouseType.SLYTHERIN, Set.of(dracoMalfoy));

            roomRepository.save(room1);
            roomRepository.save(room2);
            roomRepository.save(room3);
            roomRepository.save(room4);
        };
    }

}
