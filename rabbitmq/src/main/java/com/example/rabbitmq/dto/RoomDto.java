package com.example.rabbitmq.dto;

import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoomDto {

    private String roomId;
    private String roomName;


    public static RoomDto create(String name) {
        RoomDto room = new RoomDto();
        room.roomId = UUID.randomUUID().toString();
        room.roomName = name;
        return room;
    }
}
