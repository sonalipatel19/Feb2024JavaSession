package OOPInterface;

public class FortisHosiptal extends Hosiptal implements USMedical, UKMedical, IndianMedical{

	static int MIN_FEE = 50;
	
	//US
	@Override
	public void physioServices() {
		
		System.out.println("FH -- physioServices");
	}
	
	@Override
	public void physioServices(int a) {
		System.out.println("FH -- physioServices" + a);
		
	}

	@Override
	public void oncologyServices() {
		
		System.out.println("FH -- oncologyServices");
	}

	@Override
	public void dentalServices() {
		
		System.out.println("FH -- dentalServices");
	}
	
	@Override
	public void ENTServices() {
		
		System.out.println("FH -- ENTServices");
	}

	//UK
	@Override
	public void gyneoServices() {
		
		System.out.println("FH -- gyneoServices");	
	}

	@Override
	public void gastroServices() {
		
		System.out.println("FH -- gastroServices");
	}

	//India
	@Override
	public void pediaServices() {
		
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void neuroServices() {
		
		System.out.println("FH -- neuroServices");
	}

	//common method
	@Override
	public void emergencyServices() {
		
		System.out.println("FH -- emergencyServices");
	}
	
	//Individual method
	public void medicalTraining() {
			
			System.out.println("FH -- medicalTraining");
		}
	
	public void pathologyServices() {
		
		System.out.println("FH -- pathologyServices");
	}
	
	public static void billing() {
		System.out.println("FH -- billing");
	}
	
	@Override
	public void helpDesk() {
		System.out.println("FH -- helpDesk");
	}

	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");
		
	}
	
	@Override
	public void medicalRND() {
		System.out.println("FH Medical RND");
	}
	

	

	

}
