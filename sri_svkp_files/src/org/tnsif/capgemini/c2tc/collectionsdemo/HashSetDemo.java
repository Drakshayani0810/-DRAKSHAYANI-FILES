package org.tnsif.capgemini.c2tc.collectionsdemo;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("mango");
		set.add("banana");
		set.add("grapes");
		set.add("apple");
		System.out.println("Hashset :"+ set);
	}

}