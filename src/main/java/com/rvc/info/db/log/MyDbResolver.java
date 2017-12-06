package com.rvc.info.db.log;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;

import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.db.DBAppenderBase;

public class MyDbResolver extends DBAppenderBase<ILoggingEvent>{

	@Override
	protected Method getGeneratedKeysMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getInsertSQL() {
		// TODO Auto-generated method stub
		System.out.println("e");
		return null;
	}

	@Override
	protected void subAppend(ILoggingEvent eventObject, Connection connection, PreparedStatement statement)
			throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void secondarySubAppend(ILoggingEvent eventObject, Connection connection, long eventId) throws Throwable {
		// TODO Auto-generated method stub
		
	}
	
}


