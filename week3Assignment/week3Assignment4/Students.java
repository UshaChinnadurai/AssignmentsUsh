package week3Assignment4;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id = "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id "+id+" and Name is "+name+"");
	}
	
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("Student email is "+email+" and PhoneNumber is "+phoneNumber+"");
			}
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(44);
		stud.getStudentInfo(44, "Usha");
		stud.getStudentInfo("qwerty@leaf.com", 1234567890);
	}

}
