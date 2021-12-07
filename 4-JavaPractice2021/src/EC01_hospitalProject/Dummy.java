package EC01_hospitalProject;

public class Dummy {

	public static void main(String[] args) {
		
		Patient patient=new Patient(); // this is object. we can create one more objects like this
		
		
		patient.setName("Murat");
		patient.setName("altyyev");
		patient.setPatientId(1001);
		
		
		Case case1=new Case();
		
		case1.setActualCase("Java");
		case1.setEmergency(true);
		
		patient.setPatientCase(case1);        // object
		
		
		Doctor doctor=new Doctor();
		doctor.setName("Elanur");
		doctor.setLastname("Selcuk");
		doctor.setTitle("Petrician");
		
		Hospital hospital=new Hospital();
		hospital.setDoctor(doctor);
		hospital.setPatient(patient);
		
		
		System.out.println(hospital);
		
		
		
}

}
