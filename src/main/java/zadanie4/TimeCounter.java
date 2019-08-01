package zadanie4;


import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Random;
@Data
public class TimeCounter implements Runnable {

    private boolean timer=true;
    private int elapsTime = 1;

    @Override

    public void run() {
        timer=true;
        System.out.println(LocalDateTime.now());
        LocalDateTime start =LocalDateTime.now();
        long sleep =0;

        while (timer) {
            try {
                Thread.sleep(1000-sleep);


            } catch (InterruptedException e) {
                break;
            }
            System.out.println(elapsTime);
            elapsTime++;
            sleep=(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)-start.toEpochSecond(ZoneOffset.UTC))-elapsTime;

        }
        System.out.println(LocalDateTime.now());
    }

    public void timerStop(){
        timer=false;
        elapsTime=0;
    }

    public void timerPause(){
        timer=false;

    }

}
