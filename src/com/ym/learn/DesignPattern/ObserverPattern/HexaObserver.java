package com.ym.learn.DesignPattern.ObserverPattern;

public class HexaObserver extends Observer {

    public HexaObserver(One one) {
        this.one = one;
        this.one.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( one.getState() ).toUpperCase() );
    }
}
