package me.nikl.mpgamebundle.tictactoe;

import me.nikl.gamebox.GameBox;
import me.nikl.gamebox.game.GameSettings;
import me.nikl.mpgamebundle.GameBundle;

/**
 * @author Niklas Eicker
 */
public class TicTacToeSP extends TicTacToe {

    public TicTacToeSP(GameBox gameBox) {
        super(gameBox, GameBundle.TIC_TAC_TOE_SP);
    }

    @Override
    public void loadSettings() {
        gameSettings.setGameType(GameSettings.GameType.SINGLE_PLAYER);
    }

    @Override
    public void loadGameManager() {
        gameManager = new TttManager(this, true);
    }

    @Override
    public void loadLanguage() {
        gameLang = new TttLanguage(this, false);
    }
}
