package io.alexc.classroomtask.repository;

import io.alexc.classroomtask.entity.Classroom;
import io.alexc.classroomtask.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {
}
