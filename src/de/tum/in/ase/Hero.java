package de.tum.in.ase;

//TODO: Make this class into abstract, add an attribute "game" of the Game class and a method
// "useSpecialPower(char option)" then create the subclasses.
public abstract class Hero {

    protected int posX;
    protected int posY;

    protected Game game;

    private Hunter Hunter;
    private Mage Mage;

    protected Hero(Game game) {
        this.posX = 0;
        this.posY = 0;
    }

    public abstract void useSpecialPower(char option);

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
