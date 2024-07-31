package springaop.movierecommenderaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {
    @Pointcut("execution(* springaop.movierecommenderaop.data.*.*(..))")
    public void dataLayerPointcut() {}

    @Pointcut("execution(* springaop.movierecommenderaop.service.*.*(..))")
    public void serviceLayerPointcut() {}

    @Pointcut("bean(movie)")
    public void movieBeanPointcut() {}

    @Pointcut("@annotation(springaop.movierecommenderaop.aspect.MeasureTime)")
    public void measureTimeAnnotationPointcut() {}
}
