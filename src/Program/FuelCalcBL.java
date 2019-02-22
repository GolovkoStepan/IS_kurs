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
	}
	
	// calculating method
	private void Calculate()
	{
		// TODO: Create a calculation method using formulas
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

