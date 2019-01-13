package stage6.hw22;

/**
 * Given a class named Clock. It has two int fields: hours and minutes. The clock has the minute scale from 0 to 59
 * and the hour scale from 1 to 12. The clock does not know, now it's day or night.
 * <p>
 * Add the method next that increases minutes by 1. The minutes must be reset to zero when the current hour ends.
 * Do not forget to change hours as well.
 */
public class Main {
}

class Clock {

    int hours = 12;
    int minutes = 0;

    public void next() {
        if (this.minutes == 59) {
            this.minutes = 0;
            if (this.hours == 12) {
                this.hours = 1;
            } else {
                this.hours += 1;
            }
        } else {
            this.minutes += 1;
        }
    }
}