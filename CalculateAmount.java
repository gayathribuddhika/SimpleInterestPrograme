
package calculateamount;


public class CalculateAmount {

    
    public static void main(String[] args) {
        double Amount;
        double Principal = 10000;
        double rate = 0.01;
        int days;
        System.out.println("Day\tAmount");
        System.out.println(" ");
        for(days = 1;days<=20;days++){
            Amount = Principal * Math.pow(1+ rate, days);
            System.out.println(days+"\t"+Amount);
        }
    }
    
}
