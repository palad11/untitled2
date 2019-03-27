import java.lang.Math;
public class Summary {
    public static void Sum(short q[],double x[], double a[][]){
        for (int i=0; i<10; i++)
            for (int j = 0; j < 12; j++)
                if (q[i] == 14)
                    a[i][j] = Math.pow(Math.E, Math.cos(Math.sin(x[j])));
                else if (q[i] == 2 || q[i] == 6 || q[i] == 12 || q[i] == 16 || q[i] == 18) {
                    a[i][j] = Math.sin(Math.pow((((Math.pow(x[j], x[j] / 2)) / 2) / 3), 3));
                } else {
                    a[i][j] = Math.cbrt(Math.cbrt(Math.pow(2 * Math.pow(Math.E, x[j]), Math.cbrt(x[j]))));
                }
    }
}
