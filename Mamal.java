
public abstract class Mamal extends Animal {

	// three argument constructor initializes mamal's name, age and color 
	public Mamal(String mamalName, int mamalAge, String mamalColor) {
		super(mamalName, mamalAge, mamalColor);
	}
	
	// gets the mamal name
	public String getName() {
		return super.getName();
	}
	
	//sets the mamal name
	public void setName(String mamalName) {
		super.setName(mamalName);
	}
	
	//gets the mamal age
	public int getAge() {
		return super.getAge();
	}
	
	//sets the mamal age
	public void setAge(int mamalAge) {
		super.setAge(mamalAge);
	}
	
	//gets the mamal color
	public String getColor() {
		return super.getColor();
	}
	
	//sets the mamal color
	public void setColor(String mamalColor) {
		super.setColor(mamalColor);;
	}
	
	//the mamal details
	public String toString() {
		return super.toString();
	}
	
	//check if one mamal equal to another 
	public boolean equals(Object other) {
		if (!(other instanceof Mamal)) {
			return false;
		}
		Mamal m = (Mamal)other;
		return super.equals(m);
	}
}
