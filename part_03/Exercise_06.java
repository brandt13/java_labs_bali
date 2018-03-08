package part_03;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        // ?????????????????????????????????????????????????????????
        // ?????????????????????????????????????????????????????????
        // ?????????????????????????????????????????????????????????
        // no idea on this one, found a different way on the internet. i did, however,
        // edit it to accept a time zone change and added am and pm:

        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        System.out.println();


        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        String time = getDurationBreakdown(totalMilliseconds, timeZoneChange);
        System.out.println(time);

//        // Get total seconds since midnight, 1/1/1970
//
//        long totalSeconds = totalMilliseconds/1000;
//
//        // Get the current second within the minute within the hour
//
//        long totalMinutes = totalSeconds/60;
//        long totalHours = totalMinutes/60;
//
//
//        // Get total minutes
//
//        // Get the current minute in the hour
//
//        // Get the total hours
//
//        // Get the current hour
//
//        // Display results using a 12 hour clock, include AM or PM

    }

    public static String getDurationBreakdown(long millis, long timeZoneChange) {
        if(millis < 0) {
            throw new IllegalArgumentException("Duration must be greater than zero!");
        }

        long days = TimeUnit.MILLISECONDS.toDays(millis);
        millis -= TimeUnit.DAYS.toMillis(days);
        long hours = TimeUnit.MILLISECONDS.toHours(millis);
        millis -= TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        millis -= TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);

        StringBuilder sb = new StringBuilder(64);
        System.out.print("Current time: ");

        hours = hours + timeZoneChange;
        String ampm = "";
        if (hours < 0){
            hours = 24 + hours;
        }
        if (hours > 12){
            hours = hours - 12;
            ampm = " pm";
        } else ampm = " am";

        sb.append(hours);
        if (minutes < 10) {
            sb.append(":0");
            sb.append(minutes);
        } else{
            sb.append(":");
            sb.append(minutes);
        }
        if (seconds < 10) {
            sb.append(":0");
            sb.append(seconds);
        } else{
            sb.append(":");
            sb.append(seconds);
        }
        sb.append(ampm);

        return(sb.toString());
    }
}
