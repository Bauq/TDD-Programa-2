package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import List.DoublyLinkedList;
import Utilities.Calculator;

public class Program2Test {
	
	private DoublyLinkedList doublyLinkedList;
	private Calculator calculator;
	private double result;

	@Before
	public void setUp() throws Exception {
		doublyLinkedList = new DoublyLinkedList();
		calculator= new Calculator();
		
	}

	
	/*
	 ***** Test 1
	 */
	
	@Test
	public void test1BetaZero() {
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
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(-22.55, result, 0.01);
	}
	
	@Test
	public void test1BetaOne() {
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
		assertEquals(1.72, result, 0.01);
	}
	
	@Test
	public void test1CorrelationCoefficient() {
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
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(0.9545, result, 0.01);
	}
	
	@Test
	public void test1DeterminationCoefficient() {
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
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(0.9111, result, 0.01);
	}
	
	@Test
	public void test1YPrediction() {
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
		result = calculator.getYPrediction(doublyLinkedList, 386);
		assertEquals(644.429, result, 0.01);
	}
	
	/*
	 ***** Test 2
	 */
	
	@Test
	public void test2BetaZero() {
		doublyLinkedList.insertEnd(130, 15);
		doublyLinkedList.insertEnd(650, 69.9);
		doublyLinkedList.insertEnd(99, 6.5);
		doublyLinkedList.insertEnd(150, 22.4);
		doublyLinkedList.insertEnd(128, 28.4);
		doublyLinkedList.insertEnd(302, 65.9);
		doublyLinkedList.insertEnd(95, 19.4);
		doublyLinkedList.insertEnd(945, 198.7);
		doublyLinkedList.insertEnd(368, 38.8);
		doublyLinkedList.insertEnd(961, 138.2);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(-4.039, result, 0.01);
	}
	
	@Test
	public void test2BetaOne() {
		doublyLinkedList.insertEnd(130, 15);
		doublyLinkedList.insertEnd(650, 69.9);
		doublyLinkedList.insertEnd(99, 6.5);
		doublyLinkedList.insertEnd(150, 22.4);
		doublyLinkedList.insertEnd(128, 28.4);
		doublyLinkedList.insertEnd(302, 65.9);
		doublyLinkedList.insertEnd(95, 19.4);
		doublyLinkedList.insertEnd(945, 198.7);
		doublyLinkedList.insertEnd(368, 38.8);
		doublyLinkedList.insertEnd(961, 138.2);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(0.1681, result, 0.01);
	}
	
	@Test
	public void test2CorrelationCoefficient() {
		doublyLinkedList.insertEnd(130, 15);
		doublyLinkedList.insertEnd(650, 69.9);
		doublyLinkedList.insertEnd(99, 6.5);
		doublyLinkedList.insertEnd(150, 22.4);
		doublyLinkedList.insertEnd(128, 28.4);
		doublyLinkedList.insertEnd(302, 65.9);
		doublyLinkedList.insertEnd(95, 19.4);
		doublyLinkedList.insertEnd(945, 198.7);
		doublyLinkedList.insertEnd(368, 38.8);
		doublyLinkedList.insertEnd(961, 138.2);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(0.9333, result, 0.01);
	}
	
	@Test
	public void test2DeterminationCoefficient() {
		doublyLinkedList.insertEnd(130, 15);
		doublyLinkedList.insertEnd(650, 69.9);
		doublyLinkedList.insertEnd(99, 6.5);
		doublyLinkedList.insertEnd(150, 22.4);
		doublyLinkedList.insertEnd(128, 28.4);
		doublyLinkedList.insertEnd(302, 65.9);
		doublyLinkedList.insertEnd(95, 19.4);
		doublyLinkedList.insertEnd(945, 198.7);
		doublyLinkedList.insertEnd(368, 38.8);
		doublyLinkedList.insertEnd(961, 138.2);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(0.8711, result, 0.01);
	}
	
	@Test
	public void test2YPrediction() {
		doublyLinkedList.insertEnd(130, 15);
		doublyLinkedList.insertEnd(650, 69.9);
		doublyLinkedList.insertEnd(99, 6.5);
		doublyLinkedList.insertEnd(150, 22.4);
		doublyLinkedList.insertEnd(128, 28.4);
		doublyLinkedList.insertEnd(302, 65.9);
		doublyLinkedList.insertEnd(95, 19.4);
		doublyLinkedList.insertEnd(945, 198.7);
		doublyLinkedList.insertEnd(368, 38.8);
		doublyLinkedList.insertEnd(961, 138.2);
		result = calculator.getYPrediction(doublyLinkedList, 386);
		assertEquals(60.858, result, 0.01);
	}
	
	
	
