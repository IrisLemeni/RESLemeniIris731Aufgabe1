package org.example;

import java.util.List;

public class Probleme {
    public void characterByPoints(double kraftPoints, List<Ereignis> ereignisList){
        ereignisList.stream()
                .filter(c->c.getKraftPunkte() > kraftPoints)
                .map(c-> c.getCharacterName()).distinct()
                .forEach(c -> System.out.println(c));
    }

    public void stufeSort(List<Ereignis> ereignisList){
        System.out.println("Ereignisse der Stufe Jonin:");
        ereignisList.stream()
                .filter(e -> e.getStufe() == Stufe.Jonin)
                .sorted((e1, e2) -> e2.getDate().compareTo(e1.getDate()))
                .forEach(e -> System.out.println(e.getDate() + ": " + e.getCharacterName() + " - " + e.getDescription()));
    }


}
