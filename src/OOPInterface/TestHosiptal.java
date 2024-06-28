package OOPInterface;

public class TestHosiptal {

	public static void main(String[] args) {
		
		FortisHosiptal f = new FortisHosiptal();
		
		f.physioServices();
		f.physioServices(10);
		f.dentalServices();
		f.gastroServices();
		f.gyneoServices();
		f.neuroServices();
		f.oncologyServices();
		
		f.emergencyServices();

		f.medicalTraining();
		f.pathologyServices();
		
		System.out.println(USMedical.MIN_FEE);
		System.out.println(FortisHosiptal.MIN_FEE);
		
		USMedical.billing();
		FortisHosiptal.billing();
		f.helpDesk();
		f.covidVaccination();
		
		f.medicalNews();
		f.medicalRND();
		
		//top casting: 
		// child class object can be refered by parent interface ref variables
		
		USMedical us = new FortisHosiptal();
		us.physioServices();
		us.oncologyServices();
		us.dentalServices();
		us.emergencyServices();
		
		 UKMedical uk =(UKMedical)us; // used in Selenium to cast interface to interface like JavaScriptExecutor
		 uk.gastroServices();
	}

}
