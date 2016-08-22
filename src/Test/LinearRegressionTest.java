package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import List.DoublyLinkedList;
import Utilities.Calculator;

public class LinearRegressionTest {
	
	private DoublyLinkedList doublyLinkedList;
	private Calculator calculator;
	private double result;

	@Before
	public void setUp() throws Exception {
		doublyLinkedList = new DoublyLinkedList();
		calculator= new Calculator();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBetaZero() {
		doublyLinkedList.insertEnd(150, 13);
		doublyLinkedList.insertEnd(127, 16);
		doublyLinkedList.insertEnd(160, 21);
		doublyLinkedList.insertEnd(210, 20);
		doublyLinkedList.insertEnd(250, 16);
		doublyLinkedList.insertEnd(130, 13);
		doublyLinkedList.insertEnd(60, 12);
		doublyLinkedList.insertEnd(55, 14);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(11.62, result, 0.01);
	}

	@Test
	public void testBetaOne() {
		doublyLinkedList.insertEnd(150, 13);
		doublyLinkedList.insertEnd(127, 16);
		doublyLinkedList.insertEnd(160, 21);
		doublyLinkedList.insertEnd(210, 20);
		doublyLinkedList.insertEnd(250, 16);
		doublyLinkedList.insertEnd(130, 13);
		doublyLinkedList.insertEnd(60, 12);
		doublyLinkedList.insertEnd(55, 14);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(0.03, result, 0.01);
	}
	
	
	@Test
	public void testYPrediction() {
		doublyLinkedList.insertEnd(150, 13);
		doublyLinkedList.insertEnd(127, 16);
		doublyLinkedList.insertEnd(160, 21);
		doublyLinkedList.insertEnd(210, 20);
		doublyLinkedList.insertEnd(250, 16);
		doublyLinkedList.insertEnd(130, 13);
		doublyLinkedList.insertEnd(60, 12);
		doublyLinkedList.insertEnd(55, 14);
		result = calculator.getYPrediction(doublyLinkedList, 5);
		assertEquals(11.77, result, 0.01);
	}
	
	@Test
	public void testCorrelationCoefficient() {
		doublyLinkedList.insertEnd(150, 13);
		doublyLinkedList.insertEnd(127, 16);
		doublyLinkedList.insertEnd(160, 21);
		doublyLinkedList.insertEnd(210, 20);
		doublyLinkedList.insertEnd(250, 16);
		doublyLinkedList.insertEnd(130, 13);
		doublyLinkedList.insertEnd(60, 12);
		doublyLinkedList.insertEnd(55, 14);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(0.562231, result, 0.01);
	}
	
	
	@Test
	public void test1BetaZero() {
		doublyLinkedList.insertEnd(130, 163);
		doublyLinkedList.insertEnd(650, 765);
		doublyLinkedList.insertEnd(99, 141);
		doublyLinkedList.insertEnd(150, 166);
		doublyLinkedList.insertEnd(128, 137);
		doublyLinkedList.insertEnd(302, 355);
		doublyLinkedList.insertEnd(95, 136);
		doublyLinkedList.insertEnd(945, 1206);
		doublyLinkedList.insertEnd(368, 433);
		doublyLinkedList.insertEnd(961, 1130);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(1.7279, result, 0.01);
	}
	
	@Test
	public void test2BetaZero() {
		doublyLinkedList.insertEnd(130, 186);
		doublyLinkedList.insertEnd(650, 699);
		doublyLinkedList.insertEnd(99, 132);
		doublyLinkedList.insertEnd(150, 272);
		doublyLinkedList.insertEnd(128, 291);
		doublyLinkedList.insertEnd(302, 331);
		doublyLinkedList.insertEnd(95, 199);
		doublyLinkedList.insertEnd(945, 1890);
		doublyLinkedList.insertEnd(368, 788);
		doublyLinkedList.insertEnd(961, 1601);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(-4.039, result, 0.01);
	}
	
	@Test
	public void test3BetaZero() {
		doublyLinkedList.insertEnd(163, 186);
		doublyLinkedList.insertEnd(765, 699);
		doublyLinkedList.insertEnd(141, 132);
		doublyLinkedList.insertEnd(166, 272);
		doublyLinkedList.insertEnd(137, 291);
		doublyLinkedList.insertEnd(355, 331);
		doublyLinkedList.insertEnd(136, 199);
		doublyLinkedList.insertEnd(1206, 1890);
		doublyLinkedList.insertEnd(433, 788);
		doublyLinkedList.insertEnd(1130, 1601);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(-23.92, result, 0.01);
	}
	
	@Test
	public void test3BetaOne() {
		doublyLinkedList.insertEnd(163, 186);
		doublyLinkedList.insertEnd(765, 699);
		doublyLinkedList.insertEnd(141, 132);
		doublyLinkedList.insertEnd(166, 272);
		doublyLinkedList.insertEnd(137, 291);
		doublyLinkedList.insertEnd(355, 331);
		doublyLinkedList.insertEnd(136, 199);
		doublyLinkedList.insertEnd(1206, 1890);
		doublyLinkedList.insertEnd(433, 788);
		doublyLinkedList.insertEnd(1130, 1601);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(1.43097, result, 0.01);
	}
	
	@Test
	public void test3CorrelationCoefficient() {
		doublyLinkedList.insertEnd(163, 186);
		doublyLinkedList.insertEnd(765, 699);
		doublyLinkedList.insertEnd(141, 132);
		doublyLinkedList.insertEnd(166, 272);
		doublyLinkedList.insertEnd(137, 291);
		doublyLinkedList.insertEnd(355, 331);
		doublyLinkedList.insertEnd(136, 199);
		doublyLinkedList.insertEnd(1206, 1890);
		doublyLinkedList.insertEnd(433, 788);
		doublyLinkedList.insertEnd(1130, 1601);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(0.9631, result, 0.01);
	}
	
	@Test
	public void test3ResidualVariance() {
		doublyLinkedList.insertEnd(163, 186);
		doublyLinkedList.insertEnd(765, 699);
		doublyLinkedList.insertEnd(141, 132);
		doublyLinkedList.insertEnd(166, 272);
		doublyLinkedList.insertEnd(137, 291);
		doublyLinkedList.insertEnd(355, 331);
		doublyLinkedList.insertEnd(136, 199);
		doublyLinkedList.insertEnd(1206, 1890);
		doublyLinkedList.insertEnd(433, 788);
		doublyLinkedList.insertEnd(1130, 1601);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(0.9276, result, 0.01);
	}
	

}
