package springaop.movierecommenderaop.service;

import org.springframework.stereotype.Service;
import springaop.movierecommenderaop.aspect.MeasureTime;
import springaop.movierecommenderaop.data.Movie;

@Service
public class FilteringTechnique1 {
    private final Movie movie;

    public FilteringTechnique1(Movie movie) {
        this.movie = movie;
    }
    @MeasureTime
    public String contentBasedFiltering() {
        return movie.getMovieDetails();
    }
}
