package pl.kamil.hotelsapplication.remote.rest.dto.response;

import pl.kamil.hotelsapplication.domain.model.ReservationStatusType;
import pl.kamil.hotelsapplication.remote.rest.dto.request.HotelReservationDto;
import pl.kamil.hotelsapplication.remote.rest.dto.request.PersonReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private PersonReservationDto person;
    private List<HotelReservationDto> hotels;
}
