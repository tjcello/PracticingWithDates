/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicingwithdates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

/**
 *
 * @author tduwe
 */
public class DateUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd  hh:mm a");

        ZonedDateTime local = ZonedDateTime.now();
        local = local.withZoneSameInstant(ZoneId.of("Europe/Rome"));

        System.out.println(local.format(fmt));
    }

}
