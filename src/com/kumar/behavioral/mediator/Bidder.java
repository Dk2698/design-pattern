package com.kumar.behavioral.mediator;

public class Bidder implements Colleague {
    final private String name;
    final private AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }


    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder: " + name + " get the Notification that someone has put bid of : " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
