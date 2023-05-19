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
}
    private final RoomRepository roomRepository;

    private final StudentRepository studentRepository;

    public RoomService(RoomRepository roomRepository, StudentRepository studentRepository) {
        this.roomRepository = roomRepository;
        this.studentRepository = studentRepository;
    }

    public Room createNewEmptyRoom() {
        return new Room(HouseType.GRYFFINDOR, null);
    }

