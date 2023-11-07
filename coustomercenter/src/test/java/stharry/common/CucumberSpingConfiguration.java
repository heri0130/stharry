package stharry.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import stharry.CoustomercenterApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CoustomercenterApplication.class })
public class CucumberSpingConfiguration {}
