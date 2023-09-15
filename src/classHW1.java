import static java.lang.Math.*;
public class classHW1 {
    public static void main(String[] args) {
        int k=0;

        while(k<=10){
            double alpha=k*(PI/5);
            System.out.print(k+". ");
            System.out.print(alpha + "  ");
            System.out.print(Math.cos(alpha)+"  ");
            System.out.println(Math.sin(alpha)+"  ");
            k++;
        }
    }
}