package org.sudr.train.pattern.command.server;

import org.sudr.train.pattern.command.shared.Action;
import org.sudr.train.pattern.command.shared.EchoResult;
import org.sudr.train.pattern.command.shared.ExecutionContext;
import org.sudr.train.pattern.command.shared.Result;

public class EchoActionHandler implements ActionHandler {

	public Result execute(Action action, ExecutionContext context) {
		return new EchoResult(action.getMessage() + " " + context.getData());
	}

}
