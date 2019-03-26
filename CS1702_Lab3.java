
public class CS1702_Lab3 
{
	static public void main(String args[])
	{
	   int x = 100, y = 204, c = -204;
	   double z = -23.1;
	   boolean a = true, b = false;
			
	  //Question 2.1 
	   if (x < y) //Condition of x being smaller than y
	   {
	      System.out.println("x is less than y"); //Statement if condition is matched
	   }
	   else
	   {
	      System.out.println("x is NOT less than y"); //Statement if condition is false
	   }
	   
	   //Question 2.2 (Doesn't work as one boolean cannot equal the other)
	   if (x > z && a == b)
	   	{
		   System.out.println("x is greater than y and a is equal to b");
	   	}
	   else
	   	{
		   System.out.println("x is not greater than y or a is not equal to b or both");
	   	}
	   
	   //Question 2.3
	   if (2 * c > y)
	   {
		   System.out.println("double of c is greater than y");
	   }
	   else
	   {
		   System.out.println("double of c is not greater than y");
	   }
	   
	   //Question 2.4 (Number can't equal boolean)
//	   if (x == b)
	  
	   //Question 2.5
	   if (c != y || c == y)
	   {
		   System.out.println("c is or isnt equal to y");
	   }
	   else
	   {
		   System.out.println("c is not equal or non-equal to y");
	   }
	   
	   //Question 2.6 (number can't equal boolean)
//	   if (z != y && c == a)
	
	   //Question 2.7 (Can't add number to boolean)
//	   if (y >= y && (a + 3) != 2)
	  
	   //Question 3.1
	   int j = 10;
	   int k = 5;
	   int l = 20;
	   
	   if (j >= k && j >= l)
	   {
		   if (k > l)
		   {
			   System.out.println("‘l’<=’k’<=’j’");
		   }
		   else
		   {
			   System.out.println("‘k’<=’l’<=’j’");
		   }
	   }
	   else if (k >= j && k >= l)
	   {
		   if (j > l)
		   {
			   System.out.println("‘l’<=’j’<=’k’");
		   }
		   else
		   {
			   System.out.println("‘j’<=’l’<=’k’");
		   }
	   }
	   else if (l >= k && l >= j)
	   {
		   if (k > j)
		   {
			   System.out.println("‘j’<=’k’<=’l’");
		   }
		   else
		   {
			   System.out.println("‘k’<=’j’<=’l’");
		   }
	   }
		   
	   //Question 3.2
	   // ?
	   
	   //Question 4.1
	   int o = 4;
	   if (o%2 == 0 && o%3 == 0)
	   {
		   System.out.println("'o' is divisible my 2 and 3");
	   }
	   else
	   {
		   System.out.println("'o' is NOT divisible my 2 and 3");
	   } 
	   
	   //Question 4.2
	   if (o%7 == 0 || o%9 == 0)
	   {
		   System.out.println("'o' is divisible my 7 or 9");
	   }
	   else
	   {
		   System.out.println("'o' is NOT divisible my 7 or 9");
	   }  
	   
	   //Question 4.3
	   if ((o%2 == 0 && o%3 == 0) || o%5 !=0)
	   {
		   System.out.println("'o' is divisible my 2 and 3 or not 5");
	   }
	   else
	   {
		   System.out.println("'o' is NOT divisible by 2 or 3 and not 5");
	   }
	   
	   //Question 5
	   String animal = "Ocelot"; //looks up for the case "Ocelot" in the switch statement
		int legs = 0; //State a variable
						
		switch(animal) //Cases of different animals with different Numb of legs
		{
			case "Alsatian Dog": 
				legs = 4;
				break;
			case "Sphynx Cat":
				legs = 4;
				break;
			case "Cobra":
				legs = 0;
				break;
			case "Baboon":
				legs = 2;
				break;
			case "Ocelot":
				legs = 4;
				break;
			case "Cod":
				legs = 0;
				break;
			case "Human":
				legs = 2;
				break;
			case "Tarantula":
				legs = 8;
				break;
			case "Black scorpion":
				legs = 8;
				break;
			case "Paul Allen the German Octopus":
				legs = 8;
				break;
			case "Minke Whale":
				legs = 0;
				break;
			case "Klingon":
				legs = 2;
				break;
			case "Potto":
				legs = 2;
				break;
			default: 
				legs = -1;
				break;
		}
		System.out.println("Legs in " + animal + " = " + legs);
	}

	}

