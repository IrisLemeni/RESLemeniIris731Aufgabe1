package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Probleme probleme = new Probleme();
        Scanner scanner = new Scanner(System.in);
        List<Ereignis> ereignisList = new ArrayList<>();
        HashMap<Stufe, Integer> stufePoints= new HashMap<>();

        for (Stufe stufe : Stufe.values()) {
            stufePoints.put(stufe, 0);
        }


        JsonReader.readFromJson("ninja_events.json", ereignisList);
        for (Ereignis e : ereignisList) {
            stufePoints.put(e.getStufe(), stufePoints.get(e.getStufe()) + 1);
        }

        System.out.println("Give Kraftpunkte: ");
        double points = Double.valueOf(scanner.nextLine());
        probleme.characterByPoints(points, ereignisList);

        probleme.stufeSort(ereignisList);

        probleme.fileWrite(ereignisList, stufePoints);


    }
}
