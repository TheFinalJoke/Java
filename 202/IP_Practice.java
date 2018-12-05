/* Nick Shorter 2/22/2017
 *Purpose: to create a being as the parent UML to Monster and Superhero
 * Sample run: You have created a being with a name Cookie Monster and planet of seaseme Street was created with the lore of Fiction and the type of Killer Monster To Cookies and does he roar? true
				You have created a being with a name deadpool and planet of earth with the power of Lazer vision and the outfit of red and black
 */

 	import java.util.*;
 	import java.io.*;
 		public class IP_Practice {
 			public static void main (String[] args) throws IOException {
				Monster mon = new Monster("Killer Monster To Cookies ", "Fiction ",true, "Cookie Monster", "seaseme Street ");
				Superhero Sup = new Superhero ("Lazer vision", "red and black", "deadpool", "earth ");
				System.out.println(mon);
				System.out.println(Sup);
				Me m = new Me("I love canes","Nick", "Canes world");
				System.out.println(m);
				Me me = new Me("i love canes", "Nick", "krypton");
				System.out.println("Does object m equal the second m object? " + m.equals(m));
				System.out.println("Does object m equal object me? " + m.equals(me));
				display(m);
 			}// end main

 			public static void display(Being m){
 				System.out.println("my Name is: " + m.getName() + " and i am from " + m.getPlanet());
 				if (m instanceof Me){
 					System.out.println("i like " + ((Me)m).getLike());
 				}
 			}// end display
 		}// end class

 		class Being {
 			private String name;
 			private String planet;

 			public Being() {
 			}// Public Being

 			public Being(String name, String planet) {
 				this.name = name;
 				this.planet = planet;
 			}// Public Being


 			public void setName(String name){
 				this.name = name;
 			}// end setName

 			public String getName(){
 				return name;
 			}// end getName

 			public void setPlanet(String planet){
 				this.planet = planet;
 			}// setPLanet

 			public String getPlanet(){
 				return planet;
 			}// getPlanet

 			public String toString() {
 				return "You have created a being with a name " + name + " and planet of " + planet;

 			}// toString
 			public boolean equals(Being b) {
 				String s1 = b.getName();
 				String s2 = b.getPlanet();

 				if((this.name).equals(s1) && (this.planet).equals(s2)){
 					return true;
 				}
 				else
 					return false;
 			}
			}// class Being

		class Monster extends Being{
			private String type;
			private String lore;
			private boolean roar;

			public Monster(){
			}// public monster

			public Monster(String name, String planet){
				setName(name);
				setPlanet(planet);
			}
				public Monster(String type, String lore, boolean roar){
				this.type = type;
				this.lore = lore;
				this.roar = roar;
			}
			public Monster(String type, String lore, boolean roar, String name, String planet){
				setName(name);
				setPlanet(planet);
				this.type = type;
				this.lore = lore;
				this.roar = roar;
			}

			public void setType(String type){
				this.type = type;
			}
			public String getType(){
				return type;
			}

			public void setLore(String lore){
				this.lore = lore;
			}

			public String getLore(){
				return lore;
			}
			public void setRoar(boolean roar){
				this.roar = roar;
			}

			public boolean isRoar(){
				return roar;
			}
			@Override
			public String toString(){
				return super.toString() + "was created with the lore of " + lore + "and the type of " + type + "and does he roar? " + roar;
			}

		}// end monster

		class Superhero extends Being {
			private String power;
			private String outfit;

			public Superhero(){
			}
			public Superhero(String name, String planet){
				setName(name);
				setPlanet(planet);
			}

			public Superhero(String power, String outfit, String name, String planet){
				setName(name);
				setPlanet(planet);
				this.power = power;
				this.outfit = outfit;
			}

			public void setPower(String power){
				this.power = power;
			}// end setPower

			public String getPower(){
				return power;
			}
			public void setOutfit(String outfit){
				this.outfit = outfit;
			}

			public String getOutfit(){
				return outfit;
			}
			@Override
			public String toString(){
				return super.toString() + "with the power of " + power + " and the outfit of " + outfit;
			}
			}// end class
		class Me extends Being {
			private String like;
		public Me(){
		}
		public Me(String name, String planet){
			setName(name);
			setPlanet(planet);
		}
		public Me(String like){
			this.like = like;
		}
		public Me(String like, String name, String planet){
			setName(name);
			setPlanet(planet);
			this.like = like;
		}
		public void setLike(String like){
			this.like = like;
		}
		public String getLike(){
			return like;
		}
		}// end class
