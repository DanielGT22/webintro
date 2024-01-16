package daniel.webintro.services;

import daniel.webintro.entities.Autore;
import daniel.webintro.exceptions.NotFound;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {
    private List<Autore> autori = new ArrayList<>();

    public List<Autore> getAutore() {
        return this.autori;
    }

    public Autore save(Autore body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 2000));
        this.autori.add(body);
        return body;
    }

    public Autore findById(int id) {
        Autore found = null;
        for (Autore autore : this.autori) {
            if (autore.getId() == id) {
                found = autore;
            }
        }
        if (found == null)
            throw new NotFound(id);
        return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Autore> iterator = this.autori.iterator();
        while (iterator.hasNext()) {
            Autore current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Autore findByIdAndUpdate(int id, Autore body) {
        Autore found = null;
        for (Autore autore : this.autori) {
            if (autore.getId() == id) {
                found = autore;
                found.setId(id);
                found.setNome(body.getNome());
                found.setCognome(body.getCognome());
                found.setEmail(body.getEmail());
                found.setDataDiNascita(body.getDataDiNascita());
                found.setAvatar(body.getAvatar());

            }
        }
        if (found == null)
            throw new NotFound(id);
        return found;
    }

}
