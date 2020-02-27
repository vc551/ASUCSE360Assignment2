package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	void testSimpleList() {		//Base Test
		SimpleList simplelist = new SimpleList();
		assertNotNull (simplelist);
	}

	@Test
		void testAdd1() {		//Adding 1 element
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		assertEquals("11",simplelist.toString());
	}

	@Test
	void testAdd2() {			//Adding 12 elements
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(116);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(21);
		simplelist.add(53);
		assertEquals("53 21 210 199 178 137 116 95 74 53 32 11",simplelist.toString());
	}

	@Test
	void testRemove1() {		//If element doesn't exist
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(2);
		simplelist.remove(21);
		assertEquals("2 11",simplelist.toString());
	}

	@Test
	void testRemove2() {		//If element does exist
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(2);
		simplelist.remove(11);
		assertEquals("2",simplelist.toString());
	}

	@Test
	void testRemove3() {		//If identical elements exist
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(2);
		simplelist.add(2);
		simplelist.add(23);
		simplelist.remove(2);
		assertEquals("23 2 11",simplelist.toString());
	}

	@Test
	void testCount1() {			//Test adding elements upto array length(10)
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(22);
		simplelist.add(23);
		simplelist.add(54);
		simplelist.add(75);
		simplelist.add(46);
		simplelist.add(87);
		simplelist.add(98);
		simplelist.add(19);
		simplelist.add(100);
		assertEquals(10,simplelist.count());
	}

	@Test
	void testCount2() {			//Test adding 12 elements
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(22);
		simplelist.add(23);
		simplelist.add(54);
		simplelist.add(75);
		simplelist.add(46);
		simplelist.add(87);
		simplelist.add(98);
		simplelist.add(19);
		simplelist.add(100);
		simplelist.add(111);
		simplelist.add(123);
		assertEquals(12,simplelist.count());
	}

	@Test
	void testToString1() {		//Test adding elements upto array length
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(116);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		assertEquals("210 199 178 137 116 95 74 53 32 11",simplelist.toString());
	}

	@Test
	void testToString2() {		//Test adding 10 elements and appending 1 element
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(116);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(231);
		simplelist.append(252);
		assertEquals("231 210 199 178 137 116 95 74 53 32 11 252",simplelist.toString());
	}

	@Test
	void testSearch1() {		//If element doesn't exist
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(231);
		simplelist.add(252);
		assertEquals(-1,simplelist.search(16));
	}

	@Test
	void testSearch2() {		//If element does exist
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(231);
		simplelist.add(252);
		assertEquals(7,simplelist.search(74));
	}

	@Test
	void testSearch3() {		//If identical elements exist
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(95);
		simplelist.add(16);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(231);
		simplelist.add(252);
		assertEquals(7,simplelist.search(95));
	}

	@Test
	void testAppend1() {		//Appending 2 elements into the list
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.append(114);
		simplelist.append(127);
		assertEquals("95 74 53 32 11 114 127",simplelist.toString());
	}

	@Test
	void testAppend2() {		//Starting adding elements with append
		SimpleList simplelist = new SimpleList();
		simplelist.append(11);
		simplelist.add(23);
		simplelist.append(45);
		assertEquals("23 11 45", simplelist.toString());
	}

	@Test
	void testFirst() {			//Get first element from 5 elements added into the list
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		assertEquals(95, simplelist.first());
	}

	@Test
	void testSize1() {			//Adding 10 elements
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(231);
		assertEquals(10, simplelist.size());
	}

	@Test
	void testSize2() {			//Adding 11 elements to increase the size by 50%
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(231);
		simplelist.add(254);
		assertEquals(15, simplelist.size());
	}

	@Test
	void testSize3() {			//Appending the 11th element to increase the size by 50%
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.add(95);
		simplelist.add(137);
		simplelist.add(178);
		simplelist.add(199);
		simplelist.add(210);
		simplelist.add(231);
		simplelist.append(254);
		assertEquals(15, simplelist.size());
	}

	@Test
	void testSize4() {			//Removing element so that the list is more than 25% empty and scales down
		SimpleList simplelist = new SimpleList();
		simplelist.add(11);
		simplelist.add(32);
		simplelist.add(53);
		simplelist.add(74);
		simplelist.remove(53);
		assertEquals(3, simplelist.size());
	}

}
