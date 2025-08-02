package edu.miu.dams.service;

import edu.miu.dams.dao.ApppointmentDAO;
import edu.miu.dams.dto.PatientDTO;
import edu.miu.dams.dto.AppointmentDTO;

import java.time.LocalDate;
import java.util.Arrays;

import static edu.miu.dams.util.Quarter.getQuarterEndDate;
import static edu.miu.dams.util.Quarter.getQuarterStartDate;


public class AppointmentService {
    private final ApppointmentDAO apppointmentDAO;

    public AppointmentService() {
        this.apppointmentDAO = ApppointmentDAO.getInstance();
    }

    public AppointmentDTO[] getAppointmentGivenQuater(String quarterYear) {


        LocalDate start = getQuarterStartDate(quarterYear);
        LocalDate end = getQuarterEndDate(quarterYear);


        var appointments = apppointmentDAO.getPatients();
        return Arrays.stream(appointments)
                .filter(p->p.getAppointmentDate().isAfter(start)  && p.getAppointmentDate().isBefore(end))
                .map(p -> new AppointmentDTO(
                        p.getAppointmentId().toString(),
                        p.getAppointmentDate(),
                        p.getAppointmentTime(),
                        (new PatientDTO(
                                p.getPatient().getFirstName(),
                                p.getPatient().getLastName(),
                                p.getPatient().getPhoneNumber(),
                                p.getPatient().getBirthDate()
                        )
                ))).toArray(AppointmentDTO[]::new);
    }




}
