package io.alexc.classroomtask;

import io.alexc.classroomtask.entity.Classroom;
import io.alexc.classroomtask.entity.ClassroomLog;
import io.alexc.classroomtask.service.ClassroomLogService;
import io.alexc.classroomtask.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
@EnableTask
public class ClassroomTaskApplication {



//    @Bean
//    public CommandLineRunner commandLineRunner() {
//        return new ClassroomLogApplicationCommandLineRunner();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ClassroomTaskApplication.class, args);
    }

//    public static class ClassroomLogApplicationCommandLineRunner implements CommandLineRunner {
//
//        @Autowired
//        private ClassroomService classroomService;
//
//        @Autowired
//        private ClassroomLogService classroomLogService;
//
//
//        @Override
//        public void run(String... args) throws Exception {
//
//            Collection<Classroom> allClassrooms =
//
//
//        }
//    }
}
