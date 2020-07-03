package org.yelpapiinterface.springbootstarter.joke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JokeController {

    @Autowired
    private JokeService service;

    @RequestMapping(value = "/joke")
    public List<Joke> getJokeList() {
        return service.getJokeList();
    }

    @RequestMapping("/joke/{id}")
    public Joke getJoke(@PathVariable int id) {
        return service.getJoke(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/joke")
    public void addJoke(@RequestBody Joke joke) {
        service.addJoke(joke);
    }

}
