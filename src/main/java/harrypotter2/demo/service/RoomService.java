package harrypotter2.demo.service;

import harrypotter2.demo.controller.StudentNotFound;
import harrypotter2.demo.model.Room;
import harrypotter2.demo.model.Student;
import harrypotter2.demo.model.types.HouseType;
import harrypotter2.demo.model.types.PetType;
import harrypotter2.demo.repository.RoomRepository;
import harrypotter2.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoomService {

    private final RoomRepository roomRepository;

    private final StudentRepository studentRepository;

    public RoomService(RoomRepository roomRepository, StudentRepository studentRepository) {
        this.roomRepository = roomRepository;
        this.studentRepository = studentRepository;
    }

    public Room createNewEmptyRoom() {
        return new Room(HouseType.GRYFFINDOR, null);
    }

    public List<Room> getEmptyRooms() {
        List<Room> allRoom = roomRepository.findAll();
        List<Room> emptyRooms = new ArrayList<>();
        for (Room room : allRoom) {
            if (room.getStudents().size() == 0) {
                emptyRooms.add(room);
            }
        }
        return emptyRooms;
    }

    public void assignStudentToRoom(Long studentId) throws StudentNotFound {
        List<Room> emptyRooms = getEmptyRooms();
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFound("This student does not go to Hogwarts."));
        Room firstEmptyRoom = emptyRooms.stream().findFirst().orElse(null);
        Set<Student> students = new HashSet<>();
        students.add(student);
        assert firstEmptyRoom != null;
        firstEmptyRoom.setStudents(students);
        roomRepository.save(firstEmptyRoom);
    }

    public List<Room> findSafeRoomForRonsRat() {
        List<Room> safeRooms = new ArrayList<>();
        List<Room> allRooms = roomRepository.findAll();
        for (Room room : allRooms) {
            for (Student student : room.getStudents()) {
                if (student.getPetType() != PetType.CAT && student.getPetType() != PetType.OWL) {
                    safeRooms.add(room);
                }
            }
        }
        return safeRooms;
    }

}