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
import java.util.Arrays;

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
            Student ronWeasley = new Student("Ron Weasley", PetType.OWL);
            Student lunaLovegood = new Student("Luna Lovegood", PetType.NONE);
            Student ginnyWeasley = new Student("Ginny Weasley", PetType.CAT);
            Student fredWeasley = new Student("Fred Weasley", PetType.OWL);
            Student georgeWeasley = new Student("George Weasley", PetType.CAT);
            Student choChang = new Student("Cho Chang", PetType.NONE);
            Student cedricDiggory = new Student("Cedric Diggory", PetType.RAT);
            Student seamusFinnigan = new Student("Seamus Finnigan", PetType.OWL);
            Student lavenderBrown = new Student("Lavender Brown", PetType.CAT);
            Student deanThomas = new Student("Dean Thomas", PetType.NONE);
            Student padmaPatil = new Student("Padma Patil", PetType.RAT);
            Student parvatiPatil = new Student("Parvati Patil", PetType.OWL);


            studentRepository.saveAll(Arrays.asList(
                    hermioneGranger, dracoMalfoy, harryPotter, nevilleLongbottom,
                    ronWeasley, lunaLovegood, ginnyWeasley, fredWeasley, georgeWeasley,
                    choChang, cedricDiggory, seamusFinnigan, lavenderBrown, deanThomas,
                    padmaPatil, parvatiPatil
            ));

            Room room1 = new Room(HouseType.GRYFFINDOR, Set.of(hermioneGranger, harryPotter, nevilleLongbottom, ronWeasley, fredWeasley, georgeWeasley, lavenderBrown, deanThomas, seamusFinnigan));
            Room room2 = new Room(HouseType.HUFFLEPUFF, Set.of(cedricDiggory, ginnyWeasley));
            Room room3 = new Room(HouseType.RAVENCLAW, Set.of(lunaLovegood, choChang, padmaPatil, parvatiPatil));
            Room room4 = new Room(HouseType.SLYTHERIN, Set.of(dracoMalfoy));

            roomRepository.saveAll(Arrays.asList(room1, room2, room3, room4));

        };
    }

}
