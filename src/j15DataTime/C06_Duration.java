package j15DataTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime GECE= LocalTime.of(0,23);
        LocalTime Gunduz= LocalTime.of(13,45);

        Duration fark1=Duration.between(GECE,Gunduz);
        Duration fark2=Duration.between(GECE,Gunduz);
        System.out.println(fark1);
        System.out.println(fark2);

        System.out.println(fark2.getSeconds());

    }
}
