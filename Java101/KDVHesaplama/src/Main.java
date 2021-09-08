

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        double price;
        double lastPrice = 0;
        double kdv = 0;
        System.out.print("Price : ");
        price = scanner.nextInt();
        
        if(price < 1000) {
        	lastPrice = price + ((price*18)/100);
        	kdv =(price*18)/100;
        }else {
        	lastPrice = price + ((price*8)/100);
        	kdv = (price*8)/100;
        }
        System.out.println("KDV : " + kdv);
        System.out.println("Last Price : " + lastPrice);

    }

}
