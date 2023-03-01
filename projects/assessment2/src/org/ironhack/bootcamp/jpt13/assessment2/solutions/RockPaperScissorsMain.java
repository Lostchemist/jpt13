package org.ironhack.bootcamp.jpt13.assessment2.solutions;

import org.ironhack.bootcamp.jpt13.assessment2.common.RPS;

public class RockPaperScissorsMain {
    public static void main(String[] args) {

        System.out.println(rps(RPS.ROCK, RPS.PAPER)); // 1
        System.out.println(rps(RPS.SCISSORS, RPS.PAPER)); // 1
        System.out.println(rps(RPS.SCISSORS, RPS.ROCK)); // 2
        System.out.println(rps(RPS.PAPER, RPS.PAPER)); // =

    }


    public static String rps(RPS p1, RPS p2) {
        String p1Wins = "Player 1 wins";
        String p2Wins = "Player 2 wins";
        String tie = "It is a tie";

        switch (p1) {
            case ROCK:
                if (p2.equals(RPS.PAPER)) {
                    return p2Wins;
                }
                if (p2.equals(RPS.SCISSORS)) {
                    return p1Wins;
                }
                return tie;
            case PAPER:
                if (p2.equals(RPS.ROCK)) {
                    return p2Wins;
                }
                if (p2.equals(RPS.SCISSORS)) {
                    return p1Wins;
                }
                return tie;
            case SCISSORS:
                if (p2.equals(RPS.PAPER)) {
                    return p2Wins;
                }
                if (p2.equals(RPS.ROCK)) {
                    return p1Wins;
                }
                return tie;
        }

        return tie;
    }
}
