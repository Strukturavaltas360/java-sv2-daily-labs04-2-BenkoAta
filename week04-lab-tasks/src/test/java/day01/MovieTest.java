package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {
    @Test
    void testMovie() {
        Movie movie = new Movie("Titanic", 1997);
        movie.addActor(new Actor("Leonardo DiCaprio", 1971));
        movie.addActor(new Actor("Kate Winslet", 1975));
        movie.addActor(new Actor("Billy Zane", 1979));
        movie.addActor(new Actor("Kathy Bates", 1968));
        movie.addActor(new Actor("Frances Fisher", 1954));
        movie.addActor(new Actor("Gloria Stuart", 1932));

        assertEquals(2, movie.actorsInTheirTwenties());
    }
}
