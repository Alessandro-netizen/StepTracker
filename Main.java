public class Main {
    public static void main(String[] args) {
        // Test APCalendar
        System.out.println("--- APCalendar Tests ---");
        System.out.println("Number of leap years between 2000 and 2024 (inclusive): " +
                           APCalendar.numberOfLeapYears(2000, 2024));
        System.out.println("Day of the week for January 1, 2024: " +
                           APCalendar.dayOfWeek(1, 1, 2024));
        System.out.println("Day of the week for January 5, 2019: " +
                           APCalendar.dayOfWeek(1, 5, 2019));
        System.out.println("Day of the week for January 10, 2019: " +
                           APCalendar.dayOfWeek(1, 10, 2019));
        System.out.println("Day of the week for May 2, 2025: " +
                           APCalendar.dayOfWeek(5, 2, 2025));

        // Test StepTracker
        System.out.println("\n--- StepTracker Tests ---");
        StepTracker tracker = new StepTracker(10000);
        System.out.println("Initial active days: " + tracker.activeDays());
        System.out.println("Initial average steps: " + tracker.averageSteps());

        tracker.addDailySteps(9000);
        tracker.addDailySteps(5000);
        System.out.println("Average steps after 2 days: " + tracker.averageSteps());

        tracker.addDailySteps(13000);
        System.out.println("Active days after 3 days: " + tracker.activeDays());
        System.out.println("Average steps after 3 days: " + tracker.averageSteps());

        tracker.addDailySteps(23000);
        tracker.addDailySteps(1111);
        System.out.println("Active days after 5 days: " + tracker.activeDays());
        System.out.println("Average steps after 5 days: " + tracker.averageSteps());
    }
}
