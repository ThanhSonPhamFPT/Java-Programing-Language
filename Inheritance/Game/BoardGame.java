package com.java.inheritance.Game;

public class BoardGame extends Game{
    private int minPlayers;
    private int maxPlayers;
    private int timeLimit;

    public BoardGame(String description, int minPlayers, int maxPlayers, int timeLimit) {
        super(description);
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.timeLimit = timeLimit;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return super.toString() +
                "minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                ", timeLimit=" + timeLimit +" minutes";
    }
}
