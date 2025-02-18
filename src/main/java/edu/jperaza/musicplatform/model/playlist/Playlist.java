package edu.jperaza.musicplatform.model.playlist;

import edu.jperaza.musicplatform.model.Song;
import edu.jperaza.musicplatform.model.interfaces.AbstractEntity;
import edu.jperaza.musicplatform.model.interfaces.INotifiable;
import edu.jperaza.musicplatform.model.util.Visibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract public class Playlist implements AbstractEntity {
    protected Integer id;
    protected String name;
    protected final List<Song> songs;
    protected final Map<Integer, INotifiable> observer;
    protected Visibility visibility;

    public Playlist() {
        this.songs = new ArrayList<>();
        this.observer = new HashMap<>();
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    abstract public void addSong(Song song);
    abstract public void addNotifiable(INotifiable notifiable);
    abstract public void removeNotifiable(Integer idNotifiable);
    abstract public void removeSong(Integer idSong);
    abstract public void removeSong(Song Song);
    abstract public void notifyObservers();
}
