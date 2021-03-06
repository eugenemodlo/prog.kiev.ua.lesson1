package prog.kiev.ua.lesson1;

public class Main {

	public static void main(String[] args) {

		System.out.println("1st Case");

		Cat catOne = new Cat("Fifo", "Abyssinian", 2);
		System.out.println(catOne);
		catOne.getVoice();

		Cat catTwo = new Cat("Fofi", "Bengal", 4);
		System.out.println(catTwo);
		catTwo.getVoice();

		System.out.println("2nd Case");

		Triangle triangleOne = new Triangle(10, 20, 20);
		System.out.println(triangleOne.getSquare());

		System.out.println("3rd Case");

		Vector3d vectorA = new Vector3d(2, 3, 4);
		Vector3d vectorB = new Vector3d(-2, 8, 4);

		System.out.println("4th Case");

		System.out.println(vectorA.getVectorMultiply(vectorB));
		System.out.println(vectorA.getScalarMultiply(vectorB));
		System.out.println(vectorA.getSum(vectorB));

		System.out.println("5th Case");

		Phone phoneOne = new Phone("+380671111111");
		Phone phoneTwo = new Phone("+380672222222");
		Phone phoneThree = new Phone("+380673333333");

		Network network = new Network("StarLink", 5);

		phoneOne.registerToNet(network);
		phoneTwo.registerToNet(network);
		phoneThree.registerToNet(network);

		phoneOne.call("+380672222222");
		phoneThree.call("+380674444444");
	}

}
