package ie.gmit;

public class Employee {
	private String title;
	private String name;
	private String pps;
	private String phone;
	private String empType;
	private int age;

	public Employee(String title, String name, String pps, String phone, String empType, int age) {
		setTitle(title);
		setName(name);
		setPps(pps);
		setPhone(phone);
		setEmpType(empType);
		setAge(age);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title.equals("Mr") || title.equals("Mrs") || title.equals("Miss") )
		{
			this.title = title;
		}
		else
		{
			throw new IllegalArgumentException("Invalid Title Error - Please choose Mr, Mrs or Miss");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() >= 5 &&  name.length() <= 22)
		{
			this.name = name;
		}
		else
		{
			throw new IllegalArgumentException("Invalid Name Error - Name must have more than 5 letters and a maximum of 22");
		}
	}

	public String getPps() {
		return pps;
	}

	public void setPps(String pps) {
		if(pps.length() == 6)
		{
			this.pps = pps;
		}
		else
		{
			throw new IllegalArgumentException("Invalid Pps Number Error - Pps must be 6 digits");
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if(phone.length() == 7 )
		{
			this.phone = phone;
		}
		else
		{
			throw new IllegalArgumentException("Invalid Phone Number Error - Phone must be 7 digits");
		}
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		if(empType.equals("Full-time") || empType.equals("Part-time"))
		{
			this.empType = empType;
		}
		else
		{
			throw new IllegalArgumentException("Invalid Employment Type Error - Enter Full-time or Part-time");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 18)
		{
			this.age = age;
		}
		else
		{
			throw new IllegalArgumentException("Invalid Age Error - Must be over 18");
		}
	}
}
