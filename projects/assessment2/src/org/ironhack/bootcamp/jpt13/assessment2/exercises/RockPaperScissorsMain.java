package org.ironhack.bootcamp.jpt13.assessment2.exercises;

import org.ironhack.bootcamp.jpt13.assessment2.common.RPS;

public class RockPaperScissorsMain {
    public static void main(String[] args) {
        System.out.println(rps(RPS.ROCK, RPS.PAPER)); // 1
        System.out.println(rps(RPS.SCISSORS, RPS.PAPER)); // 1
        System.out.println(rps(RPS.SCISSORS, RPS.ROCK)); // 2
        System.out.println(rps(RPS.PAPER, RPS.PAPER)); // =
    }

    public static String rps(RPS p1, RPS p2) {
        final String tie = "It is a tie!!";
        switch (p1) {
            case ROCK:
                // YOUR code
                return tie;
            case PAPER:
                // YOUR code
                return tie;
            case SCISSORS:
                // YOUR code
                return tie;
        }

        return tie;
    }
}
