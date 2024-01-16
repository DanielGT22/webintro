package daniel.webintro.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Autore {
    private int id;
    private String nome;
    private  String cognome;
    private String email;
    private LocalDate dataDiNascita;

    private String avatar;

    public Autore(int id, String nome, String cognome, String email, LocalDate dataDiNascita ) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
    }
}
