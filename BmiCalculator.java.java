/*Design and developing a BMI calculator application using java programming
Body mass Index(BMI) is a measurement of health based on the height and weight of person or patient.
BMI value gives correct health report of a person
*/
import java.util.Scanner;
class BMI_calculator1{
    public static void display(double weight,double height){
   double result;
   result=weight/(height*height);
System.out.println("The BMI value of the patient is:"+result);
if(result<18.5){
    System.out.println("Person is Underweight");
}
else if(result>18.5 && result<25){
    System.out.println("Person is Normal in weight");
}
else if(result>25 && result<30){
    System.out.println("Person is Overweight");
}
else{
    System.out.println("Person is Obese");
   }
 }
} 

class Main{  
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //input weight and height of a person to calculate the health report
        System.out.println("Enter the Weight in kgs:");
        double weight=sc.nextDouble();
        System.out.println("enter the height in meters:");
        double height=sc.nextDouble();
    BMI_calculator1 d1=new BMI_calculator1();//creating class object
    d1.display(weight,height);
    }
}   





