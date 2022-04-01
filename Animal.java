
public abstract class Animal implements Cloneable {

	protected String name;
	protected int age;
	protected String color;

	// three argument constructor initializes animal's name, age and color 
	public Animal(String animalName, int animalAge, String animalColor) {
		this.name = animalName; // initialize name of animal 
		if (animalAge >=0) {
			this.age = animalAge; // initialize age of animal 
		}
		else {
			this.age = 0;
		}
		this.color = animalColor; // initialize color of animal 
	}
	
	// gets the animal name
	public String getName() {
		return this.name;
	}

	//sets the animal name
	public void setName(String animalName) {
		this.name = animalName;
	}
	
	//gets the animal age
	public int getAge() {
		return this.age;
	}

	//sets the animal age
	public void setAge(int animalAge) {
		if (animalAge >=0) {
			this.age = animalAge; // initialize age of animal 
		}
		else {
			this.age = 0;
		}
	}
	
	//gets the animal color
	public String getColor() {
		return this.color;
	}

	//sets the animal color
	public void setColor(String animalColor) {
		this.color = animalColor;
	}

	//the animal details
	public String toString() {
		return "Name- " + name + "\nAge- " + age + "\nColor- " + color;
	}

	//check if one animal equal to another
	public boolean equals(Object other) {
		if (!(other instanceof Animal)) {
			return false;
		}
		Animal a = (Animal)other;
		return name.equals(a.name) && age == a.age && color.equals(a.color) ;
	}
	
	public abstract void eat();
	public abstract void sleep();

	//duplicate the animal
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

