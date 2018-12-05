/*Nick Shorter 2/02/2017*
 *
 */


public class IvSLab {

	/*
	* Below variable is STATIC variable as it is outside any method and it is
	* using STATIC modifier with it.
	*/
	static int staticIntVariable;

	static String staticField;

    /*
	* Below variable is INSTANCE variable as it is outside any method and it is
	* not using STATIC modifier with it. It is using default access modifier.
	*/
    int instanceOfVariable;

    public static void main(String [] args) {

		/*
		* Below variable is LOCAL variable as it is defined inside method in
		* class. The only modifier that can be applied on local variable is FINAL.
		* 		*
		* Note: Local variable needs to initialize before they can be used.
		* Which is not true for Static or Instance variable.
		*/
		final String localVariable = "CSC 202 Lesson Learned";
		System.out.println(localVariable);

		// Step #1:  Try to print instanceOfVariable here

		//System.out.println(IvsLab.instanceOfVariable); //does not work because could not find symbol

		// Step #2:  declare a static variable here

		// static double staticDoubleVariable; only in main


		/*
		 * Below is an OBJECT variable, an object of this class,
		 * which is an instance of this class
		 */
		IvSLab obj = new IvSLab();


		/*
		* Static field can be accessed in two way.
		* 1- Via Object of the class
		* 2- Via Class name
		*/
		System.out.println("static variable being accessed by the class:  " + IvSLab.staticIntVariable);
		System.out.println("static variable being accessed by the class: (increased by 1)  " + ++IvSLab.staticIntVariable);
		System.out.println("static String variable being accessed by the class: " + IvSLab.staticField);
		System.out.println("static variable being access by creating a new class object: " + new IvSLab().staticIntVariable);

		/* Step #3:  write the Java statements to print the static variables here by accessing
		 * the variables by the object variable's identifier (the obj identifier) */
		System.out.println(obj.staticDoubleVariable);



		method();

    }// end main

    public static void method(){

    	// Step #4:  print the all the variables here
    	// if you cannot print a variable -tell me why
		System.out.println(IvsLab.instanceOfVariable);
	System.out.println(obj.staticDoubleVariable);
// not available for entire class

    }// end method

}// end IvSLab