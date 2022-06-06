package com.sapient.asde.ui;

/**
 * @author ankkumar46
 * @version 1
 * this class sums and gets the average from the command line
 *
 * data types : byte (1) short(2) int(4) long(64) double(8) float(4) char(2) boolean (1bit)
 * every primitive type has their own Wrapper Class
 *
 * Boolean (true/false/null)
 *
 *
 *
 */

public class SumAndAvergare {
    public static void main(String[] args) {
        int n = args.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            try {
                int x = Integer.parseInt(args[i]);
                sum += x;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("not a number");
            }
        }
        System.out.println("Sum= "+sum);

        try{
            sum/=n;
            if(n==0) throw new ArithmeticException();
        }catch (ArithmeticException e){
            throw new ArithmeticException("Division By Zero error");
        }catch(Exception e){ //for catching arbitrary exception always in last
            e.printStackTrace();
        }
        System.out.println("Average= "+sum/n);

    }
}
