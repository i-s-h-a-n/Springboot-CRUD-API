package com.example.springbootbackend.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DowntimeToFrom {
    private LocalDateTime downFrom;
    private LocalDateTime downTo;
}