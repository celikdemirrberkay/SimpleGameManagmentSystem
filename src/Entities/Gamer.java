package Entities;

public class Gamer {

	private int idNumber;
	private int age;
	private String firstName;
	private	String lastName;
	private	String nickName;
	private String sex;
	
	public Gamer(){
		
	}
	
	public Gamer(int idNumber, int age, String firstName, String lastName, String nickName, String sex) {
		
		this.idNumber = idNumber;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.sex=sex;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
	
	
	
	
}
