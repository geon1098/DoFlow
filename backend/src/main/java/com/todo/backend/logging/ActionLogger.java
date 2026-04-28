package com.todo.backend.logging;

import org.apache.logging.log4j.Logger;
import org.mybatis.logging.LoggerFactory;

public final class ActionLogger {

	private static final Logger LOG = LoggerFactory.getLogger("ACTION");
	
	private ActionLogger() {}
	
	public static void log(String action, Long userId, String detail) {
		LOG.info("action={} userId={} detail={}", action, userId, detail);
	}
}
