import static ibio.Helpers.*;
public class classHW2 {
    public static void main(String[] args) {
        boolean run=true;
        while(run){
            String operation = input("give operation plz: ");
            if(operation.equalsIgnoreCase("end")){
                run=false;
            }
            else{
                int A= inputInt("give integer operator 1: ");
                int B = inputInt("give integer operator 2: ");
                if(operation.equalsIgnoreCase("add")) {
                    System.out.println(A + B);
                    run=false;
                }
                else if(operation.equalsIgnoreCase("sub")){
                    System.out.println(A-B);
                    run=false;
                }else{
                    System.out.println("i don't know");
                    run=false;
            }

        }
    }
}}
