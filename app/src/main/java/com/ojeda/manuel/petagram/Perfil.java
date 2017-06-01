package com.ojeda.manuel.petagram;

/**
 * Created by manuel on 1/06/17.
 */

public class Perfil {

    private int Foto;
    private String Likes;

    public Perfil(int Foto, String Likes){
        this.Foto = Foto;
        this.Likes = Likes;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public String getLikes() {
        return Likes;
    }

    public void setLikes(String likes) {
        Likes = likes;
    }
}
