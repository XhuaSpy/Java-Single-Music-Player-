package edu.jperaza.musicplatform.model;

import java.util.PriorityQueue;
import java.util.Queue;

public class MPlayer {
    private final Integer VOLUME_CHANGE_VALUE = 2;
    private MPlayer instance;

    private enum SongState{
        PLAY ("Playing"),
        PAUSE ("Paused"),
        STOP ("Stopped");

        final String state;

        SongState(String state) { this.state = state; }

        @Override
        public String toString() {return state;}
    }

    private Queue<Song> queuePleyer;
    private Integer VolumenStatus;
    private SongState state;

    private MPlayer() {
        this.queuePleyer = new PriorityQueue<>();
        state = SongState.STOP;
    }

    public MPlayer getInstance() {
        if (this.instance == null)
            this.instance = new MPlayer();

        return instance;
    }

    public void play() {
    }

}
