package com.company;

import java.util.ArrayList;
import java.util.List;

public class Voenkomat {
    private List<Prizyvnik> prizyvniks =new ArrayList<>();

    String title; //здесь тайтл это как личный коментарий

    public void dobavitBednogo(Prizyvnik prizyvnik){
        prizyvniks.add(prizyvnik);
    }

    public void ubratSchaslivchika(Prizyvnik prizyvnik){
        prizyvniks.remove(prizyvnik);
    }
    public void prizvatSmertnyh(){
        for(Prizyvnik prizyvnik : prizyvniks){
            prizyvnik.update();
        }
    }
    public void upload (String title){
        this.title = title;
        prizvatSmertnyh();
    }



}
