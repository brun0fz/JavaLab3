package com.utntup.id;

public class Persona {

    private static int id=0;
    private int myId;

    public Persona(){

        this.myId = generateNewId();

    }

    private int generateNewId(){
        return ++id;
    }

    public static int getId()
    {
        return id;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "myId=" + myId +
                '}';
    }
}
