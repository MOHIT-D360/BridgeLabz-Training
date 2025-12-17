public class VolumeOfEarth{
public static void main(String[] args){

	int radiusOfEarth = 6378;
	double volumeOfSphere = (4.0/3.0) * 3.14 * radiusOfEarth * radiusOfEarth * radiusOfEarth;
	
	double radiusOfEarthMiles = 6378 * 0.621;
	double volOfSphereInMiles = (4.0/3.0) * 3.14 * radiusOfEarthMiles * radiusOfEarthMiles * radiusOfEarthMiles;
	
	
	
	System.out.println("The volume of earth in cubic kilometers is " + volumeOfSphere + " and cubic miles in " + volOfSphereInMiles);
}
}