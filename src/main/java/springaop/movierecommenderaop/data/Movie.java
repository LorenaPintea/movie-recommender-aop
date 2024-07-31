package springaop.movierecommenderaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {

    public Movie() {

    }

    public String getMovieDetails() {
        return "Movie details";
    }
}
