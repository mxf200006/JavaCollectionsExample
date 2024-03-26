package main;

public class Person {

	
	private long id;
	private String name;
	private Gender gender;
	private String departement;
	private double salary;
	private long phone;
	private String email;

	public Person(long id, String name, String email, Gender gender, String departement, long phone, double salary) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.departement = departement;
		this.salary = salary;
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Person [" + id + ", " + name + ", " + gender + ", " + departement
				+ ", " + salary + ", " + phone + ", " + email + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
