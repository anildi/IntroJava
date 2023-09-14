package org.ttl.javafundas.solutions.interfaces;

/**
 * @author whynot
 */
public class UVSensor implements SolutionEnvSensor {

    @Override
    public void takeReading() {
        System.out.println("Taking UV Reading");
    }
}
