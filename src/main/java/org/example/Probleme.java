package org.example;

import java.util.List;

public class Probleme {
    public void characterByPoints(double kraftPoints, List<Ereignis> ereignisList){
        ereignisList.stream().filter(c->c.getKraftPunkte() > kraftPoints).map(c-> c.getCharacterName()).distinct().forEach(c -> System.out.println(c));
    }


}
