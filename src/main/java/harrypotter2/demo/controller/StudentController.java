package harrypotter2.demo.controller;

import harrypotter2.demo.model.Room;
import harrypotter2.demo.model.Student;
import harrypotter2.demo.model.types.HouseType;
import harrypotter2.demo.model.types.PetType;
import harrypotter2.demo.repository.RoomRepository;
import harrypotter2.demo.repository.StudentRepository;
import harrypotter2.demo.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("students")
    public List<Student> get() {
        return studentRepository.findAll();
    }


}
