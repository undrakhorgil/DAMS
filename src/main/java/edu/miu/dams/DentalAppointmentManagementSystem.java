package edu.miu.dams;

import edu.miu.dams.service.AppointmentService;
import edu.miu.dams.util.JSONConverterUtil;

import java.util.Scanner;

public class DentalAppointmentManagementSystem {
    public static void main(String[] args) {
        System.out.println("_______________________List info__________________________________");
        // Process data

        try {
            String input;
            if (args.length > 0) {
                // Use the first command-line argument as the input quarter
                input = String.join(" ", args);
            } else {
                // Prompt user to enter quarter via console if no argument provided
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the Quarter you want to view appointments for (e.g., '1st Quarter of the year 2025'): ");
                input = scanner.nextLine();
            }

            var appointmentService = new AppointmentService();


        var appointmentGivenQuater = appointmentService.getAppointmentGivenQuater(input);
        var appointments = JSONConverterUtil.convertPatientArrayToJSON(appointmentGivenQuater);
        System.out.println(appointments);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
