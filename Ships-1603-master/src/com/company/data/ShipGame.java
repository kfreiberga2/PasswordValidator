package com.company.data;

public class ShipGame {
    private PlayerBoard playerBoard1;
    private PlayerBoard playerBoard2;

    public boolean isPlayer1Active() {
        return isPlayer1Active;
    }

    private boolean isPlayer1Active;

    public ShipGame() {
        restart();
    }

    public void load() {

    }

    public void save() {

    }

    public void restart() {
        playerBoard1 = new PlayerBoard(true);
        playerBoard2 = new PlayerBoard(false);
        isPlayer1Active = true;
    }

    public void changeActivePlayer() {
        isPlayer1Active = !isPlayer1Active;

        playerBoard1.setVisible(isPlayer1Active);
        playerBoard2.setVisible(!isPlayer1Active);
    }

    public PlayerBoard getActiveBoard() {
        return isPlayer1Active ? playerBoard1 : playerBoard2;
    }
}
