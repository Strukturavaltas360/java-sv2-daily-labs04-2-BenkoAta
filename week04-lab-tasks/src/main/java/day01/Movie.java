package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int yearOfPremiere;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfPremiere) {
        this.title = title;
        this.yearOfPremiere = yearOfPremiere;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int counter = 0;
        for(Actor actor: actors) {
            int age = actor.ageInYear(yearOfPremiere);
            if (age >= 20 && age < 30) {
                counter++;
            }
        }
        return counter;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPremiere() {
        return yearOfPremiere;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
