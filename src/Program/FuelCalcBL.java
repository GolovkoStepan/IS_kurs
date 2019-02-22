package Program;

public class FuelCalcBL 
{
	// input data
	private double distance = 0;              
	private double fuelConsumption = 0;       
	private double fuelCost = 0; 
	
	// output data
	private double totalFuelConsumption; 
	private double totalSum;    
	
	// constructor
	public FuelCalcBL(final double distance, final double fuelConsumption, final double fuelCost)
	{
		// TODO: Organize the check of negative and zero values ​​of parameters. 
		//       For negative and zero parameter values assign fields to a value of zero. 
		//       Otherwise, assign the parameter values ​​to the fields and call the Calculate() method.
		if (distance <= 0 || fuelConsumption <= 0 || fuelCost <= 0) 
		{ 
			totalFuelConsumption = 0;
			totalSum = 0; 
		} else {
			this.distance = distance;
			this.fuelConsumption = fuelConsumption; this.fuelCost = fuelCost;
			Calculate(); 
		}
	}
	
	// calculating method
	private void Calculate()
	{
		// TODO: Create a calculation method using formulas
		totalFuelConsumption = (distance / 100) * fuelConsumption; 
		totalSum = totalFuelConsumption * fuelCost;
	}
	
	// getter for TotalFuelConsumption
	public double getTotalFuelConsumption()
	{
		return totalFuelConsumption;
	}
	
	// getter for TotalSum
	public double getTotalSum()
	{
		return totalSum;
	}
}

