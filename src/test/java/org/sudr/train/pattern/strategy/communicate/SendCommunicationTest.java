package org.sudr.train.pattern.strategy.communicate;

import org.sudr.train.pattern.strategy.communicate.CommunicationFactory.CommunicationServiceType;
import org.testng.annotations.Test;

public class SendCommunicationTest {

	@Test
	public void test_email_service() {
		CommunicationService service = CommunicationFactory.service(CommunicationServiceType.EMAIL);
		service.send("hello strategy");
	}
	
	@Test
	public void test_fax_service() {
		CommunicationService service = CommunicationFactory.service(CommunicationServiceType.FAX);
		service.send("hello strategy");
	}
	
}
