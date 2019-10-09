package com.ycs.base.log4j;

import com.ycs.base.property.SystemPropertyConfigure;

public class HiLog {

	private static String procFileName(String filNm) {
		int idx = filNm.lastIndexOf(".");
		if (idx != -1 && SystemPropertyConfigure.getInsId() != null) {
			filNm = filNm.substring(0, idx) + "_" + SystemPropertyConfigure.getInsId() + filNm.substring(idx);
		}

		return filNm;
	}

	public static Logger getLogger(String fileName) {
		return new Logger(procFileName(fileName));
	}

}
