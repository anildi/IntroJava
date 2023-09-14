package org.ttl.javafundas.solutions.interfaces;

/**
 * @author whynot
 */
public class TemperatureSensor implements SolutionEnvSensor {

    @Override
    public void takeReading() {
        System.out.println("Taking Temperature Reading");
    }
}
