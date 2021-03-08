/* Team Members :
 	1.Sowmiya B  		- 18IT090 
	2.Dharanitharan I   - 18IT019
*/

//importing required packages
import java.io.*;
import java.util.*; 
public class Activity1 
{


public static void main(String[] args)throws Exception 
{ 
// We need to provide file path as the parameter: 
// double backquote is to avoid compiler interpret words 
File file1 = new File("D:/6th Sem/EDP/Sat/BoyNames.txt"); 
File file2 = new File("D:/6th Sem/EDP/Sat/GirlNames.txt");

//Creating an object for getting userInput
Scanner input =new Scanner(System.in);

//Read data from the file
BufferedReader brboys = new BufferedReader(new FileReader(file1)); 
BufferedReader brgirls = new BufferedReader(new FileReader(file2)); 

//Declaring required variables
String boyName;
String girlName;
int flag1 = 0;
int flag2 = 0;
List<String> boy_list = new ArrayList<String>(); //To store boys names 
List<String> girl_list = new ArrayList<String>(); //To store girls names

System.out.println("Enter your choice : ");
System.out.println("1.Boyname ");
System.out.println("2.Girlname ");
String ch = input.nextLine(); 			// Read user input
int choice = Integer.parseInt( ch); //String to integer conversion

switch(choice){
case 1 :
boy_list.clear();
System.out.println("Enter Boy name : ");
String boy_name_input = input.nextLine();
while ((boyName = brboys.readLine()) != null){
	if (boyName.contains(boy_name_input)){
		flag1 = 0;			//To find the name is present in the list or not
		boy_list.add(boyName);		//Appending the names in the list
	}	
	else{
		continue;	
	}	
}
if(flag1 == 0){	
	for (String boy : boy_list){
	System.out.println(boy+", is present in BoyName.txt"); //if name present in the boyname.txt
	}
		
}
else{
	System.out.println(boy_name_input+", is not present"); //if name not present in the boyname.txt
	}	
break;  //Exit from case 1

case 2 :
girl_list.clear();
System.out.println("Enter Girl name : ");
String girl_name_input = input.nextLine();	
while ((girlName = brgirls.readLine()) != null) {	
	if (girlName.contains(girl_name_input)){
		flag2 = 0; 			//To find the name is present in the name list or not
		girl_list.add(girlName);		//Appending the names in the list
	}
	else{
		continue ;
	}
}
if(flag2 == 0){
	for (String girl : girl_list){
	System.out.println(girl+", is present in GirlName.txt"); //if name present in the girlname.txt
	}
		
	}
else{
	System.out.println(girl_name_input+", is not present"); //if name not present in the girlname.txt
	}	
break; 
}
}
}
