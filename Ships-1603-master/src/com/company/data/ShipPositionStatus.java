package com.company.data;

public class ShipPositionStatus {
    private int x;
    private int y;
    private boolean isHit;

    public ShipPositionStatus(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void markAsHit() {
        isHit = true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHit() {
        return isHit;
    }
}
