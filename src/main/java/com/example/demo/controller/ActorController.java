package com.example.demo.controller;

import com.example.demo.model.Actor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.demo.model.Actor.filmography;

public class ActorController {

    private static Map<String, List<Actor>> actorDB = new HashMap<String, List<Actor>>();

    static {

        List<Actor> actors = new ArrayList<Actor>();
        Actor actor = new Actor("Brad", "Pitt", "18 Decembre 1963", filmography);
        actors.add(actor);
        actor = new Actor("Natalie", "Portman", "9 Juin 1981", filmography);
        actors.add(actor);
        actor = new Actor("Christopher", "Lee", "27 Mai 1922", filmography);
        actors.add(actor);

        actorDB.put("MyActors", actors);
    }

    @RequestMapping(value = "/getActorsByName/{*}", method = RequestMethod.GET)
    public List<Actor> getAllActors(){
        System.out.println("Getting all the actors");
        List<Actor> actorList = actorDB.get("value");
        return actorList;
    }

    @RequestMapping(value = "/getActorsByName/{name}", method = RequestMethod.GET)
    public List<Actor> getActorByName(@PathVariable String name) {
        System.out.println("Getting actors for " + name);
        List<Actor> actorList = actorDB.get(name);
        if(actorList == null) {
            actorList  = new ArrayList<Actor>();
            Actor actor = new Actor("Not found", "N/A", "N/A", filmography);
            actorList.add(actor);
        }
        return actorList;
    }

    @RequestMapping(value = "/getActorsByName/{name}", method = RequestMethod.GET)
    public List<Actor> getActorForAGivenFilm(@PathVariable List<String> filmography) {
        return null;
    }
}
