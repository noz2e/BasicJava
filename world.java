import java.util.Scanner;

public class world {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("What is the first number");
        
        String totalPrice = myObj.nextLine();
        
        double number1 = Double.valueOf(totalPrice);
        
        
        Scanner myObj1 = new Scanner(System.in);
        
        System.out.println("What is the operator (+-*/)");
        
        String op = myObj1.nextLine();
        
        
        
        Scanner myObj2 = new Scanner(System.in);
        
        System.out.println("What is the second number");
        
        String totalPrice2 = myObj2.nextLine();
        
        double number2 = Double.valueOf(totalPrice2);
        
        
        System.out.println();
        switch(op){
            case "+":   op = "+";
                number1 += number2 ;
                System.out.println(number1);
                break;
                
            case "-": op = "-";
                number1 -= number2;
                System.out.println(number1);
                break;
                
            case "*": op = "*";
                number1 *= number2;
                System.out.println(number1);
                break;
                
            case "/": op = "/";
                number1 /= number2;
                System.out.println(number1);
                break;
                
            default :
                System.out.println("incorrect operator");
                break;
        } 

    }   
}