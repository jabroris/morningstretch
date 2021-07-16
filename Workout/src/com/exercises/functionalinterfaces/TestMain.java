package com.exercises.functionalinterfaces;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestMain implements Defaultable {

	@Override
	public String notRequired() {
		return "something overriden";
	}
	
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		System.out.println(tm.notRequired() + " 	" + tm.boolNotRequired());
		System.out.println();
		
		System.out.println(Defaultable.defNotRequired());
		System.out.println();
		
		final Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
		System.out.println();
		
		final Clock oclock = Clock.systemUTC();
		
		final ZonedDateTime zonedDatetime = ZonedDateTime.now();
		final ZonedDateTime zoneFromClock = ZonedDateTime.now(oclock);
		final ZonedDateTime zoneFromZone = ZonedDateTime.now(ZoneId.of("EST5EDT"));
		
		System.out.println(zonedDatetime);
		System.out.println(zoneFromClock);
		System.out.println(zoneFromZone);
	}


	private static class DefaultableImpl implements Defaultable {
		
	}
}