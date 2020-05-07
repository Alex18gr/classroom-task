package io.alexc.classroomtask.service;

import io.alexc.classroomtask.entity.ClassroomLog;
import io.alexc.classroomtask.repository.ClassroomLogRepository;
import io.alexc.classroomtask.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomLogServiceImpl implements ClassroomLogService {

    private final ClassroomLogRepository classroomLogRepository;

    public ClassroomLogServiceImpl(ClassroomLogRepository classroomLogRepository) {
        this.classroomLogRepository = classroomLogRepository;
    }

    @Override
    public ClassroomLog save(ClassroomLog classroomLog) {
        return this.classroomLogRepository.save(classroomLog);
    }
}
