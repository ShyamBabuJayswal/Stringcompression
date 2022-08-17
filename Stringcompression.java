import java.util.*;
import java.io.*;
public class Stringcompression {
    public static  stringc1(String str){
        String s = str.charAt(0) + " ";
        for(int i=0;i<str.length();i++){
            String curr = str.charAt(i);
            String prev = str.charAt(i-1);
            if(curr != prev){
                s += curr;
            }
        }
         return s;
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(stringc1(str));
    }
}
