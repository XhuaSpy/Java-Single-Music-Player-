package edu.jperaza.musicplatform.model;

import edu.jperaza.musicplatform.model.interfaces.AbstractEntity;

public class User implements AbstractEntity {
    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
