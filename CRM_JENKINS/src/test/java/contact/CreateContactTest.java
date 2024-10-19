package contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {
	
		@Test(groups = "SmokeTest")
		public void createContact() {
			Reporter.log("Created Contact Successfully", true);
		}

	}


