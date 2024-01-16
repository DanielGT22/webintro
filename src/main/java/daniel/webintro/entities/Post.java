package daniel.webintro.entities;

import lombok.*;

@Getter
@Setter
@ToString
public class Post {
    private int id;
    private String categoria;
    private String titolo;

    private String cover;

    private String contenuto;

    private double tempoDiLettura;
    private Autore autore;

    public Post(int id, String categoria, String titolo, String cover, String contenuto, double tempoDiLettura, Autore autore) {
        this.id = id;
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        this.autore = autore;
    }
}
