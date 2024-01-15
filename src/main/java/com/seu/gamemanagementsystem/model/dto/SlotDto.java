package com.seu.gamemanagementsystem.model.dto;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SlotDto {
    @Nullable
    private Long id;
    private String slotId;
    private Timestamp slotDate;
    private String slotTime;
    private Integer maxPlayer;
    private List<GameDto> availableGames;
}
