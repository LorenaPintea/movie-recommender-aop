package springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {
    private final Logger logger = LoggerFactory.getLogger(AccessCheckAspect.class);
    @Before("execution(* springaop.movierecommenderaop..*.*(String,..))")
    public void userAccess(JoinPoint joinPoint) {
        logger.info("Intercepted call before execution: {}", joinPoint.getSignature());
    }
}
