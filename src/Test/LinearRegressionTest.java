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

	/*
	 * WithoutElements
	 */
	
	@Test
	public void testBetaZeroWithoutElements() {
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(0, result, 0.01);
	}

	
	@Test
	public void testBetaOneWithoutElements() {
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(0, result, 0.01);
	}
	
	@Test
	public void testCorrelationCoefficientWithoutElements() {
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(0, result, 0.01);
	}
	
	@Test
	public void testDeterminationCoefficientWithoutElements() {
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(0, result, 0.01);
	}
	
	@Test
	public void testYPredictionWithoutElements() {
		result = calculator.getYPrediction(doublyLinkedList, 5);
		assertEquals(0, result, 0.01);
	}
	
	/*
	 * XElementsZero
	 */
	
	@Test
	public void testBetaZeroXElementsZero() {
		doublyLinkedList.insertEnd(0, 13);
		doublyLinkedList.insertEnd(0, 1);
		doublyLinkedList.insertEnd(0, 18);
		doublyLinkedList.insertEnd(0, 20);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}

	
	@Test
	public void testBetaOneXElementsZero() {
		doublyLinkedList.insertEnd(0, 13);
		doublyLinkedList.insertEnd(0, 1);
		doublyLinkedList.insertEnd(0, 18);
		doublyLinkedList.insertEnd(0, 20);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testCorrelationCoefficientXElementsZero() {
		doublyLinkedList.insertEnd(0, 13);
		doublyLinkedList.insertEnd(0, 1);
		doublyLinkedList.insertEnd(0, 18);
		doublyLinkedList.insertEnd(0, 20);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testDeterminationXElementsZero() {
		doublyLinkedList.insertEnd(0, 13);
		doublyLinkedList.insertEnd(0, 1);
		doublyLinkedList.insertEnd(0, 18);
		doublyLinkedList.insertEnd(0, 20);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testYPredictionXElementsZero() {
		doublyLinkedList.insertEnd(0, 13);
		doublyLinkedList.insertEnd(0, 1);
		doublyLinkedList.insertEnd(0, 18);
		doublyLinkedList.insertEnd(0, 20);
		result = calculator.getYPrediction(doublyLinkedList, 5);
		assertTrue(Double.isNaN(result));
	}
	
	/*
	 * AllZero
	 */
	
	@Test
	public void testBetaZeroAllZero() {
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}

	
	@Test
	public void testBetaOneXAllZero() {
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testCorrelationCoefficientAllZero() {
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testDeterminationAllZero() {
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testYPredictionAllZero() {
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		doublyLinkedList.insertEnd(0, 0);
		result = calculator.getYPrediction(doublyLinkedList, 5);
		assertTrue(Double.isNaN(result));
	}
	
	/*
	 * XOppositeY
	 */
	
	@Test
	public void testBetaZeroXOppositeY() {
		doublyLinkedList.insertEnd(-13, 13);
		doublyLinkedList.insertEnd(-1, 1);
		doublyLinkedList.insertEnd(-18, 18);
		doublyLinkedList.insertEnd(-20, 20);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(0, result, 0.01);
	}

	
	@Test
	public void testBetaOneXOppositeY() {
		doublyLinkedList.insertEnd(-13, 13);
		doublyLinkedList.insertEnd(-1, 1);
		doublyLinkedList.insertEnd(-18, 18);
		doublyLinkedList.insertEnd(-20, 20);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(-1, result, 0.01);
	}
	
	@Test
	public void testCorrelationCoefficientXOppositeY() {
		doublyLinkedList.insertEnd(-13, 13);
		doublyLinkedList.insertEnd(-1, 1);
		doublyLinkedList.insertEnd(-18, 18);
		doublyLinkedList.insertEnd(-20, 20);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(-1, result, 0.01);
	}
	
	@Test
	public void testDeterminationXOppositeY() {
		doublyLinkedList.insertEnd(-13, 13);
		doublyLinkedList.insertEnd(-1, 1);
		doublyLinkedList.insertEnd(-18, 18);
		doublyLinkedList.insertEnd(-20, 20);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(1, result, 0.01);
	}
	
	@Test
	public void testYPredictionXOppositeY() {
		doublyLinkedList.insertEnd(-13, 13);
		doublyLinkedList.insertEnd(-1, 1);
		doublyLinkedList.insertEnd(-18, 18);
		doublyLinkedList.insertEnd(-20, 20);
		result = calculator.getYPrediction(doublyLinkedList, 5);
		assertEquals(-5, result, 0.01);
	}
	
	/*
	 * XIquals
	 */
	
	@Test
	public void testBetaZeroXIqualsY() {
		doublyLinkedList.insertEnd(13, 13);
		doublyLinkedList.insertEnd(1, 1);
		doublyLinkedList.insertEnd(18, 18);
		doublyLinkedList.insertEnd(20, 20);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(0, result, 0.01);
	}

	
	@Test
	public void testBetaOneXIqualsY() {
		doublyLinkedList.insertEnd(13, 13);
		doublyLinkedList.insertEnd(1, 1);
		doublyLinkedList.insertEnd(18, 18);
		doublyLinkedList.insertEnd(20, 20);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(1, result, 0.01);
	}
	
	@Test
	public void testCorrelationCoefficientXIqualsY() {
		doublyLinkedList.insertEnd(13, 13);
		doublyLinkedList.insertEnd(1, 1);
		doublyLinkedList.insertEnd(18, 18);
		doublyLinkedList.insertEnd(20, 20);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertEquals(1, result, 0.01);
	}
	
	@Test
	public void testDeterminationXIqualsY() {
		doublyLinkedList.insertEnd(13, 13);
		doublyLinkedList.insertEnd(1, 1);
		doublyLinkedList.insertEnd(18, 18);
		doublyLinkedList.insertEnd(20, 20);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(1, result, 0.01);
	}
	
	@Test
	public void testYPredictionXIqualsY() {
		doublyLinkedList.insertEnd(13, 13);
		doublyLinkedList.insertEnd(1, 1);
		doublyLinkedList.insertEnd(18, 18);
		doublyLinkedList.insertEnd(20, 20);
		result = calculator.getYPrediction(doublyLinkedList, 5);
		assertEquals(5, result, 0.01);
	}
	
	/*
	 * AllYEqual
	 */
	
	@Test
	public void testBetaZeroAllYEqual() {
		doublyLinkedList.insertEnd(13, 3);
		doublyLinkedList.insertEnd(1, 3);
		doublyLinkedList.insertEnd(18, 3);
		doublyLinkedList.insertEnd(20, 3);
		result = calculator.getParameterBetaZero(doublyLinkedList);
		assertEquals(3, result, 0.01);
	}

	
	@Test
	public void testBetaOneAllYEqual() {
		doublyLinkedList.insertEnd(13, 3);
		doublyLinkedList.insertEnd(1, 3);
		doublyLinkedList.insertEnd(18, 3);
		doublyLinkedList.insertEnd(20, 3);
		result = calculator.getParameterBetaOne(doublyLinkedList);
		assertEquals(0, result, 0.01);
	}
	
	@Test
	public void testCorrelationCoefficientAllYEqual() {
		doublyLinkedList.insertEnd(13, 3);
		doublyLinkedList.insertEnd(1, 3);
		doublyLinkedList.insertEnd(18, 3);
		doublyLinkedList.insertEnd(20, 3);
		result = calculator.getCorrelationCoefficient(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testDeterminationAllYEqual() {
		doublyLinkedList.insertEnd(13, 3);
		doublyLinkedList.insertEnd(1, 3);
		doublyLinkedList.insertEnd(18, 3);
		doublyLinkedList.insertEnd(20, 3);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertTrue(Double.isNaN(result));
	}
	
	@Test
	public void testYPredictionAllYEqual() {
		doublyLinkedList.insertEnd(13, 3);
		doublyLinkedList.insertEnd(1, 3);
		doublyLinkedList.insertEnd(18, 3);
		doublyLinkedList.insertEnd(20, 3);
		result = calculator.getYPrediction(doublyLinkedList, 5);
		assertEquals(3, result, 0.01);
	}
	
	/*
	 * Real Test
	 */
	
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
	public void testDeterminationCoefficient() {
		doublyLinkedList.insertEnd(150, 13);
		doublyLinkedList.insertEnd(127, 16);
		doublyLinkedList.insertEnd(160, 21);
		doublyLinkedList.insertEnd(210, 20);
		doublyLinkedList.insertEnd(250, 16);
		doublyLinkedList.insertEnd(130, 13);
		doublyLinkedList.insertEnd(60, 12);
		doublyLinkedList.insertEnd(55, 14);
		result = calculator.getDeterminationCoefficient(doublyLinkedList);
		assertEquals(0.3161, result, 0.01);
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

}
