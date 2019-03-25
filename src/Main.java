import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        short [] q = new short[10];
        int w = 2;
        for (int i=0; i<10; i++)
        {q[i]+=w;
            w+=2;}
        double [] x= new double[12];
        for (int i=0; i<12; i++){
            x[i]=Math.random()*22 - 12;
       }
        double [][]a=new double [10][12];
        for (int i=0; i<10; i++) {
            for (int j=0; j<12; j++){
            if (q[i] == 14)
                a[i][j]=Math.pow(Math.E,Math.cos(Math.sin(x[j])));
            else if (q[i]==2||q[i]==6||q[i]==12||q[i]==16||q[i]==18){
                a[i][j]=Math.sin(Math.pow((((Math.pow(x[j],x[j]/2))/2)/3),3));
            }
            else{
                a[i][j]=Math.cbrt(Math.cbrt(Math.pow(2*Math.pow(Math.E,x[j]),Math.cbrt(x[j]))));
            }
        }
        }

       for (int i=0; i<10; i++){
           for (int j=0; j<12; j++){
               //String formattedDouble = new DecimalFormat("#0.00").format(a[i][j]);
               //System.out.println(formattedDouble);
               System.out.printf("%.2f \n", a[i][j]);
    } }}
}
