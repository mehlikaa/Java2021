package EC01_hospitalProject;

public class HospitalRunner {
	
	static Hospital hospital=new Hospital();

	public static void main(String[] args) {
		

		String currentCase= "tumor";
			
			// when you find the case, then you can find doctor title
			// if you find doctor title, then you can find the doctor information 
		
		String title=doctorTitle(currentCase);
		
		System.out.println(title);
		
			//data type here for findDoctor is Doctor
		
		System.out.println(findDoctor(title));  // this returns patient
		
		System.out.println(findPatient(currentCase)); // this returns patient
		
		hospital.setDoctor(findDoctor(title));
		hospital.setPatient(findPatient(currentCase));
		
		System.out.println(hospital);
	}
	
	
	// we just return doctor title
	public static String doctorTitle(String actualCase) {
		
		
		String title = "";
		switch(actualCase) {
		
		case "headache":
			title= "Generalist";
			break;
			
		case "allergy":
			title= "Pediatristt";
			break;
			
		case "vision":
			title= "Ophthalmologist";
			break;
			
		case "muscle":
			title= "Neurologist";
			break;
			
		case "heart diseases":
			title= "Internest";
			break;
			
		case "tumor":
			title= "Dermatologist";
			break;
			
		case "stomacache":      //sonradan ekledik digerlerini etkilemez
			title= "Internist";
			break;
		
		default :
			System.out.println("-- No matching title! --");
			break;
		}
		
		return title;
	}
	
	
	public static Doctor findDoctor(String title) { 
		
		Doctor doctor=new Doctor();   		 //empty / null
		
							//6 times
		for(int i=0; i<hospital.titles.length; i++ ) {
			
							// 5
			if(title.equalsIgnoreCase(hospital.titles[i])) { 
				
				doctor.setName(hospital.doctorNames[i]);      // mahesh
				doctor.setLastname(hospital.doctorLastNames[i]);  // tristen
				doctor.setTitle(title);						//generalist
			}
		}
		return doctor;
	}
	
	

	public static Case findCase(String actualCase) { 
		
		Case case1=new Case();
		
		switch(actualCase) {
		
		case "headache":
			
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
			
		case "allergy":
			
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
		case "vision":
			
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
			
		case "muscle":
			
			case1.setActualCase(actualCase);              //getActualCase(actualCase);
			case1.setEmergency(false);
			break;
			
		case "heart disease":
			
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
		case "tumor":
			
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
		case "stomachache":
			
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
			
		case "":
			
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
			default:
				System.out.println("yanlis No matching");
				
		
		}
		
		return case1;
	}
// ======	
	public static Patient findPatient(String actualCase) { 
		
		Patient patient=new Patient();
		Case case1=new Case();
		case1.setActualCase(actualCase);
		case1.setEmergency(false);
		
		for (int i=0; i<hospital.cases.length; i++ )
			
			if (actualCase.equalsIgnoreCase(hospital.cases[i])) {
				patient.setName(hospital.patientNames[i]);
				patient.setLastname(hospital.patientLastNames[i]);
				patient.setPatientId(hospital.patientIds[i]);
				patient.setPatientCase(findCase(actualCase));          //(case1));
			}
		return patient;
	}
	//====
}

