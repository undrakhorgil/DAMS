package edu.miu.dams.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Appointment {
    private UUID appointmentId;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private Patient patient;

    public Appointment(UUID appointmentId, LocalDate appointmentDate, LocalTime appointmentTime, Patient patient) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
    }

    public Appointment() {
    }

    public UUID getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(UUID appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +
                ", patient=" + patient +
                '}';
    }
}
