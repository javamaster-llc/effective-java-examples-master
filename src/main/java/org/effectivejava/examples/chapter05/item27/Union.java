// Generic union method and program to exercise it - pages 129 - 130
package org.effectivejava.examples.chapter05.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {

	// Generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}

	// UnGeneric method
	@SuppressWarnings("unchecked")
	public static Set union1(Set s1, Set s2) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Set result = new HashSet(s1);
		result.addAll(s2);
		return result;
	}
	
	// Simple program to exercise generic method
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick",
				"Harry"));
		Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe",
				"Curly"));
		Set<String> aflCio = union(guys, stooges);
		System.out.println(aflCio);
		
		Set<String> aflCio1 = union1(guys, stooges);
		System.out.println(aflCio);		
	}
}
