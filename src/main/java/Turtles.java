import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static void main(String[] args){
        GCD gcd1 = new GCD();
        GCD gcd2 = new GCD();

        Instant start = Instant.now();
        gcd1.recursion(21023, 306);
        Instant stop = Instant.now();

        // using nanos because .toMillis kept giving back 0
        long timeElapsed = Duration.between(start, stop).toNanos();

        Instant start2 = Instant.now();
        gcd2.recursion(210267, 306);
        Instant stop2 = Instant.now();

        long timeElapsed2 = Duration.between(start2, stop2).toNanos();

        System.out.printf("GCD #1 Time: %d nanoseconds\nGCD #2 Time: %d nanoseconds", timeElapsed, timeElapsed2);

        // time is trippy?
        // why is the second one faster than the first one?

    }
}
