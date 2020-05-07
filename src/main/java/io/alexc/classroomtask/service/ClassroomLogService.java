package io.alexc.classroomtask.service;

import io.alexc.classroomtask.entity.ClassroomLog;
import org.springframework.stereotype.Service;

public interface ClassroomLogService {

    ClassroomLog save(ClassroomLog classroomLog);

}
