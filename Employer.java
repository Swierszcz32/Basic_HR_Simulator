package pl.java.company;

public class Employer {
	//emp
	public String name;
	public String surname;
	public int age;
	
	public Employer (String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employer [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	

}
