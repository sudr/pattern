package org.sudr.train.pattern.command.server;

import org.sudr.train.pattern.command.shared.Action;
import org.sudr.train.pattern.command.shared.ExecutionContext;
import org.sudr.train.pattern.command.shared.Result;

public interface ActionHandler {

	Result execute(Action action, ExecutionContext context);

}
