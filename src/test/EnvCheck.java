package test;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnvCheck implements ExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		String env ="dev";
		if("qa".equalsIgnoreCase(env)) {
			return ConditionEvaluationResult.disabled("Test is disabled on Dev");
		}
		return ConditionEvaluationResult.enabled("Test is enabled on QA env");
	}

}
