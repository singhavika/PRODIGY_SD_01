import java.util.*;
public class TASK_01 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter temparature=");
        int temp=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the unit of temparature:");
        String unit = sc.nextLine().trim();
        
        int new_temp_k=0;
        int new_temp_f=0;
        int new_temp_c=0;
        if(unit.equalsIgnoreCase("celcius")){
           
                new_temp_k=temp+273;
            
            
                new_temp_f= (temp*9)/5+32;
                System.out.println(new_temp_f+" "+"degrees Farenheit");
        System.out.println(new_temp_k+" "+"Kelvin");
            
        }
        else if(unit.equalsIgnoreCase("kelvin")){
            
                new_temp_c=temp-273;
            
        
               new_temp_f= (9*(temp-273))/5 + 32;
               System.out.println(new_temp_c+" "+"degrees Celcius");
               System.out.println(new_temp_f+" "+"degrees Farenheit");
            
        }
        else{
            //Farenheit
            
                new_temp_c=(5*(temp-32))/9;
            
            
                new_temp_k=((temp - 32)*5)/9 + 273;
                System.out.println(new_temp_c+" "+"degrees Celcius");
                System.out.println(new_temp_k+" "+"Kelvin");
        }
        
    }
}
