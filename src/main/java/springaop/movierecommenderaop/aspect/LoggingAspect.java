package springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @AfterReturning(value = "springaop.movierecommenderaop.aspect.JoinPointConfig.dataLayerPointcut()", returning = "result")
    public void logAfterExecution(JoinPoint joinPoint, Object result) {
        logger.info("Method {} returned with: {}", joinPoint.getSignature().getName(), result);
    }

    @AfterThrowing(
            value = "execution(* springaop.movierecommenderaop..*.*(..))",
            throwing = "exception", argNames = "joinPoint,exception")
    public void logAfterException(JoinPoint joinPoint, Throwable exception) {
        logger.info("Method {} returned with: {}", joinPoint.getSignature().getName(), exception.getMessage());
    }

    @After("springaop.movierecommenderaop.aspect.JoinPointConfig.serviceLayerPointcut()")
    public void logAfterMethod(JoinPoint joinPoint) {
        logger.info("After method call {}", joinPoint);
    }
}
