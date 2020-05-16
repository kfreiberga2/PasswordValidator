package com.company.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ship {
    private ShipOrientationEnum orientation;
    private ShipTypeEnum type;
    private boolean isSunk;
    private List<ShipPositionStatus> positions = new ArrayList<>();

    public void put() {

    }

    public int getPositionCount() {
        return positions.size();
    }

    public Iterable<ShipPositionStatus> getPositions() {
         return positions;
    }

    public boolean shoot(int x, int y) {
        var result = positions.stream().filter(p->p.getX() == x && p.getY() == y).findFirst();
        if(result.isPresent()) {
            var position = result.get();
            if(!position.isHit()) {
                position.markAsHit();

                var notHitResult = positions.stream().filter(p->p.isHit() == false).findAny();

                if(!notHitResult.isPresent()) {
                    isSunk = true;
                }
            }
            return true;
        }

        return false;
    }

    public ShipTypeEnum getType() {
        return type;
    }

    public ShipOrientationEnum getOrientation() {
        return orientation;
    }
}
