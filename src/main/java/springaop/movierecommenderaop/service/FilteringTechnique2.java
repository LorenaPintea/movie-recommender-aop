package springaop.movierecommenderaop.service;

import org.springframework.stereotype.Service;
import springaop.movierecommenderaop.aspect.MeasureTime;
import springaop.movierecommenderaop.data.User;

@Service
public class FilteringTechnique2 {
    private final User user;

    public FilteringTechnique2(User user) {
        this.user = user;
    }
    @MeasureTime
    public String collaborativeFiltering() {
        return user.getUserDetails();
    }
}
