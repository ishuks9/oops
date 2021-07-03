package com.bridgelabz.oops;

import java.util.Scanner;
class FlipCoin
{
public static void main(String arg[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter how many number to move coin: ");
                int l = sc.nextInt();
                int h = 0;
                int t = 0;
                for(int i=0;i<l;i++){
                        if ((Math.random()%2) > 0.5){
                                h++;
                        }else{
                                t++;
                        }
                }
                double perheads = (h*100)%l;
                double pertails = 100-perheads;
                System.out.println("heads percentage: "+perheads+" tails percentage: " + pertails);
}
}
