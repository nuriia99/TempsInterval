package junit.interval;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntervalTest {
    private Interval interval;

    @Before
    public void TestIntervalHoraIniciNegativa throws Exception(){
        Interval int = new Interval(-1,13);
        assertTrue(-1 < 0);
    }
    
    @Before
    public void TestIntervalHoraIniciMesGran throws Exception(){
        Interval int = new Interval(13,10);
        assertTrue(13 > 10);
    }

    @Before
    public void TestIntervalHoresIguals throws Exception(){
        Interval int = new Interval(11,11);
        assertTrue(11 == 11);
    }

    @Before
    public void TestIntervalHoraIniciMayor23 throws Exception(){
        Interval int = new Interval(25,3);
        assertTrue(25 > 23);
    }

    @Before
    public void TestIntervalHoraFinalMayor23 throws Exception(){
        Interval int = new Interval(6,28);
        assertTrue(28 > 23);
    }
    

    public void TestTemps(){

    }

    public void TestPeriodeDia(){

    }

    public void TestHoresMatiInterval(){

    }

    public void TestInterval(int h1, int h2){

    }



}
