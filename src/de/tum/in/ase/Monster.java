package de.tum.in.ase;

public class Monster {

    protected int posX;
    protected int posY;

    public Monster(int posX, int posY) {

        this.posX = posX;
        this.posY = posY;

    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
}
