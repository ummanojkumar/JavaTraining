package cheatShett.spring.springAOP;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class AspectExample {

//        @Before("execution(* com.example.service.*.*(..))")
        public void beforeAdvice() {
            System.out.println("Before method execution");
        }

//        @AfterReturning(pointcut = "execution(* com.example.service.*.*(..))", returning = "result")
        public void afterReturningAdvice(Object result) {
            System.out.println("After method execution, returned: " + result);
        }

//        @AfterThrowing(pointcut = "execution(* com.example.service.*.*(..))", throwing = "exception")
        public void afterThrowingAdvice(Exception exception) {
            System.out.println("After method execution, threw exception: " + exception.getMessage());
        }

//        @After("execution(* com.example.service.*.*(..))")
        public void afterAdvice() {
            System.out.println("After method execution (finally block)");
        }

/*
        @Around("execution(* com.example.service.*.*(..))")
        public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
            System.out.println("Before method execution (around advice)");
            Object result = null;
            try {
                result = joinPoint.proceed();
                System.out.println("After method execution (around advice), returned: " + result);
            } catch (Exception e) {
                System.out.println("After method execution (around advice), threw exception: " + e.getMessage());
                throw e;
            }
            return result;
        }

 */
}
