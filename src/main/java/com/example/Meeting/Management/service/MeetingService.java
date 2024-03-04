package com.example.Meeting.Management.service;

import com.example.Meeting.Management.data.Meeting;
import com.example.Meeting.Management.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService{
    @Autowired
    private MeetingRepository meetingRepository;

    public Meeting saveMeeting(Meeting meeting) {

        return meetingRepository.save(meeting);
    }
}
