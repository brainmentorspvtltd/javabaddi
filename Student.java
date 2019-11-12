
public class Student {
	private int id;
	private String name;
	private String course;
	private String phone;
	private String city;
	public void takeInput(int id, String name, String course, String phone, String city) {
		if(id<=0) {
			System.out.println("Invlaid ID can't take input");
			return ;
		}
		this.id = id;
		this.name = name;
		this.course = course;
		this.city = city;
		this.phone = phone;
	}
	public void print() {
		System.out.println(this.id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(city);
		System.out.println(phone);
	}

}
