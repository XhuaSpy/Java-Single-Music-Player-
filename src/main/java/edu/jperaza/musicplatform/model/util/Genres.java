package edu.jperaza.musicplatform.model.util;

public enum Genres {
    ROCK ("Rock"),
    METAL ("Metal"),
    REGUETON ("Regueton"),
    VALADA ("Valada"),
    ROMANTIC ("Romantic"),
    CUMBIA ("Cumbia"),
    JAZZ ("Jazz"),
    POP ("Pop"),
    KPOP ("Kpop");

    final String name;

    Genres (String name) {this.name = name;}

    @Override
    public String toString() {
        return name;
    }
}
