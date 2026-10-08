     //Write a program that asks the user to enter a sentence and then prints the number of vowels in the sentence using a loop.
  
import java.util.*;
public class vovelwhile {


public static void main(String[]args){

     Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int length = str.length();
int count = 0;
int i=0;
while(i<length){
   char ch = str.charAt(i);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
      count++;
      i++;
   }
}     
System.out.println(count );
}
}

