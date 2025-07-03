package com.kumar.behavioral.visitor.element;

import com.kumar.behavioral.visitor.visitor.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor visitor);
}
