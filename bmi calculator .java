import java.util.Scanner ;
  public class BMICalculator{
	  public static void main (String []args){
		  Scanner input = new Scanner (System.in);
		  boolean running = true;
		  
		  System.out.println("Welcome To The Enhanced BMI Tool");
		System.out.println("----");

	  
	     while (running){
//Get a user input
        System.out.print("Enter weight in kilograms: ");
       double weight = input.next
	   input.nextDouble();
	   
	   System.out.print(Enter your Height in Meters :");
	           double height = input.nextDouble();
			   // Calculating BMI 
			   double bmi = weight /(height*heoght);
			   
			   System.out.printf("Your BMI is : 2%f\n, bmi");
			   
			   //Determine and display category
			   String category = dertermineBMICategory(bmi);
			   System.out.println("Category: "+ Category ");
			   
			   //Ask to continue(Extension task)
		  System.out.print("/nDo you want to calculate again ? (yes/no):");
		       Strin responce = input.next();
			   if(responce.equalsIgoreCase("no")){
				   
				   running = false ;
			   System.out.println("Thank you for using the BMI Tool.Goodbye!");
			   } System.out.println ("---------");
				   }
				   input.close();
	    }
			  //Step 2&3 : The method to dertemine the categories
			  public static String dertermineBMICategory ( double bmi){
				  if (bmi < 18.5){
					  return "Underweight";
				  }else if (bmi < 25){
					  return "Normal";
				  }else if (bmi < 30){
					  return "Overweight";
				  }else if (bmi < 35){cal
					  return "obese";
				  }else{
				  return "Severely obese";
			}
       }
     }
  }
				  
			  
	  
  