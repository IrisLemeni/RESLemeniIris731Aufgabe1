package org.example;

import java.time.LocalDate;

public class Ereignis {
    private int id;
    private String characterName;

    private Stufe stufe;
    private String description;
    private LocalDate date;
    private double kraftPunkte;

    public Ereignis(int id, String characterName, Stufe stufe, String description, LocalDate date, double kraftPunkte) {
        this.id = id;
        this.characterName = characterName;
        this.stufe = stufe;
        this.description = description;
        this.date = date;
        this.kraftPunkte = kraftPunkte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Stufe getStufe() {
        return stufe;
    }

    public void setStufe(Stufe stufe) {
        this.stufe = stufe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getKraftPunkte() {
        return kraftPunkte;
    }

    public void setKraftPunkte(double kraftPunkte) {
        this.kraftPunkte = kraftPunkte;
    }
}


