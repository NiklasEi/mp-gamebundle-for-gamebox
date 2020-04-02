package me.nikl.mpgamebundle;

import me.nikl.gamebox.module.GameBoxModule;
import me.nikl.mpgamebundle.rockpaperscissors.RockPaperScissors;
import me.nikl.mpgamebundle.tictactoe.TicTacToe;
import me.nikl.mpgamebundle.tictactoe.TicTacToeSP;

/**
 * @author Niklas Eicker
 */
public class GameBundle extends GameBoxModule {
    public static final String TIC_TAC_TOE = "tictactoe";
    public static final String ROCK_PAPER_SCISSORS = "rockpaperscissors";
    public static final String TIC_TAC_TOE_SP = "tictactoesingle";

    @Override
    public void onEnable() {
        registerGame(TIC_TAC_TOE, TicTacToe.class, "ttt");
        registerGame(TIC_TAC_TOE_SP, TicTacToeSP.class, "ttts");
        registerGame(ROCK_PAPER_SCISSORS, RockPaperScissors.class, "rps");
    }

    @Override
    public void onDisable() {

    }
}
