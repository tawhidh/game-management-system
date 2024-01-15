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
public class GameDto {
    @Nullable
    private Long id;
    private String gameId;
    private String gameName;
    private String gameType;
    private Integer boardNumber;
    private List<SlotDto> slots;

}
