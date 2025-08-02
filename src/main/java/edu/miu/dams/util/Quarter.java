package edu.miu.dams.util;

import java.time.LocalDate;

public class Quarter {



    public static LocalDate getQuarterStartDate(String quarterYear) {
        int quarter = 1; // default
        int year = LocalDate.now().getYear(); // default

        try {
            // Input example: "1st Quarter of the year 2025"
            String[] parts = quarterYear.split(" ");
            // parts = ["1st", "Quarter", "of", "the", "year", "2025"]

            // Extract quarter number from parts[0] (e.g. "1st")
            String quarterPart = parts[0].replaceAll("[^0-9]", "");
            quarter = Integer.parseInt(quarterPart);

            // Extract year from the last part (e.g. "2025")
            year = Integer.parseInt(parts[parts.length - 1]);

        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid quarter format. Use e.g. '1st Quarter of the year 2025'");
        }

        int startMonth = (quarter - 1) * 3 + 1;
        return LocalDate.of(year, startMonth, 1);
    }

    public static LocalDate getQuarterEndDate(String quarterYear) {
        int quarter = 1; // default
        int year = LocalDate.now().getYear(); // default

        try {
            // Input example: "1st Quarter of the year 2025"
            String[] parts = quarterYear.split(" ");
            // parts = ["1st", "Quarter", "of", "the", "year", "2025"]

            // Extract quarter number from parts[0] (e.g. "1st")
            String quarterPart = parts[0].replaceAll("[^0-9]", "");
            quarter = Integer.parseInt(quarterPart);

            // Extract year from the last part (e.g. "2025")
            year = Integer.parseInt(parts[parts.length - 1]);

        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid quarter format. Use e.g. '1st Quarter of the year 2025'");
        }

        int endMonth = quarter * 3;
        LocalDate endDate = LocalDate.of(year, endMonth, 1);
        return endDate.withDayOfMonth(endDate.lengthOfMonth());
    }
}
