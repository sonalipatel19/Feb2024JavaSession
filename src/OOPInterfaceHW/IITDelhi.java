package OOPInterfaceHW;

public class IITDelhi extends GandhinagarInstitute implements USEducation, UKEducation, IndiaEducation{

	//IndiaEducation
		@Override
		public void arts() {
			System.out.println("IIT -- Arts");
			
		}

		@Override
		public void commerece() {
			System.out.println("IIT -- Commerece");
			
		}

		@Override
		public void science() {
			System.out.println("IIT -- Science");
			
		}

		//UKEducation
		@Override
		public void electricalEng() {
			System.out.println("IIT -- ElectricalEng");
			
		}

		@Override
		public void mehanicalEng() {
			System.out.println("IIT -- MehanicalEng");
			
		}

		@Override
		public void chemicalEng() {
			System.out.println("IIT -- ChemicalEng");
			
		}

		//USEducation
		@Override
		public void computerDegree() {
			System.out.println("IIT -- ComputerDegree");
			
		}

		@Override
		public void pgDiploma() {
			System.out.println("IIT -- PGDiploma");
			
		}

		@Override
		public void postDiploma() {
			System.out.println("IIT -- PostDiploma");
		
		}
		
		public void homeScience() {
			System.out.println("IIT -- HomeScience");
		
		}
		
		public void hotelManagement() {
			System.out.println("IIT -- HotelManagement");
		
		}
		
		@Override
		public void contactUs() {
			System.out.println("IIT -- ContactUs");
			
		}
		
		@Override
		public void supportDesk() {
			System.out.println("IIT -- SupportDesk");
			
		}

		@Override
		public void trainingCenter() {
			System.out.println("IIT -- TrainingCenter");
			
		}
	

}
