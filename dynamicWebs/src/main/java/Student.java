
public class Student {
	private String Regnum;
	private String fullname;
	private int age;
	private String gender;
	

	public Student(String regnum, String fullname, int age, String gender) {
		super();
		Regnum = regnum;
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
	}


	public String getRegnum() {
		return Regnum;
	}


	public void setRegnum(String regnum) {
		Regnum = regnum;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}




}
