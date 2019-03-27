import java.io.*;
import java.util.Scanner;


public class Inp {

    public static int chose(){
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.print("Напишите 1 если хотите ввести вручную, либо 2 если с файла.\n");
           ch = in.nextInt();

        return ch;
    }

    public static void inputKeyboard(short q[], double x[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ввеодите q: ");
        for (int i=0; i<10; i++)
         q[i] = in.nextShort();
        System.out.print("Введите x: ");
        for (int i=0; i<12; i++)
            x[i] = in.nextDouble();

        in.close();
    }
    public static void inputFile(short q[], double x[])throws Exception {
        FileReader a = new FileReader("q.txt");
        Scanner inq = new Scanner(a);
        for (int i=0; i<10; i++)
            q[i]=inq.nextShort();
        a.close();

        FileReader b = new FileReader("x.txt");
        Scanner inx = new Scanner(b);
        for (int i=0; i<12; i++)
            x[i] = inx.nextDouble();
        b.close();
    }
}
