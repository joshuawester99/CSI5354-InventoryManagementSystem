package com.baylor.app.mediator;

public class Comp {
    private Mediator mediator;

    public Comp(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
