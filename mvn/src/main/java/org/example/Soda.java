package org.example;

public enum Soda {
    COLA(35),
    PEPSI(40),
    SPRITE(26),
    MOUNTAIN_DEW(46);

    private int sugarContent;

    private Soda(int sugarContent){
        this.sugarContent=sugarContent;
    }

    public String sugar(){
        return("This soda contains "+this.sugarContent+"g of sugar!");
    }

}
