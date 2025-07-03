package com.kumar.behavioral.visitor.element;

import com.kumar.behavioral.visitor.visitor.RoomVisitor;

public class DeluxeRoom implements RoomElement {
    public int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
