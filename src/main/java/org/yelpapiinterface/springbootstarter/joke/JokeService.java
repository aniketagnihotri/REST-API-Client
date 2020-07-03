package org.yelpapiinterface.springbootstarter.joke;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class JokeService {

    final String url = "http://api.icndb.com/jokes/";
    private List<Joke> jokeList = new ArrayList<Joke>();

    public List<Joke> getJokeList() {
        return jokeList;
    }

    public Joke getJoke(int id) {
        RestTemplate restTemplate = new RestTemplate();
        Joke receivedJoke = restTemplate.getForObject(url + id, Joke.class);
        System.out.println(receivedJoke);
        int counter = 0;
        for (Joke joke : jokeList) {
            if (joke.getValue().containsValue(id)) {
               return receivedJoke;
            }
        }

        addJoke(receivedJoke);
        return receivedJoke;
    }

    public void addJoke(Joke joke) {
        jokeList.add(joke);
    }

}
