package hashmapOperation;

import java.util.LinkedList;

public class HashMapImplementation {

	static class MyHashMap<K, V> {
		public static final int DEFAULT_CAPACITY = 4;
		public static final float DEFAULT_LOAD_FACTOR = 0.75f;

		// Node to store key-value pair
		private class Node {

			K key;

			V value;

			Node next;

			Node(K key, V value) {
				this.key = key;
				this.value = value;

			}

		}

		private LinkedList<Node>[] buckets;// array of buckets
		private int n; // no. of entries in the map

		// Initializes bucket array with capacity N
		private void initBuckets(int N) {
			buckets = new LinkedList[N];
			for (int i = 0; i < buckets.length; i++) {
				buckets[i] = new LinkedList<>();

			}
		}

		// default constructor for default capacity
		public MyHashMap() {
			initBuckets(DEFAULT_CAPACITY);

		}

		// Returns number of key-value pairs
		public int size() {
			return n;
		}

		// Computes bucket index for a given key
		private int hashFunc(K key) {
			int hc = key.hashCode();
			return (Math.abs(hc)) % buckets.length;
		}

		public void put(K key, V value) { // it will insert/update
			int bi = hashFunc(key);
			LinkedList<Node> currBucket = buckets[bi];
			int ei = searchInBuckets(currBucket, key);
			if (ei == -1) { // if key does not exist then it will inserting a new node
				Node node = new Node(key, value);
				currBucket.add(node);
				n++;
			} else { // update case
				Node currNode = currBucket.get(ei);
				currNode.value = value;

			}

		}

		// Searches for key in the given bucket, returns index or -1 if not found
		private int searchInBuckets(LinkedList<Node> linkedlist, K key) {
			for (int i = 0; i < linkedlist.size(); i++) {
				if (linkedlist.get(i).key.equals(key)) {
					return i;
				}
			}
			return -1;
		}

		// Returns value associated with key, or null if not found
		public V get(K key) {
			int bi = hashFunc(key);
			LinkedList<Node> currBucket = buckets[bi];

			int ei = searchInBuckets(currBucket, key);

			if (ei != -1) {
				Node currNode = currBucket.get(ei);
				return currNode.value;

			}
			return null;

		}
		// toString method to mimic standard HashMap output

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("{");
			boolean first = true;

			for (LinkedList<Node> bucket : buckets) {
				for (Node node : bucket) {
					if (!first) {
						sb.append(", ");
					}
					sb.append(node.key).append("=").append(node.value);
					first = false;
				}
			}

			sb.append("}");
			return sb.toString();
		}

		// Removes key from map, returns associated value if found
		public V remove(K key) {
			int bi = hashFunc(key);
			LinkedList<Node> currBucket = buckets[bi];
			int ei = searchInBuckets(currBucket, key);
			if (ei != -1) { // this means key is existing in the hashmap
				Node currNode = currBucket.get(ei);
				V val = currNode.value;
				currBucket.remove(ei);
				n--;
				return val;

			}

			return null;

		}

	}

}
