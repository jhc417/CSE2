// Jack Curran
// 1/30/15
//hw02
//CSE2

//crate a class
public class Arithmetic {
    
    
    //add a main method
    public static void main (String []args){
        
        //input variables
        //number of socks
        int nSocks=3;
        //cost per pair of socks
         double sockCost$=2.58;
         
         //number of drinking glasses
         int nGlasses=6;
         //cost per glasses             //((int)(x*100))/100.0
         double glassCost$=2.29;
         
         //number of enevelope boxes
         int nEnvelopes=1;
         //cost per box of envelopes
         double envelopeCost$=3.25;
         double taxPercent=0.06;
         
         //total cost of each kind of item
         double totalSock= (nSocks*sockCost$);
         double totalGlasses= (nGlasses*glassCost$);
         double totalEnvelopes= (nEnvelopes*envelopeCost$);
         
         //sales tax for total cost of each item
         double sockTax= (totalSock*taxPercent);
         double glassesTax= (totalGlasses*taxPercent);
         double envelopesTax= (totalEnvelopes*taxPercent);
         
         //pretax total cost
         double totalCostNoTax= (totalSock+totalGlasses+
         totalEnvelopes);
         
         //total cost pf each including sales tax
         double totalSockWithTax=(totalSock+sockTax);
         double totalGlassesWithTax= (totalGlasses+glassesTax);
         double totalEnvelopesWithTax=(totalEnvelopes+envelopesTax);
         
         //total cost of everything including sales tax
         double totalCostWithTax= (totalSockWithTax+
         totalEnvelopesWithTax+ totalGlassesWithTax);
         
         //print out total cost of each before sales tax
         System.out.println("Total cost of socks before sales tax is $"+
         totalSock);
         System.out.println("Total cost of glasses before sales tax is $"+
         totalGlasses);
         System.out.println("Total cost of envelopes before sales tax is $"+
         totalEnvelopes);
         
         //print out total cost without sales tax
         System.out.println("The total cost before sales tax is $"+
         totalCostNoTax);
         
         //rounding sales tax to two decimal points
        sockTax= ((int) (sockTax*100))/100.0;
        glassesTax= ((int) (glassesTax*100)/100.0);
        envelopesTax= ((int) (envelopesTax*100)/100.0);
         //print out sales tax only for each item
         System.out.println("The sales tax on the socks is $"+
         sockTax);
         System.out.println("The sales tax on the glasses is $"+
         glassesTax);
         System.out.println("The sales tax on the envelopes is $"+
         envelopesTax);
         
         //rounding each cost including sales tax to two decimal places
         totalSockWithTax= ((int) (totalSockWithTax*100))/100.0;
         totalGlassesWithTax= ((int) (totalGlassesWithTax*100))/100.0;
         totalEnvelopesWithTax= ((int) (totalEnvelopesWithTax*100))/100.0;
         
         //print out cost of each inclusing sales tax
         System.out.println("The total cost inclduing sales tax of the socks is $"+
         totalSockWithTax);
         System.out.println("The total cost including sales tax of the glasses is $"+
         totalGlassesWithTax);
         System.out.println("The total cost including sales tax of the envelopes is $"+
         totalEnvelopesWithTax);
         
         //rounding total cost including sales tax to two decimal places
         totalCostWithTax= ((int) (totalCostWithTax*100))/100.0;
         //total cost of everything including sales tax
         System.out.println("The total cost including sales tax is $"+
         totalCostWithTax);
         
         
         
         
         
         
         
        
        
        
        
    }
}