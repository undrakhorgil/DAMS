package edu.miu.dams.util;

import edu.miu.dams.dto.AppointmentDTO;
import org.json.JSONArray;

import java.util.Arrays;

public class JSONConverterUtil {

    public static String convertPatientArrayToJSON(AppointmentDTO[] patients) {
        JSONArray jsonArray = new JSONArray();
        Arrays.stream(patients).forEach(patient -> {
            jsonArray.put(patient.toJSON());
        });
        return jsonArray.toString(2);
    }

}
