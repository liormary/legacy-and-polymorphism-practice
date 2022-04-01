import java.util.ArrayList;

public class MainQ1 {

	public static void main(String[] args) 
			throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		ArrayList<Animal> animalsPension = new ArrayList<Animal>(4); //array of animals
		Owner women = new Owner("Vered", "0544886777");
		Owner men = new Owner("Itzik", "0538809777");
		Animal one = new Horse("Pinkey", 2, "Black and White", men);
		animalsPension.add(one);
		Dog two = new Dog("Podel", 1, "White", women);
		animalsPension.add(two);
		Mamal three = new Horse("Rock", 6, "Brown", men);
		animalsPension.add(three);
		Dog four = (Dog)two.clone();
		four.setName("Nana");
		animalsPension.add(four);

		//for each cell in the array, print which animal inside this cell and her methods
		for (int i = 0; i < animalsPension.size(); i++) {
			System.out.println("**************************Animal number " + (i+1) + "**************************");
			System.out.println(animalsPension.get(i).toString());
			animalsPension.get(i).eat();
			animalsPension.get(i).sleep();
			if(animalsPension.get(i) instanceof Dog) {
				Dog temp1 = (Dog) animalsPension.get(i);
				temp1.makeSound();
				temp1.move();
			}
			else if(animalsPension.get(i) instanceof Horse) {
				Horse temp2 = (Horse) animalsPension.get(i);
				temp2.clean();;
				temp2.ride();;
			}
		}
		
		
		Owner lior = new Owner("Lior", "0544886788");
		Dog dog1 = new Dog("Louie", 4, "Beige", lior);
		Dog dog2 = (Dog)dog1.clone(); //duplicate the dog
		System.out.println("**************************BEFORE I'VE CHANGED THE OWNER**************************");
		System.out.println("Dog 1:\n" + dog1.toString() + "\n\nDog 2:\n" + dog2.toString());
		Owner yaron = new Owner("Yaron", "0528890555");
		dog2.setOwner(yaron); //change the copy of the dog owner
		System.out.println("\n**************************AFTER I'VE CHANGED THE OWNER**************************");
		System.out.println("Dog 1:\n" + dog1.toString() + "\n\nDog 2:\n" + dog2.toString());
	}

}
