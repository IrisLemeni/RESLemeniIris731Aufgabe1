package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
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

    public void fileWrite(HashMap<Stufe, Integer> stufePoints){
        System.out.println("Ergebnis in gesammtzahl.txt");
        try (FileWriter fileWriter = new FileWriter("gesammtzahl.txt")) {
            stufePoints.entrySet().stream()
                    .sorted((a, b) -> {
                        int countComparison = Integer.compare(b.getValue(), a.getValue());
                        if (countComparison == 0) {
                            // If event counts are the same, sort by house name alphabetically
                            return a.getKey().name().compareTo(b.getKey().name());
                        }
                        return countComparison;
                    })
                    .forEach(entry -> {
                        try {
                            fileWriter.write(entry.getKey() + "%" + entry.getValue() + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
