package com.java.inheritance.Game;

public class TestGame {
    public static void main(String[] args){
        PCBasedGame myGame = new PCBasedGame("Warcraft 3: playing offline,online, PvP, PvC...",
                4, 100, 1.2);
        PCBasedGame mySecondGame = new PCBasedGame("Mario 3: playing for fun",
                1, 10, 1);
        TriviaGame myThirdGame = new TriviaGame("Who want to millionaire: answer ..", 1000000, 20);
        BoardGame myFinalGame = new BoardGame("Hello Game:....", 3, 10, 10);
        System.out.println(myGame);
        System.out.println(mySecondGame);
        System.out.println(myThirdGame);
        System.out.println(myFinalGame);
    }
}
