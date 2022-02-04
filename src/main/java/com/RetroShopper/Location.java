package com.RetroShopper;

public class Location {
    public static boolean hasJordans;
    public static boolean isJDsport;
    public static boolean isSchuh;
    public static boolean isFootlocker;
    public static boolean isPrimark;
    public String displayShop;

    public boolean isHasJordans() {
        return hasJordans;
    }

    public void setHasJordans(boolean hasJordans) {
        this.hasJordans = hasJordans;
    }

    public String getDisplayShop() {
        return displayShop;
    }

    public void setDisplayShop(String displayShop) {
        this.displayShop = displayShop;
    }

    public boolean isJDsport() {
        return isJDsport;
    }

    public void setJDsport(boolean JDsport) {
        isJDsport = JDsport;
    }

    public boolean isSchuh() {
        return isSchuh;
    }

    public void setSchuh(boolean schuh) {
        isSchuh = schuh;
    }

    public boolean isFootlocker() {
        return isFootlocker;
    }

    public void setFootlocker(boolean footlocker) {
        isFootlocker = footlocker;
    }

    public boolean isPrimark() {
        return isPrimark;
    }

    public void setPrimark(boolean primark) {
        isPrimark = primark;
    }
}
