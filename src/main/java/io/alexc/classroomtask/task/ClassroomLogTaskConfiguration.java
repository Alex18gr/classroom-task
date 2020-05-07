package io.alexc.classroomtask.task;

import io.alexc.classroomtask.entity.Classroom;
import io.alexc.classroomtask.entity.ClassroomLog;
import io.alexc.classroomtask.entity.Student;
import io.alexc.classroomtask.service.ClassroomLogService;
import io.alexc.classroomtask.service.ClassroomService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.transaction.Transactional;
import java.util.Collection;

@Configuration
public class ClassroomLogTaskConfiguration {

    private final Logger logger = LogManager.getLogger(ClassroomLogTaskConfiguration.class);

    @Autowired
    private ClassroomService classroomService;

    @Autowired
    private ClassroomLogService classroomLogService;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {

            Collection<Classroom> classrooms = this.classroomService.findAllClassrooms();
            for (Classroom classroom : classrooms) {

                Collection<Student> students = this.classroomService.findAllClassroomStudents(classroom);

                double average = 0;
                for (Student student : students) {
                    average += student.getGrade();
                }
                average = average / students.size();

                classroom.setGradesAverage(average);

                this.classroomService.saveClassroom(classroom);
                this.classroomLogService.save(new ClassroomLog("Average for classroom: " + classroom.getName() +
                        " claculated to: " + average));
                logger.debug("Average for classroom: " + classroom.getName() +
                        " claculated to: " + average);

            }

        };
    }


}
