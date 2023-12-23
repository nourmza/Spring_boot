package com.example.exsoftwareengineering.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.example.exsoftwareengineering.service.ServiceRevisionImpl.*.ajouter*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        log.info("Debut methode : " + joinPoint.getSignature().getName() + " : ");
    }

}