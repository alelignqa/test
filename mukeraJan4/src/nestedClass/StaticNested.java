package nestedClass;


public class StaticNested {

	// this should be the most outer class of the nested class
		// let us introduce variables in this first layer of the class
		int outerNum;
		int outerNum1 = 4;
		static String outerName = "Sew mehon";
		static String outerName1;
		
		public  void outerMethod() {
			System.out.println("This is the first layer of this nessted class");
			
			System.out.println(outerName);
			System.out.println(outerName1="New Sew ");
			innerOne obj = new innerOne();
//			obj.innerOneMethod();
		}
		
		
			public static class innerOne{
				// in the nested class if we want introduced  a static method variable we have to change the class into static 
				int innerOneNum;
				int innerOneNum1 = 5;
			//	static String innerOneName = "Kale";// won't work because the class is not a static class 
				String innerOneName = "Kale";// now java won't complain 
				
				public static void innerOneMethod() {
					System.out.println("This is the out put of our innerOne class");
					System.out.println(outerName);// still I can access the outer class static variable directly 
					
					System.out.println("Here I am trying to access the outer layer methode");
					TheOuterClass obj = new TheOuterClass();// object of the outer layer class
					obj.outerMethod();
					
					}
		//		public static class innerTwo{ // this means I can't add a main method inside if any one of the class none static
		//The member type innerTwo cannot be declared static; static types can only be declared in static or top level types
				public static class innerTwo{ 	
					int innerTwoNum;
					String innerTwoName;
					
					public static void innerTwoMethod() {
						System.out.println("This is from the innerTwo class method ");
						
						innerOne obj = new innerOne();
						obj.innerOneMethod();
						System.out.println(TheOuterClass.outerName);
						
					}
					
					
				}
			

			
			}
}
