package com.atwy.helloworld;

import java.util.UUID;

/**
 * @author:yan
 * @date :2017年10月25日
 * @desc :UUID
 */
public class GUIDUtil {
	public static String buildGUID() {
		String randomUUID = UUID.randomUUID().toString();
		System.out.println(randomUUID);
		return randomUUID;
	}
}
