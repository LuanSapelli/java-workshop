package com.example.demo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Time {
    private int horas;    

    public Time() {

        LocalTime horaLocal = LocalTime.now();
        String horaStr = horaLocal.format(DateTimeFormatter.ofPattern("HH"));

        horas = Integer.parseInt(horaStr);
        horas *= 3600;
    }


    public List<String> acessTime() {
        // 00:00 às 05:00
        if (horas < 18000) {
            return Arrays.asList("type=music", "&type=relaxation", "&type=recreational");
        }//05:00 às 08:00
        else if (horas < 28800) {
            return Arrays.asList("type=education");
        }//08:00 às 12:00
        else if (horas < 43200) {
            return Arrays.asList("type=busywork");
        }//12:00 às 14:00
        else if (horas < 50400) {
            return Arrays.asList("type=relaxation", "&type=education", "&type=social", "&type=recreational");
        }//14:00 às 18:00
        else if (horas < 64800) {
            return Arrays.asList("type=busywork");
        //18:00 às 23:59
        } else {
            return Arrays.asList("type=music", "&type=relaxation", "&type=recreational", "&type=social", "&type=education");
        }
    }
}