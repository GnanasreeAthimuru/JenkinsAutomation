package contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactWithOrganization {
	@Test(groups = "RegressionTest")
	public void createContactWithOrg() {
		Reporter.log("Created Contact with Organization Successfully", true);
	}

}
