//import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args)throws Exception {
        short [] q = new short[10];
        double [] x= new double[12];
        double [][]a=new double [10][12];
        int ch = Inp.chose();
        if (ch == 1)
            Inp.inputKeyboard(q,x);
        else if (ch==2)
            Inp.inputFile(q,x);
        else
             {System.out.print("Комманда не распознана.");
        System.exit(0);}

        Summary.Sum(q,x,a);



       for (int i=0; i<10; i++){
           for (int j=0; j<12; j++){

               System.out.printf("%.2f \t", a[i][j]);
    } System.out.println();
       }
    }
}

   /*
   Оставлю это дерьмо тут на всякий случай
   //String formattedDouble = new DecimalFormat("#0.00").format(a[i][j]);
   //System.out.println(formattedDouble);
   short [] q = new short[10];
    // int w = 2;
    //for (int i=0; i<10; i++)
    //{q[i]+=w;
    //  w+=2;}
    double [] x= new double[12];
//    for (int i=0; i<12; i++){
//      x[i]=Math.random()*22 - 12;
// }
//Summary summ = new Summary(); */