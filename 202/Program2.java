/* Nick Shorter 2/02/2017
 *pupose: to create a super hero using states and behaviors
 */


 	import java.util.Scanner;
 	import java.io.*;
 		public class Program2 {
 			public static void main (String [] args)throws IOException {
 				System.out.println("Iron man was created with an alterego of Tony Stark, he has a device of an iron man suit and a partner called War Machine.");
 				System.out.println("The Flash was created with an alterego of Barry Allen and his power is super speed and the outfit is red and yellow.");

 			}// end main
 		}// end class
	class Superhero1 {
				private String name;
				private String alterEgo;
				private String device;
				private String partner;

				public Superhero1() {
					name = "Iron Man";
					alterEgo= "Tony Stark";
					device= "rocket hands";
					partner= "war machine";
					System.out.println("Iron man created");
				} //end constructor
					public void setName(String n){
						name = n;
					}// end name
					public String getName(){
						return name;
					}// end getname
					public void setDevice(String d){
						device = d;
					}// end device
					public String getDevice() {
						return device;
					}// end getdevice
					public void setAlterego(String a){
						alterEgo = a;
					}// end setalterego
					public String getAlterego(){
						return alterEgo;
					}// get alterego
					public void setPartner(String p){
						partner = p;
					}// end partner

					public String getPartner() {
						return partner;
					}
				}// end class
		class Superhero2 {
				private String name;
				private String alterEgo;
				private String power;
				private String outfit;
				public Superhero2() {
					name = "The flash";
					alterEgo= "Barry Allen";
					power = "SuperFast Speed";
					outfit= "red and yellow";
					System.out.println("The Flash created");
				}//end constructor

					public void setName(String n){
						name = n;
					}// end name
					public String getName(){
						return name;
					}// end getname
					public void setPower (String p){
						power = p;
					}// end device
					public String getPower() {
						return power;
					}// end getdevice
					public void setAlterego(String a){
						alterEgo = a;
					}// end setalterego
					public String getAlterego(){
						return alterEgo;
					}// get alterego
					public void setOutfit(String o){
						outfit = o;
					}// end partner
					public String getOutfit() {
						return outfit;
					}

		}// end class