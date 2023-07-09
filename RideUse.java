package miniproject2;
import java.util.*;
public class RideUse extends Ride {

	public static void main(String[] args) {
		 final int charge=8;
         double total_charge;
         Scanner sc=new Scanner(System.in);
         System.out.println("Customer ride distance: ");
         double rideDistance=sc.nextDouble();
         System.out.println("car requested : ");
         String carName=sc.next();
         Ride r= new Ride();
         r.CarInformation();
         char carDriver = 'E';
         double min_dis=99999;
         for( int i=0;i<5;i++) {
        	 if(r.carModels[i].equals(carName)&&r.ratings[i]>=4.0) {
        		 if(min_dis>r.distance[i]) {
        		 min_dis=r.distance[i];
        		 carDriver=r.drivers[i];
        		 }
        	 }
         }
         System.out.println("Driver "+carDriver+" will get you to the destination");
         total_charge = rideDistance*charge;
         System.out.println("Total charge is: "+total_charge);
         sc.close();
	}

}
