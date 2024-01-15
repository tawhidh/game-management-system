package com.seu.gamemanagementsystem.model.dao;

import com.seu.gamemanagementsystem.model.dto.GameDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "slot")
@Accessors(chain = true)
public class SlotDao {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "slot_id")
    private String slotId;

    @Column(name = "game")
    private GameDto game;

    @Column(name = "playing_date")
    private Timestamp playingDate;

    @Column(name = "slot_time")
    private String slotTime;

    @Column(name = "user_id")
    private Integer maxPlayer;
}
