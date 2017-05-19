package com.fuzzymeme.tuples;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class EnumTupleTests {

	private enum Key implements EnumTupleKey {
		TOM, DICK, HARRY
	};
	
	public enum OtherKey implements EnumTupleKey {
		RED, GREEN, BLUE
	};


	@Test
	public void test_SimpleSetting() {
		EnumTuple<Key, String> tuple = new EnumTuple<>();		
		tuple.set(Key.TOM, "fish");		
		assertEquals("fish" , tuple.get(Key.TOM));
	}

	@Test
	public void test_HavingMutlitpleTuples() {
		EnumTuple<Key, String> tupleOne = new EnumTuple<>();		
		tupleOne.set(Key.TOM, "fish");		

		EnumTuple<OtherKey, String> tupleTwo = new EnumTuple<>();		
		tupleTwo.set(OtherKey.RED, "foo");		

		assertEquals("fish" , tupleOne.get(Key.TOM));
		assertEquals("foo" , tupleTwo.get(OtherKey.RED));
	}

	@Test
	public void test_HavingMutlitpleValuesInATuples() {
		EnumTuple<Key, String> tupleOne = new EnumTuple<>();		
		tupleOne.set(Key.TOM, "fish");		
		tupleOne.set(Key.DICK, "Mac");		
		tupleOne.set(Key.HARRY, "fishface");		

		assertEquals("fish", 	tupleOne.get(Key.TOM));
		assertEquals("Mac", 	tupleOne.get(Key.DICK));
		assertEquals("fishface",tupleOne.get(Key.HARRY));
	}
	
	@Test
	public void test_RemovingValue() {
		EnumTuple<Key, String> tuple = new EnumTuple<>();		
		tuple.set(Key.TOM, "fish");		
		tuple.set(Key.DICK, "Mac");		
		tuple.set(Key.HARRY, "fishface");		

		tuple.remove(Key.DICK);
		
		assertEquals("fish", 	tuple.get(Key.TOM));
		assertNull(tuple.get(Key.DICK));
		assertEquals("fishface",tuple.get(Key.HARRY));
	}
	
	@Test
	public void test_GettingTheSetOfKeys() {
		EnumTuple<Key, String> tuple = new EnumTuple<>();		
		tuple.set(Key.TOM, "fish");		
		tuple.set(Key.DICK, "Mac");		
		tuple.set(Key.HARRY, "fishface");		

		Set<Key> keys = tuple.keySet();
		
		assertTrue(keys.contains(Key.TOM));
		assertTrue(keys.contains(Key.DICK));
		assertTrue(keys.contains(Key.HARRY));
		assertEquals(3, keys.size());
	}
	
	@Test
	public void test_ContainsKey() {
		EnumTuple<Key, String> tuple = new EnumTuple<>();		
		tuple.set(Key.TOM, "fish");		
		tuple.set(Key.HARRY, "fishface");		
		
		assertTrue(tuple.containsKey(Key.TOM));
		assertTrue(tuple.containsKey(Key.HARRY));
		assertEquals(2, tuple.keySet().size());
	}
	
	@Test
	public void test_SettingTypleFromConstuctor() {
		EnumTuple<Key, String> tuple = new EnumTuple<>(Key.TOM, "cat");		
		
		assertEquals("cat", tuple.get(Key.TOM));
		assertEquals(1, tuple.keySet().size());
	}

}
