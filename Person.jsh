person.printDetails();
System.out.println(person.isAdult());
person.haveBirthday();
System.out.println(person.isAdult());
            class Person {    
	String name;
      int age;
	String handy;
        
       Person(String n, int x, String y){
          name = n;
            age = x;
	   handy = y;
        }
        
        void sayHello(){
           System.out.println("Hello, my name is  " + name);
       }
        
        void haveBirthday(){
            age = age + 1;
           System.out.println("Happy Birthday! " + name + " is now " + age);
        }
	void printDetails(){
	   System.out.println("Name: " + name);
	   System.out.println("Age: " + age);
	}
	void handedness(){
	   if (handy.equals("left")){
	 System.out.println("Left Handed");
	} else if (handy.equals("right")){
	 System.out.println("Right Handed");
	} else {
	 System.out.println("Ambidextrous");
	}
}
	
   	boolean isAdult(){
        return age >= 18;
	}
    }
Person person = new Person("John", 17, "left");
person.printDetails();
person.age;
person.handy;
person.handedness();