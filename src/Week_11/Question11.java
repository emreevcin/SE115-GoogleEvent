package Week_11;

/*
    Question: The duration of a song can be represented by the number of minutes and the number of seconds of the song’s length. These two values are always integers. For example, a song can be 3 minutes and 25 seconds long.
Write a function that accepts a list of duration values and returns the total duration.
Hint: Do not forget that a minute is 60 seconds long. There is no duration such as 3 minutes
and 100 seconds; that must be 4 minutes and 40 seconds.

 */

public class Question11 {
    public static int[] getTotalDuration(int[][] durations) {
        int totalMinutes = 0;
        int totalSeconds = 0;
        for (int[] duration : durations) {
            totalMinutes += duration[0];
            totalSeconds += duration[1];
            if (totalSeconds >= 60) {
                totalMinutes += totalSeconds / 60;
                totalSeconds %= 60;
            }
        }
        return new int[]{totalMinutes, totalSeconds};
    }
    public static void main(String[] args) {
        int[][] durations = {
                {3, 25}, // 3 minutes 25 seconds
                {2, 45}, // 2 minutes 45 seconds
                {1, 50}  // 1 minute 50 seconds
        };
        int[] totalDuration = getTotalDuration(durations);
        System.out.println("Total Duration: " + totalDuration[0] + " minutes " + totalDuration[1] + " seconds");
    }
}
