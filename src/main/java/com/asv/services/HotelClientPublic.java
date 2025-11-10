package com.asv.services;

import com.asv.models.roomdto.RoomDTO;
import com.asv.models.roomdto.RoomSimpleDataBaseDTO;
import com.asv.models.servicehoteldto.ServiceHotelDTO;
import com.asv.models.userdto.UserDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "hotel")
public interface HotelClientPublic {

    @GetMapping("/rooms")
    ResponseEntity<List<RoomDTO>> getAllRooms();

    @GetMapping("/rooms/{number}")
    ResponseEntity<RoomDTO> getRoomByNumber(
            @PathVariable("number") String number);


    @GetMapping("/bookings/date")
    ResponseEntity<List<RoomSimpleDataBaseDTO>> getFreeRoomsBetweenDates(@RequestParam
                                                                         LocalDate checkin,
                                                                         @RequestParam
                                                                         LocalDate checkOut);

    @GetMapping("/services")
    ResponseEntity<List<ServiceHotelDTO>> getAll();

    @PostMapping("/users")
    ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO);



}
