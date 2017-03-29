package ru.altstu;

/**
 * Created by sergey on 29/03/2017.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/resources/ru.altstu"}
)
public class CucuRunner {

}
