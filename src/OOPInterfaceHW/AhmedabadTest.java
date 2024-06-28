package OOPInterfaceHW;

public class AhmedabadTest {

	public static void main(String[] args) {
		
		AhmedabadCollege a = new AhmedabadCollege();
		a.arts();
		a.chemicalEng();
		a.commerece();
		a.computerDegree();
		a.electricalEng();
		a.EEEEng();
		a.supportDesk();
		a.itDepartment();
		
		System.out.println("-------------------");
		
		IITDelhi i = new IITDelhi();
		i.arts();
		i.chemicalEng();
		i.commerece();
		i.electricalEng();
		i.computerDegree();
		i.homeScience();
		i.itDepartment();
		
		System.out.println("-------------------");
		
		//top casting
		
		UKEducation uk = new AhmedabadCollege();
		uk.chemicalEng();
		uk.electricalEng();
		uk.mehanicalEng();
		uk.contactUs();
		uk.supportDesk();
		uk.trainingCenter();
		
		
	}

}
