package edu.jperaza.musicplatform.model.util;

public enum Visibility {
    PUBLIC ("Public"),
    PRIVATE ("Private");

    final String visibility;

    Visibility(String name){ visibility = name;}

    @Override
    public String toString() {
        return visibility;
    }

}
