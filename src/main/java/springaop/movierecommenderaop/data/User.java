package springaop.movierecommenderaop.data;

import org.springframework.stereotype.Repository;
import springaop.movierecommenderaop.aspect.MeasureTime;

@Repository
public class User {

    public User() {

    }

    @MeasureTime
    public String getUserDetails() {
        return "User details";
    }
}
