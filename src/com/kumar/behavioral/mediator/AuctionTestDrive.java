package com.kumar.behavioral.mediator;

public class AuctionTestDrive {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();

        final Colleague a = new Bidder("A", auctionMediator);
        final Colleague b = new Bidder("B", auctionMediator);

        a.placeBid(2000);
        b.placeBid(3000);
        a.placeBid(4000);
    }
}
