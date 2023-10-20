import java.util.Scanner;

public class PalindromeExample {
    public boolean isPalindrome(String word){
        char[] charArray=word.toCharArray();
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        PalindromeExample palindrome=new PalindromeExample();
        System.out.println("Please enter the word that you want to check for palindrome");
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        boolean result=palindrome.isPalindrome(ss);
        System.out.println("Your entered word is palindrome"+" "+result);
    }
}
