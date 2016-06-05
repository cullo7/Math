import java.util.Scanner;

/*
class that takes a multiplication expression and returns it in reverse polish notation
Example:
    INPUT - 2+2*3
    OUTPUT - 223*+
*/

public class ReversePolish1 {  
    static char[] ans;
    static int addCount = 0;
    static boolean mult = false;
    public static char[] answer(String str) { 
        ans = str.toCharArray();
        for(int i = 0;i < str.length();i++){ //for loop to iterate through characters in expression
            if(ans[i]=='*'){
                mult = true;
            }
            else if(ans[i]=='+'){
                addCount++;
                reposition(i, str.length());
            }
            else{
                if(mult){
                    for(int k = i-1;k >= 0;k--){ // for loop to swap number after multiplication with multiplication sign
                        if(ans[k] != '*'){
                        char temp = ans[i];
                        ans[i] = ans[k+1];
                        ans[k+1] = temp;
                        mult = false;
                        k=-1;
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void reposition(int i,int k){ //moves each char in array to the left one then puts ans[i] in the last spot
        char c = ans[i];
        for(int l = i;l < k-1;l++){
            ans[l] = ans[l+1];
        }
        ans[k-1]=c;
    }
    public static void main(String args[]){
        Scanner read = new Scanner(System.in); //Scanner to accept user unput
        System.out.println("Enter addition or multiplication expression: ");
        String input = read.nextLine();
        System.out.println(answer(input));
    } 
}