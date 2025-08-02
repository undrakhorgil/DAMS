package edu.miu.dams.dto;

import org.json.JSONObject;

import java.time.LocalDate;

public record PatientDTO(
     String firstName,
             String lastName,
             String phoneNumber,
             LocalDate birthDate
) {
    public JSONObject toJSON() {
        var addressJSONObject = new JSONObject();
        addressJSONObject.put("firstName", firstName);
        addressJSONObject.put("lastName", lastName);
        addressJSONObject.put("phoneNumber", phoneNumber);
        addressJSONObject.put("birthDate", birthDate);
        return addressJSONObject;
    }
}
