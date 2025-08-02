package edu.miu.dams.dao;

import edu.miu.dams.model.Patient;
import edu.miu.dams.model.Appointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class ApppointmentDAO {
    private static ApppointmentDAO instance;

    private Appointment[] appointments = null;

    // Private constructor to prevent instantiation
    private ApppointmentDAO() {
    }

    // Public method to provide access to the single instance
    public static synchronized ApppointmentDAO getInstance() {
        if (instance == null) {
            // Lazy initialization of the singleton instance
            // This ensures that the instance is created only when it is needed.
            instance = new ApppointmentDAO();
        }
        return instance;
    }

    private void loadData() {
        this.appointments = new Appointment[] {
                new Appointment(
                        UUID.randomUUID(),
                        LocalDate.of(2025, 2, 28),
                        LocalTime.of(10, 5),
                        new Patient(
                                UUID.randomUUID(),
                                "John",
                                "Smith",
                                "(641) 001-1234",
                                LocalDate.of(1987, 1, 19)
                        )
                ),
                new Appointment(
                        UUID.randomUUID(),
                        LocalDate.of(2024, 12, 31),
                        LocalTime.of(13, 45),
                        new Patient(
                                UUID.randomUUID(),
                                "Anna",
                                "Jones",
                                "(319) 716-1987",
                                LocalDate.of(2001, 7, 26)
                        )
                ),
                new Appointment(
                        UUID.randomUUID(),
                        LocalDate.of(2025, 5, 4),
                        LocalTime.of(14, 0),
                        new Patient(
                                UUID.randomUUID(),
                                "Carlos",
                                "Jimenez",
                                "(319) 098-7711",
                                LocalDate.of(1969, 11, 5)
                        )
                ),
                new Appointment(
                        UUID.randomUUID(),
                        LocalDate.of(2025, 3, 16),
                        LocalTime.of(11, 15),
                        new Patient(
                                UUID.randomUUID(),
                                "Albert",
                                "Einstein",
                                "(641) 119-6142",
                                LocalDate.of(1955, 12, 28)
                        )
                )
        };
    }




    /**
     * Fetches the Patients data from the data source.
     * If the array is null or empty, loads the data first.
     * @return patients the array of Patients
     */
    public Appointment[] getPatients() {
        if (appointments == null || appointments.length == 0) {
            loadData();
        }
        return appointments;
    }
}
