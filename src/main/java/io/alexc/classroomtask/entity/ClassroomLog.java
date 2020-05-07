package io.alexc.classroomtask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "classroom_logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassroomLog {

    public ClassroomLog(String message) {
        this.message = message;
        this.timestamp = new Date();
    }

    @Id
    @Column(name = "log_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "log_message")
    private String message;

    @Column(name = "log_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

}
