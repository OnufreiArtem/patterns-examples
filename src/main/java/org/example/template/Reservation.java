package org.example.template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {

    private Doctor doctor;
    private Patient patient;
    private LocalDateTime time;
    private Boolean finished;

}
