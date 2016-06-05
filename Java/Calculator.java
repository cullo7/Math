import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.print("Enter a mathematical operation. \nElligible operators include +,-,/,*,^, and %\n(precedence: %,^,*,/,+,-)\n\n-> ");
        Scanner in  = new Scanner(System.in);
        Evaluate(in.nextLine());
    }
    
    public static void Evaluate(String equation){
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i = 0; i < equation.length(); i++){
            if(Character.isDigit(equation.charAt(i))){
                int strt = i;
                while(i < equation.length() && Character.isDigit(equation.charAt(i))){
                    System.out.println(equation.charAt(i));
                    i++;
                }
                numbers.push(Integer.parseInt(equation.substring(strt, i)));
                i--;
            }
            else if(equation.charAt(i) == '('){
                operators.push(equation.charAt(i));
            }
            else if(equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*' || equation.charAt(i) == '/' || equation.charAt(i) == '^' || equation.charAt(i) == '%'){
                while(!operators.isEmpty() && comparePrecedence(operators.peek(), equation.charAt(i))){
                    Eval(numbers, operators.pop());
                }
                operators.push(equation.charAt(i));
            }
            else if(equation.charAt(i) == ')'){
                while(operators.peek() != '('){
                    numbers = Eval(numbers, operators.pop());
                }
                operators.pop();
            }
            System.out.println("numbers: "+numbers+"operators: "+operators);
        }
        while(!operators.isEmpty()){
            numbers = Eval(numbers, operators.pop());
        }
        System.out.println(numbers.pop());
    }


    public static Stack<Integer> Eval(Stack<Integer> n, char op){
        int second = n.pop();
        int first = n.pop();
        switch(op){
            case '+':
                n.push(first + second);
                break;
            case '-':
                n.push(first - second);
                break;
            case '/':
                n.push(first / second);
                break;
            case '*':
                n.push(first * second);
                break;
            case '^':
                n.push((int)Math.pow(first,second));
                break;
            case '%':
                n.push(first % second);
                break;
        }
        return n;
    }

    public static boolean comparePrecedence(char first, char second){
        if((first == '*' || first == '/') && (second == '+' || second == '-') || (first == '^' || first == '%') && (second == '+' || second == '-') || (first == '^' || first == '%') && (second == '*' || second == '/')){
            return true;
        }
        return false;
    }
}