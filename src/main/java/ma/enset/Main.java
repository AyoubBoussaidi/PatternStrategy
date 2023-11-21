package ma.enset;

import com.sun.source.tree.NewArrayTree;
import ma.enset.context.Context;
import ma.enset.strategy.Pay;
import ma.enset.strategy.PayPayPal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context;
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Choisir la methode de paiement : ");
            String str=scanner.nextLine();
            Pay pay =(Pay) Class.forName(str).newInstance();
            context=new Context(pay);
            context.effectuerStrategy();

        }
    }
}