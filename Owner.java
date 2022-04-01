
public class Owner implements Cloneable {

	private String name; //name of the owner
	private String phone; // phone of the owner

	// Constructor, if the user don't write the owner details
	public Owner() {
		this ("no name", "no phone");
	}
	
	// constructor that checks if the user write only numbers at phone filed
	public Owner(String ownerName, String ownerPhone) {
		this.name = ownerName;
		this.phone = "";
		for (int i = 0; i < ownerPhone.length(); i++) {
			if (ownerPhone.charAt(i) >= 48 && ownerPhone.charAt(i) <= 57) {
				this.phone = this.phone + ownerPhone.charAt(i);
			}
			else {
				this.phone = null;
			}
		}
	}


	//the owner details
	public String toString() {
		return "Owners Name is " + name + ", his Phone number is " + phone;
	}

	//check if one owner is equal to another
	public boolean equals(Object other) {
		if (!(other instanceof Owner)) {
			return false;
		}
		Owner o = (Owner)other;
		return name.equals(o.name) && phone.equals(o.phone);
	}

	// duplicate the owner
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
