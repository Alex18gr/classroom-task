package io.alexc.classroomtask.repository;

import io.alexc.classroomtask.entity.ClassroomLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomLogRepository extends JpaRepository<ClassroomLog, Integer> {
}
