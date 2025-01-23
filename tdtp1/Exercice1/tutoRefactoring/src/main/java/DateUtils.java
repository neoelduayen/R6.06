import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }

    public static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate now, boolean inclusive) {

        LocalDate startingDay;
        LocalDate endingDay;

        if (inclusive) {
            startingDay = startingDate.minusDays(1);
            endingDay = endingDate.plusDays(1);
        } else {
            startingDay = startingDate;
            endingDay = endingDate;
        }

        return now.isAfter(startingDay)
                &&
                now.isBefore(endingDay);
    }

    public static boolean isDateOut(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return !isDateBetween(date, startingDate, endingDate, false );
    }
}