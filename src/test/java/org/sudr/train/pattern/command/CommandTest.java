package org.sudr.train.pattern.command;

import org.sudr.train.pattern.command.server.ActionHandler;
import org.sudr.train.pattern.command.server.EchoActionHandler;
import org.sudr.train.pattern.command.shared.Action;
import org.sudr.train.pattern.command.shared.ExecutionContext;
import org.sudr.train.pattern.command.shared.HelloAction;
import org.sudr.train.pattern.command.shared.Result;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * See http://architects.dzone.com/articles/gwt-architecture-best?utm_source=
 * feedburner
 * &utm_medium=feed&utm_campaign=Feed:+javalobby/frontpage+(Javalobby+/
 * +Java+Zone)&utm_content=Google+Reader for details.
 * 
 */
@Test
public class CommandTest {

	public void test_setup() {
		ActionHandler actionHandler = new EchoActionHandler();
		Action action = new HelloAction();
		ExecutionContext context = new ExecutionContext("sud");
		Result result = actionHandler.execute(action, context);
		Assert.assertEquals(result.getMessage(), "Hello sud");
	}
}
