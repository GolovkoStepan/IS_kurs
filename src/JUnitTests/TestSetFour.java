package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Program.FuelCalcBL;

public class TestSetFour {

	@Test
	public void test() {
		FuelCalcBL fc;
		
		double distance;
		double fuelConsumption;
		double fuelCost;
		
		double expectedTotalFuelConsumption;
		double expectedTotalSum;
		
		double actualTotalFuelConsumption;
		double actualTotalSum;
		
		double delta;
		
		// TODO: Create an equals test via assertEquals() here
		
		distance = 1000d;
		fuelConsumption = 15d;
		fuelCost = 35d;
		
		fc = new FuelCalcBL(distance, fuelConsumption, fuelCost);
		
		expectedTotalFuelConsumption = 150d;
		expectedTotalSum = 5250d;
		
		actualTotalFuelConsumption = fc.getTotalFuelConsumption();
		actualTotalSum = fc.getTotalSum();
		
		delta = 0d;
		assertEquals(expectedTotalFuelConsumption, actualTotalFuelConsumption, delta);
		
		delta = 0d;
		assertEquals(expectedTotalSum, actualTotalSum, delta);
		
		// TODO: Create an equals test for negative parameters via assertEquals() here
		
		distance = -100d;
		fuelConsumption = -10d;
		fuelCost = -2000d;
		
		fc = new FuelCalcBL(distance, fuelConsumption, fuelCost);
		
		expectedTotalFuelConsumption = 0d;
		expectedTotalSum = 0d;
		
		actualTotalFuelConsumption = fc.getTotalFuelConsumption();
		actualTotalSum = fc.getTotalSum();
		
		delta = 0d;
		assertEquals(expectedTotalFuelConsumption, actualTotalFuelConsumption, delta);
		
		delta = 0d;
		assertEquals(expectedTotalSum, actualTotalSum, delta);
	}

}

