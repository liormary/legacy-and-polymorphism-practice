
public class Dog extends Mamal implements Cloneable {
	
	private Owner owner; //the dog owner
	
	// three argument constructor initializes dog's name, age and color 
	public Dog(String dogName, int dogAge, String dogColor, Owner o) {
		super(dogName, dogAge, dogColor);
		this.owner = o;
	}

	//gets the dog name
	public String getName() {
		return super.getName();
	}
	
	//sets the dog name
	public void setName(String dogName) {
		super.setName(dogName);
	}
	
	//gets the dog age
	public int getAge() {
		return super.getAge();
	}
	
	//sets the dog age
	public void setAge(int dogAge) {
		super.setAge(dogAge);
	}
	
	//gets the dog color
	public String getColor() {
		return super.getColor();
	}
	
	//sets the dog color
	public void setColor(String dogColor) {
		super.setColor(dogColor);
	}
	
	//gets the dog owner
	public Owner getOwner() {
		return this.owner;
	}
	
	//sets the dog owner
	public void setOwner(Owner o) {
		this.owner = o;
	}
	
	//the dog details
	public String toString() {
		return super.toString() + "\nOwner- " + owner.toString();
	}
	
	//what dog eats
	public void eat() {
		System.out.println("Dogs food");
	}
	
	//where the dog sleeps
	public void sleep() {
		System.out.println("Bed");
	}
	
	//what sound the dog makes
	public void makeSound() {
		System.out.println("Woof");
	}
	//how the dog moves
	public void move() {
		System.out.println("Walk");
	}
	
	//checks if one dog equal to another
	public boolean equals(Object other) {
		if (!(other instanceof Dog)) {
			return false;
		}
		Dog d = (Dog)other;
		return super.equals(d) && owner.equals(d.owner);
	}
	
	//duplicate the dog
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Dog d = (Dog)super.clone(); 
		d.setOwner((Owner)d.getOwner().clone());
		return (Object)d;
	}

}
