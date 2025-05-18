package hashmapOperation;

import java.util.HashMap;

import hashmapOperation.HashMapImplementation.MyHashMap;

public class UserClass {
	public static void main(String[] args) {
		MyHashMap<String, Integer> mp = new MyHashMap<>();

		System.out.println("\n======================= MyHashMap DEMO =======================\n");

		System.out.println(mp + " <= empty MyHashMap with zero entries\n");

		// put() method - adding entries
		mp.put("apple", 100);
		mp.put("banana", 200);
		mp.put("apple", 300); // update existing key
		System.out.println(mp + " <= after put() operations\n");

		// get() method - retrieve values
		System.out.println("Get apple: " + mp.get("apple")); // should print 300
		System.out.println("Get banana: " + mp.get("banana")); // should print 200
		System.out.println("Get mango (not present): " + mp.get("mango")); // should print null

		// size() method
		System.out.println("\nSize before remove: " + mp.size()); // should print 2

		// remove() method - deleting a key
		System.out.println("Removed: " + mp.remove("apple")); // should print 300

		// get() after remove
		System.out.println("Get apple after remove: " + mp.get("apple")); // should print null

		// Final size
		System.out.println("Size after remove: " + mp.size()); // should print 1

		System.out.println("\nFinal MyHashMap content: " + mp);
		System.out.println("\n=============================================================\n");

		// for the referencece i have used built in hashmap methods and
		HashMap<String, Integer> kv = new HashMap<String, Integer>();
		System.out.println("\n=========================================================================\n");
		System.out.println(kv + " <= empty map with zero entries\n");
		kv.put("ant", 30);
		kv.put("baby", 40);
		kv.put("cable", 20);
		System.out.println(kv);
		kv.put("ant", 70);
		System.out.println(kv);
		kv.remove("baby");
		System.out.println(kv);
	}

}
