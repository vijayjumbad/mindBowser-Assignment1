package com.mb.EmpMangApp.globelLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobelLoggingResource {
	
	public static Logger getLogger(Class classname)
	{
		return LoggerFactory.getLogger(classname);
	}

}
