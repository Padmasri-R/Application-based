//program to demonstrate private data members,constructors and getter and setter methods
package person;

public class Person {
	private String personName;
	private int personAge;
	private String cityName;
	public String getpersonName() {
		return personName;
	}
	public void setpersonName(String personName) {
		this.personName=personName;
	}
	public int  getpersonAge() {
		return personAge;
	}
	public void setpersonAge(int personAge) {
		this.personAge=personAge;
	}
	public String getcityName() {
		return cityName;
	}
	public void setcityName(String setcityName) {
		this.cityName=cityName;
	}
	public Person() {
		System.out.println("default constructor");
	}
	public Person(String personName,int personAge,String personCity) {
		System.out.println("parameterized constructor");

	this.personName=personName;
	this.personAge=personAge;
	this.cityName=cityName;
	}
}
