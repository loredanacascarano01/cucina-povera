package com.tuttiatavola.tuttiatavola.model;

public class Intolleranza {

    private boolean veg;
    private boolean vegan;
    private boolean glutenFree;
    private boolean noMilk;
    private boolean halal;
    private boolean kosher;

    public Intolleranza(boolean veg, boolean vegan, boolean glutenFree, boolean noMilk, boolean halal, boolean kosher) {
        this.veg = veg;
        this.vegan = vegan;
        this.glutenFree = glutenFree;
        this.noMilk = noMilk;
        this.halal = halal;
        this.kosher = kosher;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isNoMilk() {
        return noMilk;
    }

    public void setNoMilk(boolean noMilk) {
        this.noMilk = noMilk;
    }

    public boolean isHalal() {
        return halal;
    }

    public void setHalal(boolean halal) {
        this.halal = halal;
    }

    public boolean isKosher() {
        return kosher;
    }

    public void setKosher(boolean kosher) {
        this.kosher = kosher;
    }
}
