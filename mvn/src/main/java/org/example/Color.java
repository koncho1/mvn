package org.example;

public enum Color {
    PINK(255,192,203),
    CYAN(0,255,255),
    YELLOW(255,255,0);

    private int red;
    private int green;
    private int blue;

    private Color(int red,int green,int blue){
        this.red=red;
        this.green=green;
        this.blue=blue;
    }

    public String rgb(){
        return ("r:"+this.red+" g:"+this.green+" b:"+this.blue);
    }

}