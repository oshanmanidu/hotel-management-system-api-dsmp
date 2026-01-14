package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponseDto;

public interface FacilityService {
    public void create(RequestFacilityDto dto);
    public void update(RequestFacilityDto dto, String facilityId);
    public void delete(String facilityId);
    public ResponseHotelDto findById(String facilityId);
    public RoomPaginateResponseDto findAll(int page, int size, String roomId);
}
