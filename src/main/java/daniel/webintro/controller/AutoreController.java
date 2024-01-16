package daniel.webintro.controller;

import daniel.webintro.entities.Autore;
import daniel.webintro.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @GetMapping
    public List<Autore> getAutore(){
        return autoreService.getAutore();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore saveAutore(@RequestBody Autore body) {
        return autoreService.save(body);
    }

    @GetMapping("/{id}")
    public Autore findById(@PathVariable int id) {
        return autoreService.findById(id);
    }

    @PutMapping("/{id}")
    public Autore findByAndUpdate(@PathVariable int id, @RequestBody Autore body) {
        return this.autoreService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable int id) {
        this.autoreService.findByIdAndDelete(id);
    }


}
