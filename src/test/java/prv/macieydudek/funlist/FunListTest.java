package prv.macieydudek.funlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunListTest {
	
	
	@Test
	public void shouldAddElementToEmptyList() {
		//given
		FunList<String> list = FunList.empty(String.class);
		//when
		list = list.add("test");
		//then
		assertTrue(list.contains("test"));
	}
	
	@Test
	public void shouldAddElementToNonEmptyList() {
		//given
		FunList<String> list = FunList.empty(String.class);
		//when
		list = list.add("element1").add("element2").add("element3");
		//then
		assertTrue(list.contains("element1"));
		assertTrue(list.contains("element2"));
		assertTrue(list.contains("element3"));
		assertFalse(list.contains("element4"));
	}

}
