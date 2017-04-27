package com.fuzzymeme.tuples.simple;

import java.util.HashMap;
import java.util.Map;

public class SimpleTuple<T> {
	
	private Map<Integer, T> pairs = new HashMap<>();

	@SafeVarargs
	public SimpleTuple(T ... input) {
		int i = 0;
		for (T object : input) {
			pairs.put(i++, object);			
		}
	}
	
	public T get(int index) {
		return pairs.get(index);
	}
	
	public int size() {
		return pairs.size();
	}

}
