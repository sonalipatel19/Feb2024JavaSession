package OOPInterfaceHW;

public class AhmedabadCollege extends GandhinagarInstitute implements USEducation, UKEducation, IndiaEducation{

	//IndiaEducation
	@Override
	public void arts() {
		System.out.println("AI -- Arts");
		
	}

	@Override
	public void commerece() {
		System.out.println("AI -- Commerece");
		
	}

	@Override
	public void science() {
		System.out.println("AI -- Science");
		
	}

	//UKEducation
	@Override
	public void electricalEng() {
		System.out.println("AI -- ElectricalEng");
		
	}

	@Override
	public void mehanicalEng() {
		System.out.println("AI -- MehanicalEng");
		
	}

	@Override
	public void chemicalEng() {
		System.out.println("AI -- ChemicalEng");
		
	}

	//USEducation
	@Override
	public void computerDegree() {
		System.out.println("AI -- ComputerDegree");
		
	}

	@Override
	public void pgDiploma() {
		System.out.println("AI -- PGDiploma");
		
	}

	@Override
	public void postDiploma() {
		System.out.println("AI -- PostDiploma");
		
	}
	
	//Individual methods
	
	public void civilEng() {
		System.out.println("AI -- CivilEng");
		
	}
	
	public void EEEEng() {
		System.out.println("AI -- EEEEng");
		
	}

	@Override
	public void contactUs() {
		System.out.println("AI -- ContactUs");
		
	}

	@Override
	public void supportDesk() {
		System.out.println("AI -- SupportDesk");
		
	}

	@Override
	public void trainingCenter() {
		System.out.println("AI -- TrainingCenter");
		
	}
	
//	@Override
//	public void itDepartment() {
//		System.out.println("AI -- IT Department");
//	}

}
