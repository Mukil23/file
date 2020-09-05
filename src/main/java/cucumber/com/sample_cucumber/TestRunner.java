package cucumber.com.sample_cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",glue="cucumber.com.sample_cucumber",monochrome=true,strict=true,plugin="junit:target/report.xml")
public class TestRunner {

}
  