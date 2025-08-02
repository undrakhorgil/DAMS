package edu.miu.dams.dto;

import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalTime;

public record AppointmentDTO(
                 String appointmentId,
                 LocalDate appointmentDate,
                 LocalTime appointmentTime,
                 PatientDTO patient
) {
    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appointmentId", appointmentId);
        jsonObject.put("appointmentDate", appointmentDate);
        jsonObject.put("appointmentTime", appointmentTime);
        jsonObject.put("patient", patient.toJSON());

        return  jsonObject;
    }
}
