package com.ojeda.manuel.petagram;

/**
 * Created by manuel on 14/05/17.
 */

public class Mascota {

    private int Foto;
    private String Nombre;
    private String Raza;
    private int Likes = 0;

    public Mascota(int foto, String nombre, String raza) {
        this.Foto = foto;
        this.Nombre = nombre;
        this.Raza = raza;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int likes) {
        Likes = likes;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

}
