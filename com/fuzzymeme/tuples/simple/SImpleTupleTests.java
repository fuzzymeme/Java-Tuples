package com.fuzzymeme.tuples.simple;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class SImpleTupleTests {

	@Test
	public void test_SimpleSetting() {
		SimpleTuple<String> tuple = new SimpleTuple<>("fish");		
		assertEquals("fish", tuple.get(0));
	}
	
	@Test
	public void test_HavingMutlitpleTuples() {
		SimpleTuple<String> tupleOne = new SimpleTuple<>("fish");		
		SimpleTuple<String> tupleTwo = new SimpleTuple<>("foo");	

		assertEquals("fish", tupleOne.get(0));
		assertEquals("foo", tupleTwo.get(0));
	}
	
	@Test
	public void test_HavingMutlitpleValuesInATuples() {
		SimpleTuple<String> tuple = new SimpleTuple<>("Fishy", "Mac", "fishface");

		assertEquals("Fishy", 	tuple.get(0));
		assertEquals("Mac", 	tuple.get(1));
		assertEquals("fishface",tuple.get(2));
	}
	
	@Test
	public void test_Constructor() {
		SimpleTuple<String> tuple = new SimpleTuple<>("Fishy", "Mac", "fishface");		

		assertEquals("Fishy", 	tuple.get(0));
		assertEquals("Mac", 	tuple.get(1));
		assertEquals("fishface",tuple.get(2));
	}
	
	@Test
	public void test_UsingTypeOtherThanString() {
		SimpleTuple<Color> tuple = new SimpleTuple<>(Color.RED, Color.BLACK, Color.ORANGE, Color.CYAN);		

		assertEquals(Color.CYAN,	tuple.get(3));
		assertEquals(Color.BLACK, 	tuple.get(1));
		assertEquals(Color.RED, 	tuple.get(0));
		assertEquals(Color.ORANGE,	tuple.get(2));
		assertEquals(4,  tuple.size());
	}

	@Test
	public void test_ReturnsNullWhenDoesNotContainItem() {
		SimpleTuple<Color> tuple = new SimpleTuple<>(Color.RED, Color.CYAN);		

		assertNull(tuple.get(2));
	}

}
