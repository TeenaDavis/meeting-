package com.example.Meeting.Management.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name="Meeting")
public class MeetingDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject")
    private String subject;
    @Column(name="start time")
    private String startTime;
    @Column(name="end time")
    private String endTime;
    @Column(name="meeting link")
    private String meetingLink;
    @Column(name="department")
    private String department;
    @Column(name="description")
    private String description;
    @Column(name="date")
    private String date;


}

