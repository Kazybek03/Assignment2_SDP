package com.company;

public class Prizyvnik {
    private String name;
    private Voenkomat voenkomat = new Voenkomat();

    public Prizyvnik(String name){
        super();
        this.name = name;
    }

    public void update(){
        System.out.println(name + " учи песню Здравствуй небо в облаках" + voenkomat.title);
    }
 public void nazvanieVoenkomata(Voenkomat vk){
        voenkomat = vk;
 }
}
