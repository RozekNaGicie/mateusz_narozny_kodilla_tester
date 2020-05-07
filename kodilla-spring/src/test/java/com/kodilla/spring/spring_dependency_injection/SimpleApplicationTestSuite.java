package com.kodilla.spring.spring_dependency_injection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SimpleApplicationTestSuite {

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        String message = bean.send("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }
}