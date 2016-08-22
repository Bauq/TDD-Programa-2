package Utilities;
import List.DoublyLinkedList;

public class Calculator {

	public double xMean(DoublyLinkedList numbers) {
		double sum = 0, mean = 0;
		if (!numbers.isEmpty()) {
			for (int i = 0; i < numbers.size(); i++) {
				sum += numbers.getXInElement(i);
			}
			mean = sum / numbers.size();
		} else {
			mean = 0;
		}
		return mean;
	}
	
	public double yMean(DoublyLinkedList numbers) {
		double sum = 0, mean = 0;
		if (!numbers.isEmpty()) {
			for (int i = 0; i < numbers.size(); i++) {
				sum += numbers.getYInElement(i);
			}
			mean = sum / numbers.size();
		} else {
			mean = 0;
		}
		return mean;
	}
	
	public double getParameterBetaOne(DoublyLinkedList numbers){
		double betaOne=0, simpleSum = 0, powSum = 0, xMean, yMean;
		if(!numbers.isEmpty()){
			xMean = this.xMean(numbers);
			yMean = this.yMean(numbers);
			for (int i = 0; i < numbers.size(); i++) {
				simpleSum += ((numbers.getXInElement(i) - xMean)*(numbers.getYInElement(i) - yMean));
				powSum += Math.pow(numbers.getXInElement(i) - xMean, 2);
			}
			betaOne= (simpleSum/powSum);
		}
		return betaOne;
	}
	
	public double getParameterBetaZero(DoublyLinkedList numbers){
		double betaZero=0, xMean, yMean;
		if(!numbers.isEmpty()){
			xMean = this.xMean(numbers);
			yMean = this.yMean(numbers);
			
			betaZero = (yMean - (this.getParameterBetaOne(numbers)*xMean));
		}
		return betaZero;
	}
	
	
	public double getCorrelationCoefficient(DoublyLinkedList numbers){
		double correlationCoefficient=0, simpleSum = 0, powXSum = 0, powYSum = 0, xMean, yMean;
		if(!numbers.isEmpty()){
			xMean = this.xMean(numbers);
			yMean = this.yMean(numbers);
			for (int i = 0; i < numbers.size(); i++) {
				simpleSum += ((numbers.getXInElement(i) - xMean)*(numbers.getYInElement(i) - yMean));
				powXSum += Math.pow(numbers.getXInElement(i) - xMean, 2);
				powYSum += Math.pow(numbers.getYInElement(i) - yMean, 2);
			}
			correlationCoefficient= (simpleSum/Math.sqrt(powYSum*powXSum));
		}
		return correlationCoefficient;
	}
	
	public double getDeterminationCoefficient(DoublyLinkedList numbers){
		return Math.pow(this.getCorrelationCoefficient(numbers), 2);
	}
	
	public double getYPrediction(DoublyLinkedList numbers, double xEstimate){
		double yPrediction=0, betaZero, betaOne;
		if(!numbers.isEmpty()){
			betaZero= this.getParameterBetaZero(numbers);
			betaOne = this.getParameterBetaOne(numbers);
			
			yPrediction = betaZero + (betaOne*xEstimate);
		}
		return yPrediction;
	}

	
	
	

}
