package com.blz;

public class SL_1 {
    private static int dicecount = 0;
    private static final int IS_SNAKE = 1;
    private static final int IS_LADDER = 2;
    private static final int START_POSITION = 0;
    private static final int WINNING_POSITION = 100;
    private static String turn = "player1";

    public static void main(String[] args) {
        dicecount++;
        int currentpositionofplayer1 = START_POSITION;
        int currentpositionofplayer2 = START_POSITION;
        while ((currentpositionofplayer2 < WINNING_POSITION) && (currentpositionofplayer1 < WINNING_POSITION)) {
            dicecount++;
            if (turn == "player1") {
                turn = "player2";
                currentpositionofplayer1 = getposition(currentpositionofplayer1);
            } else {
                turn = "player1";
                currentpositionofplayer2 = getposition(currentpositionofplayer2);
            }
        }
        if ((currentpositionofplayer1 == 100))
            System.out.println("Player 1 Won with total Dice Count: " + dicecount);
        else
            System.out.println("Player 2 Won with total Dice Count:" + dicecount);
    }

    private static int getposition(int currentposition) {
        int dicenumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        if (option == IS_SNAKE) {
            if ((currentposition - dicenumber) > 0)
                currentposition -= dicenumber;
            System.out.println("Snake Position" + currentposition);
        } else if (option == IS_LADDER) {
            if ((currentposition + dicenumber) <= 100)
                currentposition += dicenumber;
            System.out.println("Ladder Position" + currentposition);
            {
                if (turn.equals("player1"))
                    turn = "player1";
                else
                    turn = "player2";
            }

        } else {
            System.out.println("No Play Position" + currentposition);
        }
        return (currentposition);
    }
}