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
