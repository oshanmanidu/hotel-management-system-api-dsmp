package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.entity.Hotel;
import com.cpd.hotel_system.hotel_management_service_api.repo.HotelRepo;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_service_api.utill.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;
    @Override
    public void create(RequestHotelDto dto) {

    }

    @Override
    public void update(RequestHotelDto dto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    //map-struct
    private Hotel toHotel(RequestHotelDto dto)  {
        return dto==null? null:
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelIDd(UUID.randomUUID().toString())
                        .starRating(String.valueOf(dto.getStarRating()))
                        .descripton(byteCodeHandler.stringToBlob(dto.getDescription() ))
                        .createdAt(String.valueOf(LocalDateTime.now()))
                        .updatedAt(String.valueOf(LocalDateTime.now()))
                        .startingFrom(dto.getStartingFrom())
                        .build();
    }

}
