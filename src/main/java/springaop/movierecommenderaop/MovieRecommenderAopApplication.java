package springaop.movierecommenderaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springaop.movierecommenderaop.service.FilteringTechnique1;
import springaop.movierecommenderaop.service.FilteringTechnique2;

@SpringBootApplication
public class MovieRecommenderAopApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(MovieRecommenderAopApplication.class);

    private final FilteringTechnique1 filteringTechnique1;
    private final FilteringTechnique2 filteringTechnique2;

    public MovieRecommenderAopApplication(FilteringTechnique1 filteringTechnique1, FilteringTechnique2 filteringTechnique2) {
        this.filteringTechnique1 = filteringTechnique1;
        this.filteringTechnique2 = filteringTechnique2;
    }


    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderAopApplication.class, args);
    }

    public Logger getLogger() {
        return logger;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("MovieRecommenderAopApplication started");
        logger.info(filteringTechnique1.contentBasedFiltering());
        logger.info(filteringTechnique2.collaborativeFiltering());
    }
}
