import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class DigitalWatchTest {
    DigitalWatch dw = new DigitalWatch();


    @Nested
    class bottomUp{
        @Test
        public void testTime(){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime localTime = LocalTime.now();
            Assertions.assertEquals(dtf.format(localTime), dw.getTime());

        }
    }

    @Nested
    class topDown{
        @Test
        public void testTime(){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime localTime = LocalTime.now();
            Assertions.assertEquals(dtf.format(localTime), dw.getTime());

        }
    }


}