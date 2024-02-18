package com.app.dto;

import java.time.LocalDate;
import java.util.List;

import com.app.entities.Bookings;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PayementDTO {
long amount;
long bookingID;
}
