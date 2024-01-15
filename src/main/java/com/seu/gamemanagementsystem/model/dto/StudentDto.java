package com.seu.gamemanagementsystem.model.dto;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class StudentDto {
    @Nullable
    private Long id;
    private String studentId;
    private String studentName;
    private String department;
    private String address;
    private String email;
    private String mobile;
    private String gender;
    private List<GameDto> registeredGames;
}
