package miniproject2;

public class Ride {
	char[] drivers= {'A','B','C','D','E'};
	String[] carModels= {"Sedan","Hatch Back","5 Seater","Sedan","Hatch Back"};
	double[] ratings= {4,4.3,4.8,4.1,4.7};
	int[] distance= {500,1000,200,700,430};
	public void CarInformation() {
		System.out.println("Drivers Details: ");
		System.out.println("Driver " + "  Carmodel " +"	"+"Rating" +"	"+"DistanceFromCustomer ");
		for(int i=0;i<drivers.length;i++) {
			System.out.println(" "+drivers[i] +"	 "+ carModels[i]+ "  	"+ ratings[i]+ "  	"+ distance[i]);
		}
	}
	
}
