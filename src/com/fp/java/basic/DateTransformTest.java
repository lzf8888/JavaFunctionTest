package com.fp.java.basic;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateTransformTest {

	private static Map<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		String date=instant.toString().split("T")[0];
		long t1=instant.toEpochMilli();
		long t2=System.currentTimeMillis();
		int result=Instant.ofEpochMilli(t2).compareTo(Instant.ofEpochMilli(t1));
		LocalDateTime ldt=LocalDateTime.ofInstant(Instant.ofEpochMilli(t2),  ZoneId.of("Z"));
		instant.atZone(ZoneId.of("Z")).toLocalDateTime();
		LocalDateTime ldt2=LocalDateTime.now();
		
		Instant convert=ldt.atZone(ZoneId.of("Z")).toInstant();
		System.out.println(t1); 
		System.out.println(t2); 
		System.out.println(result); 
		System.out.print(convert.toEpochMilli());

	}

}
