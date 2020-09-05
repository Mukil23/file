 package cucumber.com.sample_cucumber;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import selinium.base;

public class Hooks extends base {
	@Before
    public void initizalise() {
		initializeBrowser("chrome");
	}
	@After
	public void close() {
        driver.quit();
	}
	

}
