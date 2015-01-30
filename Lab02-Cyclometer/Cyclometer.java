// Jack Curran
// 1/30/15
//CSE2

public class Cyclometer {
    
    public static void main (String[] args){
        //declaring necessary varibales
        int secsTrip1=480;
        int secsTrip2=3220;
        int countsTrip1=1561;
        int countsTrip2=9037;
        
        double wheelDiameter=27.0;
        double PI=3.14159;
        int feetPerMile=5280;
        int inchesPerFoot=12;
        int secondsPerMinute=60;
        
        double distanceTrip1;
        double distanceTrip2;
        double totalDistance;
        //printing out trip times
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            (countsTrip1)+ " counts");
            
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            (countsTrip2)+ " counts");
            //calculating the distance of each trip
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out distancea in miles
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }      
        
        

}