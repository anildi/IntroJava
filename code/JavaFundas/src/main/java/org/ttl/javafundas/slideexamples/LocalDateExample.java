package org.ttl.javafundas.slideexamples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author whynot
 */
public class LocalDateExample {

   public void fun() {
      LocalDate sixOct1922 = LocalDate.of(1922, 10, 6);

      long yearsOld = sixOct1922.until(LocalDate.now(), ChronoUnit.YEARS);
   }
}
