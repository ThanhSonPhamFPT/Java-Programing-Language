package com.java.inheritance.Game;

public class TriviaGame extends Game{
    private int prize;
    private int nbWinningQuestions;

    public TriviaGame(String description, int prize, int nbWinningQuestions) {
        super(description);
        this.prize = prize;
        this.nbWinningQuestions = nbWinningQuestions;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getNbWinningQuestions() {
        return nbWinningQuestions;
    }

    public void setNbWinningQuestions(int nbWinningQuestions) {
        this.nbWinningQuestions = nbWinningQuestions;
    }

    @Override
    public String toString() {
        return super.toString()+
                "prize=" + prize +
                ", nbWinningQuestions=" + nbWinningQuestions;
    }
}
