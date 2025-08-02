package edu.miu.dams;

import edu.miu.dams.service.AppointmentService;
import edu.miu.dams.util.JSONConverterUtil;

public class DentalAppointmentManagementSystem {
    public static void main(String[] args) {
        System.out.println("_______________________List info__________________________________");
        // Process data
        var appointmentService = new AppointmentService();

        String input = "1st Quarter of the year 2025";
        var appointmentGivenQuater = appointmentService.getAppointmentGivenQuater(input);
        var appointments = JSONConverterUtil.convertPatientArrayToJSON(appointmentGivenQuater);
        System.out.println(appointments);
    }
}
