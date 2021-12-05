package EC01_hospitalProject;

public class Doctor {

	private String name;
	private String lastname;
	private String title;     // cardiology > heart
	
	


	public String getName() {              //metod
		return name;
	}
	
	
	public void setName(String name) {    // we can use in another class      

		this.name = name;              // class object
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", lastname=" + lastname + ", title=" + title + "]";
		// System.out.println();
	}

	
	
	

}
