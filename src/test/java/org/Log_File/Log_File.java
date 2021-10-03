package org.Log_File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log_File {

	public static Logger log = Logger.getLogger(Log_File.class);

	public static void main(String[] args) {

//		BasicConfigurator.configure();  // it is basic configure

		PropertyConfigurator.configure("log4j.properties"); // it is property file configure

		log.debug("Debug Msg");

		log.info("Information Msg");

		log.warn("Warnning Msg");

		log.error("error Msg");

		log.fatal("Danger Msg");
	}

}
