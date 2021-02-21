package prog.kiev.ua.lesson1;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat("Fifo", "Abyssinian", 2);
		System.out.println(catOne);
		catOne.getVoice();

		Cat catTwo = new Cat("Fofi", "Bengal", 4);
		System.out.println(catTwo);
		catTwo.getVoice();
		
		Triangle triangleOne = new Triangle(10, 20, 20);
		System.out.println(triangleOne.getSquare());
		
		
	}

}
