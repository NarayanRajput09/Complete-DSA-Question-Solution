
import java.util.*;
public class HardTenSteel {
    public static void main(String[] args) {
//7)  A certain grade of steel is graded according to the following conditions 
// i. Hardness must be greater than 50 
// ii. Carbon content must be less than 0.7 
// iii. Tensile strength must be greater than 5600 
// The grades are as follows: 
// ● The grade is 10 if all three conditions are met 
// ● The grade is 9 if conditions (i) and (ii) are met 
// ● The grade is 8 if conditions (ii) and (iii) are met 
// ● The grade is 7 if conditions (i) and (iii) are met 
// ● The grade is 6 if only one condition is met 
// ● The grade is 5 if none of the conditions are met 

Scanner sc =new Scanner(System.in);
int  Hardness= 50;
int Tensile=5600;
double Carbon=0.7;
if(Hardness>50&&Tensile>5600&&Carbon>0.7){
    System.out.println("Grade 10");
}else if(Hardness>50&&Carbon>0.7){
        System.out.println("Grade 9");

}else if(Carbon>0.7&&Hardness>50){
        System.out.println("Grade 8");

}else if(Hardness>50&&Tensile>5600){
        System.out.println("Grade 7");

}else if(Hardness>50||Tensile>5600||Carbon>0.7) {
        System.out.println("Grade 6");

}else{
             System.out.println("Grade 5");
   
}
    }
}
