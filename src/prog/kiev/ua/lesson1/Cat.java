package prog.kiev.ua.lesson1;

public class Cat {
	private final String VOICE = "Meow!";

	private String name;
	private String breed;
	private int age;

	public Cat(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getVoice() {
		System.out.println(VOICE);
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
}
