package org.example;

public enum Car {
    BMW(200),
    MERCEDES(190),
    AUDI(210),
    TOYOTA(175);

    private int topSpeed;

    private Car(int topSpeed){
        this.topSpeed=topSpeed;
    }

}
