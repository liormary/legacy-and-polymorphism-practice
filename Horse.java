
public class Horse extends Mamal implements Cloneable {
	
	private Owner owner;

	// three argument constructor initializes horse's name, age and color 
	public Horse(String hourseName, int hourseAge, String hourseColor, Owner o) {
		super(hourseName, hourseAge, hourseColor);
		this.owner = o;
	}

	//gets the horse name
	public String getName() {
		return super.getName();
	}
	
	//sets the horse name
	public void setName(String hourseName) {
		super.setName(hourseName);
	}
	
	//gets the horse age
	public int getAge() {
		return super.getAge();
	}
	
	//sets the horse age
	public void setAge(int hourseAge) {
		super.setAge(hourseAge);
	}
	
	//gets the horse color
	public String getColor() {
		return super.getColor();
	}
	
	//sets the horse color
	public void setColor(String hourseColor) {
		super.setColor(hourseColor);
	}
	
	//gets the horse owner name
	public Owner getOwner() {
		return this.owner;
	}
	
	//sets the horse owner
	public void setOwner(Owner o) {
		this.owner = o;
	}
	
	//the horse details
	public String toString() {
		return super.toString() + "\nOwner- " + owner.toString();
	}
	
	//what the horse eats
	public void eat() {
		System.out.println("Horse food");
	}
	
	//where the horse sleeps
	public void sleep() {
		System.out.println("Farm");
	}
	
	//clean the horse
	public void clean() {
		System.out.println("I'm taking a shower");
	}
	
	//ride on the horse
	public void ride() {
		System.out.println("Run");
	}
	
	//checks if one horse equal to another
	public boolean equals(Object other) {
		if (!(other instanceof Horse)) {
			return false;
		}
		Horse d = (Horse)other;
		return super.equals(d) && owner.equals(d.owner);
	}
	
	//duplicate the horse
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Horse d = (Horse)super.clone(); 
		d.setOwner((Owner)d.getOwner().clone());
		return (Object)d;
	}

}
