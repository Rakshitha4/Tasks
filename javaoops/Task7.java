package tasks.javaoops;

class Animal {
	void sound() {
		System.out.println("Animal sound");
	 }
}
	
class Dog extends Animal {
	 void sound() {
		 System.out.println("Dog barks");
	 }
}
	
class Cat extends Animal {
	 void sound() {
		 System.out.println("Cat meows");
	 }
}

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal a1 = new Dog();
		 Animal a2 = new Cat();
		 a1.sound(); // Dog barks
		 a2.sound(); // Cat meows

	}

}
