package com.kumar.behavioral.visitor.visitor;

import com.kumar.behavioral.visitor.element.DeluxeRoom;
import com.kumar.behavioral.visitor.element.DoubleRoom;
import com.kumar.behavioral.visitor.element.SingleRoom;

public interface RoomVisitor {
    //passing concrete class
    void visit(SingleRoom singleRoom);

    void visit(DoubleRoom doubleRoom);

    void visit(DeluxeRoom deluxeRoom);
}
