package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonReader {
    public static void readFromJson(String filename, List<Ereignis> ereignise) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode root = objectMapper.readTree(new File(filename));
            for (JsonNode node : root) {
                int id = node.get("Id").asInt();
                String characterName = node.get("Charaktername").asText();
                Stufe stufe = Stufe.valueOf(node.get("Stufe").asText());
                String description = node.get("Beschreibung").asText();
                LocalDate date = LocalDate.parse(node.get("Datum").asText());
                double kraftPunkte = Double.valueOf(node.get("Kraftpunkte").asText());
                ereignise.add(new Ereignis(id, characterName, stufe, description, date,kraftPunkte));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
