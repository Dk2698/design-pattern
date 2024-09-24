package com.kumar.visitor.element;

import com.kumar.visitor.visitor.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor visitor);
}
