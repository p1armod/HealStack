package org.example.DTO.AppointmentDTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentDTO {
    private Long id;
    private String reason;
    private String status;
    private LocalDateTime appointmentTime;
    private Long patientId;
    private Long doctorId;
}
