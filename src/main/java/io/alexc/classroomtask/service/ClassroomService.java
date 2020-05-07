package io.alexc.classroomtask.service;

import io.alexc.classroomtask.entity.Classroom;
import io.alexc.classroomtask.entity.Student;

import java.util.Collection;

public interface ClassroomService {

    Collection<Classroom> findAllClassrooms();

    Classroom saveClassroom(Classroom classroom);

    Collection<Student> findAllClassroomStudents(Classroom classroom);

}
