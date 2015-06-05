/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author administrador
 */
public class Cancion {
    private String nombreC;
    private String interprete;
    private String album;
    private String genero;
    private String url;

    public Cancion() {
        
    }

    public Cancion(String nombre, String autor, String album, String genero, String url) {
        this.nombreC = nombre;
        this.interprete = autor;
        this.album = album;
        this.genero = genero;
        this.url = url;
    }

    

    public String getNombreC() {
        return nombreC;
    }

    public String getInterprete() {
        return interprete;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    public String getUrl() {
        return url;
    }

    public void setNombre(String nombre) {
        this.nombreC = nombre;
    }

    public void setAutor(String autor) {
        this.interprete = autor;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return nombreC + "," + interprete + "," + album + "," + genero + "," + url;
    }
    
    
}