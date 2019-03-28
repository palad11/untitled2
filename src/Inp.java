import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Inp {

    public static int chose() {
        int ch = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Напишите 1 если хотите ввести вручную, либо 2 если с файла.\n");
        try {
            ch = in.nextInt();
        } catch (Exception e)
        {
            System.out.print("Ошибка ввода");
            System.exit(0);
        }
        return ch;
    }

    public static void inputKeyboard(short q[], double x[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ввеодите q: ");
        try {
        for (int i=0; i<10; i++)
         q[i] = in.nextShort(); }
        catch (Exception e){
            System.out.print("Ошибка ввода");
            System.exit(0);
        }
        System.out.print("Введите x: ");
        try {
            for (int i=0; i<12; i++)
                x[i] = in.nextDouble();
        }  catch (Exception e){
            System.out.print("Ошибка ввода");
            System.exit(0);
        }
        in.close();
    }
    public static void inputFile(short q[], double x[])throws Exception {

        try {
            FileReader a = new FileReader("q.txt");
            Scanner inq = new Scanner(a);
        for (int i=0; i<10; i++)
            q[i]=inq.nextShort();
            a.close();}
        catch (FileNotFoundException fne)
        {
            System.out.print("Файл q не найден");
            System.exit(0);
        }
        catch (IOException ioe){
            System.out.print("Ошибка чтения файла");
            System.exit(0);
        }
        catch (InputMismatchException e){
            System.out.print("Ошибка чтения с файла");
            System.exit(0);
        }



        try {
            FileReader b = new FileReader("x.txt");
            Scanner inx = new Scanner(b);
            for (int i = 0; i < 12; i++)
                x[i] = inx.nextDouble();
            b.close();
        }catch (FileNotFoundException fne)
            {
                System.out.print("Файл x не найден");
                System.exit(0);
            }
        catch (IOException ioe){
            System.out.print("Ошибка чтения файла");
            System.exit(0);
        }
        catch (InputMismatchException e){
            System.out.print("Ошибка чтения с файла");
            System.exit(0);
        }

    }
}
