package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Probleme probleme = new Probleme();
        Scanner scanner = new Scanner(System.in);
        List<Ereignis> ereignisList = new ArrayList<>();
        JsonReader.readFromJson("ninja_events.json", ereignisList);

        System.out.println("Give Kraftpunkte: ");
        double points = Double.valueOf(scanner.nextLine());
        probleme.characterByPoints(points, ereignisList);


    }
}