	/*
	 ***** Test 3
	 */
	
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
	public void test3DeterminationCoefficient() {
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
	
	
	@Test
	public void test3YPrediction() {
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
		result = calculator.getYPrediction(doublyLinkedList, 386);
		assertEquals(528.4294, result, 0.001);
	}
	
	/*
	 ***** Test 4
	 */
	
	@Test
	public void test4BetaZero() {
		doublyLinkedList.insertEnd(163, 15);
		doublyLinkedList.insertEnd(765, 69.9);
		doublyLinkedList.insertEnd(141, 6.5);
		doublyLinkedList.insertEnd(166, 22.4);
		doublyLinkedList.insertEnd(137, 28.4);
		doublyLinkedList.insertEnd(355, 65.9);
		doublyLinkedList.insertEnd(136, 19.4);
		doublyLinkedList.insertEnd(1206, 198.7);
		doublyLinkedList.insertEnd(433, 38.8);
		doublyLinkedList.insertEnd(1130, 138.2);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(-4.604, result, 0.01);
	}
	
	@Test
	public void test4BetaOne() {
		doublyLinkedList.insertEnd(163, 15);
		doublyLinkedList.insertEnd(765, 69.9);
		doublyLinkedList.insertEnd(141, 6.5);
		doublyLinkedList.insertEnd(166, 22.4);
		doublyLinkedList.insertEnd(137, 28.4);
		doublyLinkedList.insertEnd(355, 65.9);
		doublyLinkedList.insertEnd(136, 19.4);
		doublyLinkedList.insertEnd(1206, 198.7);
		doublyLinkedList.insertEnd(433, 38.8);
		doublyLinkedList.insertEnd(1130, 138.2);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(0.140164, result, 0.01);
	}
	
	@Test
	public void test4CorrelationCoefficient() {
		doublyLinkedList.insertEnd(163, 15);
		doublyLinkedList.insertEnd(765, 69.9);
		doublyLinkedList.insertEnd(141, 6.5);
		doublyLinkedList.insertEnd(166, 22.4);
		doublyLinkedList.insertEnd(137, 28.4);
		doublyLinkedList.insertEnd(355, 65.9);
		doublyLinkedList.insertEnd(136, 19.4);
		doublyLinkedList.insertEnd(1206, 198.7);
		doublyLinkedList.insertEnd(433, 38.8);
		doublyLinkedList.insertEnd(1130, 138.2);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(0.9480, result, 0.01);
	}
	
	@Test
	public void test4DeterminationCoefficient() {
		doublyLinkedList.insertEnd(163, 15);
		doublyLinkedList.insertEnd(765, 69.9);
		doublyLinkedList.insertEnd(141, 6.5);
		doublyLinkedList.insertEnd(166, 22.4);
		doublyLinkedList.insertEnd(137, 28.4);
		doublyLinkedList.insertEnd(355, 65.9);
		doublyLinkedList.insertEnd(136, 19.4);
		doublyLinkedList.insertEnd(1206, 198.7);
		doublyLinkedList.insertEnd(433, 38.8);
		doublyLinkedList.insertEnd(1130, 138.2);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(0.8988, result, 0.01);
	}
	
	
	@Test
	public void test4YPrediction() {
		doublyLinkedList.insertEnd(163, 15);
		doublyLinkedList.insertEnd(765, 69.9);
		doublyLinkedList.insertEnd(141, 6.5);
		doublyLinkedList.insertEnd(166, 22.4);
		doublyLinkedList.insertEnd(137, 28.4);
		doublyLinkedList.insertEnd(355, 65.9);
		doublyLinkedList.insertEnd(136, 19.4);
		doublyLinkedList.insertEnd(1206, 198.7);
		doublyLinkedList.insertEnd(433, 38.8);
		doublyLinkedList.insertEnd(1130, 138.2);
		result = calculator.getYPrediction(doublyLinkedList, 386);
		assertEquals(49.4994, result, 0.001);
	}

}
