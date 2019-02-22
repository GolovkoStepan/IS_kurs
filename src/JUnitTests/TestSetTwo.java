package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Program.FuelCalcBL;

public class TestSetTwo {

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
		
		distance = 150d;
		fuelConsumption = 12d;
		fuelCost = 28d;
		
		fc = new FuelCalcBL(distance, fuelConsumption, fuelCost);
		
		expectedTotalFuelConsumption = 18d;
		expectedTotalSum = 504d;
		
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

