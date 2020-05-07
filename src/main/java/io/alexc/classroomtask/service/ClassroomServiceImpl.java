package io.alexc.classroomtask.service;

import io.alexc.classroomtask.entity.Classroom;
import io.alexc.classroomtask.entity.Student;
import io.alexc.classroomtask.repository.ClassroomRepository;
import io.alexc.classroomtask.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    private final ClassroomRepository classroomRepository;

    private final StudentRepository studentRepository;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository, StudentRepository studentRepository) {
        this.classroomRepository = classroomRepository;
        this.studentRepository = studentRepository;
    }


    @Override
    public Collection<Classroom> findAllClassrooms() {
        return this.classroomRepository.findAll();
    }

    @Override
    public Classroom saveClassroom(Classroom classroom) {
        return this.classroomRepository.save(classroom);
    }

    @Override
    public Collection<Student> findAllClassroomStudents(Classroom classroom) {
        return this.studentRepository.findAllByClassroom(classroom);
    }


}
