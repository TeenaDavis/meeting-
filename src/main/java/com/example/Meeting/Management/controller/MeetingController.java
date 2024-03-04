package com.example.Meeting.Management.controller;

import com.example.Meeting.Management.data.Meeting;
import com.example.Meeting.Management.repository.MeetingRepository;
import com.example.Meeting.Management.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meetings")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;


    @PostMapping
    public Meeting saveMeeting(@RequestBody Meeting meeting) {
        return  meetingService.saveMeeting(meeting);

    }

}

