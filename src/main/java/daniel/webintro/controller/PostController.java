package daniel.webintro.controller;

import daniel.webintro.entities.Autore;
import daniel.webintro.entities.Post;
import daniel.webintro.services.AutoreService;
import daniel.webintro.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/post")
public class PostController {


    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAutore(){
        return postService.getPost();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post savePost(@RequestBody Post body) {
        return postService.save(body);
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable int id) {
        return postService.findById(id);
    }

    @PutMapping("/{id}")
    public Post findByAndUpdate(@PathVariable int id, @RequestBody Post body) {
        return this.postService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable int id) {
        this.postService.findByIdAndDelete(id);
    }

}
