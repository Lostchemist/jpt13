package org.ironhack.bootcamp.jpt13.assessment2.solutions.enums;

public class EnumsMain {

    public static void main(String[] args) {
        Player gp = new Player("gold player", "gp@test.com", 10, SubscriptionType.GOLD);
        Player sp = new Player("silver player", "sp@test.com", 10, SubscriptionType.SILVER);
        Player fp = new Player("free player", "fp@test.com", 10, SubscriptionType.FREE);
        Player banned = new Player("banned player", "banned@test.com", 10, SubscriptionType.BANNED);


        gp.applyReward(2);
        assert(16 == gp.getPoints());

        sp.applyReward(2);
        assert(14 == sp.getPoints());

        fp.applyReward(2);
        assert(12 == fp.getPoints());

        banned.applyReward(2);
        assert(10 == banned.getPoints());

    }
}
