package org.json.test;

import org.json.JSONObject;
import org.json.JSONString;

/**
 * Beany is a typical class that implements {@link JSONString}. It also provides
 * some beany methods that can be used to construct a {@link JSONObject}. It
 * also demonstrates constructing a {@link JSONObject} with an array of names.
 */
public class Beany implements JSONString {

	public String aString;
    public double aNumber;
    public boolean aBoolean;

    public Beany(String string, double d, boolean b) {
        this.aString = string;
        this.aNumber = d;
        this.aBoolean = b;
    }

    public double getNumber() {
        return this.aNumber;
    }

    public String getString() {
        return this.aString;
    }

    public boolean isBoolean() {
        return this.aBoolean;
    }

    public String getBENT() {
        return "All uppercase key";
    }

    public String getX() {
        return "x";
    }

    public String toJSONString() {
        return "{" + JSONObject.quote(this.aString) + ":" +
                JSONObject.doubleToString(this.aNumber) + "}";
    }

    public String toString() {
        return this.getString() + " " + this.getNumber() + " " +
                this.isBoolean() + "." + this.getBENT() + " " + this.getX();
    }

}