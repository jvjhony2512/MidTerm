/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.Scanner;

/**
 *
 * @author jhony
 */
public class InterestRate extends Account{
        double balance = Account.getBalance;
        double interestresult;
        double interestrate = 0.23;
        

    public InterestRate(double initialBalance, String givenUser) {
        super(initialBalance, givenUser);
        Scanner sc= new Scanner(System.in);
        System.out.println("enter time:");
        int time = sc.nextInt();
       interestresult = balance*interestrate*time;
    }
         
    
    
}
