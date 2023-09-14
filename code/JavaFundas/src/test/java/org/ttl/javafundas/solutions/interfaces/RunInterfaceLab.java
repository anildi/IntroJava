package org.ttl.javafundas.solutions.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class RunInterfaceLab {

    @Test
    public void testSensors() {
        //TODO - uncomment out this code and make it compile and run.
        // You will have to write some new code, and change some existing
        // code.  You should make your sensors print out a message indicating
        // the operation they are performing when their 'takeReading' methods
        // is called.
        // i.e. Temperature Sensors say "Taking temperature", etc.

        SolutionEnvSensor[] sensors = new SolutionEnvSensor[3];
        sensors[0] = new TemperatureSensor();
        sensors[1] = new HumiditySensor();
        sensors[2] = new UVSensor();

        for(SolutionEnvSensor s : sensors) {
            s.takeReading();
        }

        assertEquals(UVSensor.class, sensors[2].getClass());
    }
}
