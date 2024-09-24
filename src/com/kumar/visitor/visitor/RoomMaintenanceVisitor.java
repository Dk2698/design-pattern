package com.kumar.visitor.visitor;

import com.kumar.visitor.element.DeluxeRoom;
import com.kumar.visitor.element.DoubleRoom;
import com.kumar.visitor.element.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Performing maintenance logic of SingleRoom");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Performing maintenance logic of DoubleRoom");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing maintenance logic of DeluxeRoom");
    }
}
