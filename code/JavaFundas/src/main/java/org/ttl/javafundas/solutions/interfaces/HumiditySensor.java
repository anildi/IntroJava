package org.ttl.javafundas.solutions.interfaces;

/**
 * @author whynot
 */
public class HumiditySensor implements SolutionEnvSensor {

    @Override
    public void takeReading() {
        System.out.println("Taking Humidity Reading");
    }
}
