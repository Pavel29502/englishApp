package com.example.english1.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "registrations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "email", nullable = false)

    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "telegram_nick")
    private String telegramNick;

//    @Column(name = "created_at", updatable = false)
//    private java.sql.Timestamp createdAt;

}



