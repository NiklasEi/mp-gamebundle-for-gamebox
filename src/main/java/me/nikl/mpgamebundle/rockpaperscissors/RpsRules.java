package me.nikl.mpgamebundle.rockpaperscissors;

import me.nikl.gamebox.data.toplist.SaveType;
import me.nikl.gamebox.game.rules.GameRuleRewards;

/**
 * @author Niklas Eicker
 */
public class RpsRules extends GameRuleRewards {
    private int numberOfRounds;
    private boolean looseOnTimeOver;
    private int chooseTime = 10000;
    private int waitTime = 5000;

    public RpsRules(String key, boolean saveStats, SaveType saveType, double cost, double moneyToWin, int tokenToWin, boolean looseOnTimeOver, int numberOfRounds) {
        super(key, saveStats, saveType, cost, moneyToWin, tokenToWin);
        this.numberOfRounds = numberOfRounds;
        this.looseOnTimeOver = looseOnTimeOver;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public boolean isLooseOnTimeOver() {
        return looseOnTimeOver;
    }

    public int getChooseTime() {
        return chooseTime;
    }

    public void setChooseTime(int chooseTime) {
        this.chooseTime = chooseTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }
}
