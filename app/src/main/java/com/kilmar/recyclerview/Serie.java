package com.kilmar.recyclerview;

/**
 * Created by UCA on 18/04/2018.
 */

public class Serie {

    private String name;
    private String capa;
    private int img;
    private String desc;

    public Serie(String name, String capa, int img, String desc){
        this.name = name;
        this.capa = capa;
        this.img = img;
        this.desc = desc;

    }

    public String getName(){return name;}

    public void setName (String name) {this.name = name;}

    public String getCapa(){return capa;}

    public void setCapa(String capa){ this.capa = capa;}

    public int getImg(){return img;}

    public void setImg(int img){this.img = img;}

    public String getDesc(){return desc;}

    public void setDesc(String desc){ this.desc = desc;}
}
