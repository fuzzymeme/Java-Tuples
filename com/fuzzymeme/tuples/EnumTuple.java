package com.fuzzymeme.tuples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EnumTuple<K extends EnumTupleKey, T> {
		
	private Map<K, T> pairs = new HashMap<>();
	
	public EnumTuple() {}
	
	public EnumTuple(K key, T value) {
		pairs.put(key, value);
	}

	public void set(K key, T value) {
		pairs.put(key, value);
	}

	public T get(K key) {
		return pairs.get(key);
	}
	
	public void remove(K key) {
		pairs.remove(key);
	}
	
	public Set<K> keySet() {
		return pairs.keySet();
	}
	
	public boolean containsKey(K key) {
		return pairs.containsKey(key);
	}
	
	public int size() {
		return pairs.size();
	}
	
}
