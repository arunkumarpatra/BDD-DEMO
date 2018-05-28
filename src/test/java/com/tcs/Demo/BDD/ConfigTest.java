package com.tcs.Demo.BDD;

import java.lang.annotation.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import com.tcs.Demo.BDD.DemoBddApplication;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ContextConfiguration
@ActiveProfiles("test")
@SpringBootTest(classes = {DemoBddApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public @interface ConfigTest {
}
