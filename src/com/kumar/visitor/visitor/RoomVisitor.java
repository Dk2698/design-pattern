package com.kumar.visitor.visitor;

import com.kumar.visitor.element.DeluxeRoom;
import com.kumar.visitor.element.DoubleRoom;
import com.kumar.visitor.element.SingleRoom;

public interface RoomVisitor {
    //passing concrete class
    void visit(SingleRoom singleRoom);

    void visit(DoubleRoom doubleRoom);

    void visit(DeluxeRoom deluxeRoom);
}
