package Com.Easyshoppy.qa.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\shain\\Class_Lecture_49_CuCumber_BDD_3_BackGround\\src\\test\\java\\Com\\Easyshoppy\\qa\\FeatureFile\\Allfeature.feature",
		glue="Com.Easyshoppy.qa.StepDefinition",
		plugin={"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
        //glue="StepDefinitions",tags="@RegTest",
         //monochrome=true,
       //plugin={"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class TestRunner {

}

