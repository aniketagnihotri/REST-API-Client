package org.yelpapiinterface.springbootstarter.joke;

import java.util.Collection;
import java.util.LinkedHashMap;

public class Joke {

    private String type;
    private LinkedHashMap value;
    //private Object value;

    public Joke() {
    }

    public Joke(String type, LinkedHashMap value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LinkedHashMap getValue() {
        return value;
    }

    public void setValue(LinkedHashMap value) {
        this.value = value;
    }

   /* public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    } */

}
