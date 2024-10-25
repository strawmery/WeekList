package com.example.weeklist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeeklistTests {

	private Weeklist daysWeek;

	@BeforeEach
	public void setup() {
		daysWeek = new Weeklist();
		daysWeek.daysWeek();
	}

	@Test
	public void testCreateDaysOfWeek() {
		List<String> days = daysWeek.getDaysWeek();
		assertEquals(7, days.size());
		assertTrue(days.contains("Lunes"));


	}
	
	@Test
	public void getDays() {
		List<String> days = daysWeek.getDaysWeek();
		List<String> esperado = List.of("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
		assertNotNull(days);
		assertEquals(esperado, daysWeek.getDaysWeek());
	}

	@Test
	public void largoDias(){
		assertEquals(7, daysWeek.getSizeWeek());
 	}

	@Test
	public void deleteDay() {
		assertTrue(daysWeek.deleteDay("Lunes"));
		assertFalse(daysWeek.dayExist("Lunes"));
		assertEquals(6, daysWeek.getSizeWeek());
	}

	@Test
	public void getDay(){
		assertEquals("Lunes", daysWeek.getDay("Lunes"));
		assertNull(daysWeek.getDay("days"));
	}

	@Test
	public void dayExist(){
		assertTrue(daysWeek.dayExist("Lunes"));
		assertFalse(daysWeek.dayExist("ternerin"));
	}

	@Test
	public void daysWeekSort(){
		daysWeek.daysWeekSort();
		List<String> days = daysWeek.getDaysWeek();
		assertEquals("Domingo", days.get(0));
		assertEquals("Jueves", days.get(1));
		assertEquals("Lunes", days.get(2));
		assertEquals("Martes", days.get(3));
		assertEquals("Miercoles", days.get(4));
		assertEquals("Sabado", days.get(5));
		assertEquals("Viernes", days.get(6));
	}

	@Test
	public void clearDaysWeek(){
		daysWeek.clearDaysWeek();
		assertTrue(daysWeek.getDaysWeek().isEmpty());
		assertEquals(0, daysWeek.getSizeWeek());
	}

}
