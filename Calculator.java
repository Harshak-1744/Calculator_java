import java.util.*;
import java.util.ArrayList;

public class Calculator 
{
	public Calculator() {}
	
    public int add(int number1, int number2) 
    { 
        return number1 + number2; 
    }
	public int substract(int number1, int number2) 
    { 
        return number1 - number2; 
    }
	public int multiply(int number1, int number2) 
    { 
        return number1 * number2; 
    }
	public int floorDivide(int number1, int number2) 
    { 
        return number1 / number2; 
    }
	public int modulate(int number1, int number2) 
    { 
        return number1 % number2; 
    }
	public double divide(double number1, double number2) 
    { 
        return number1 % number2; 
    }
	

    
	public static void main(String[] args) 
    {

        System.out.println("BASIC CALCULATOR");

		Calculator myCalculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();
        System.out.println("Enter b number :- ");
        int b = sc.nextInt();
        
        
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        
        ArrayList<String> num = new ArrayList<>();
        num.add("[1]");
        num.add("[2]");
        num.add("[3]");
        num.add("[4]");
        num.add("[5]");
        num.add("[6]");
        
        ArrayList<String> name = new ArrayList<>();
        name.add("Add");
        name.add("Sub");
        name.add("Mul");
        name.add("FloorDiv");
        name.add("module");
        name.add("Div");
        
        arr.add(num);
        arr.add(name);
        
        for (int k = 0; k < arr.get(0).size(); k++) 
                    {
                        System.out.println(arr.get(0).get(k) +" "+ arr.get(1).get(k));
                    }
       
        

        int symbol = sc.nextInt();

        switch(symbol)
        {
            case 1:
                System.out.println("Addition of given number:- "+myCalculator.add(a,b));
            break;
            case 2:
                System.out.println("Subtraction of given numbers:- "+myCalculator.substract(a, b));
            break;
            case 3:
                System.out.println("Multiplication of given numbers:- "+myCalculator.multiply(a, b));
            break;
            case 4:
                System.out.println("FloorDivision of given numbers:- "+myCalculator.floorDivide(a, b));
            break;
            case 5:
                System.out.println("Modulate of given numbers:- "+myCalculator.modulate(a, b));
            break;
            case 6:
                System.out.println("Division of new numbers:- "+myCalculator.divide(a, b));
            break;
        }


        

    sc.close();
	}
}