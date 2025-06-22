package com.springyy.springyyProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("newDB")
public class springyyPojos {
    private String taskName;
    private String storyPoints;
    private String status;
    //private UUID id;
}