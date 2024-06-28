package InheritanceAssignment;

public class TestHosiptal {

	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		h.admitPatient();
		h.dischargePatient();
		h.treatPatient();
		
		System.out.println("----------");
		
		Apollo a = new Apollo();
		a.admitPatient();
		a.dischargePatient();
		a.treatPatient();
		a.performSurgery();
		
		System.out.println("----------");
		
		Fortis f = new Fortis();
		f.admitPatient();
		f.prescribeMedication();
		f.dischargePatient();

		System.out.println("----------");
		
		Max m = new Max();
		m.admitPatient();
		m.conductTest();
		m.dischargePatient();
		
		System.out.println("----------");
		
		Hospital h1 = new Apollo();
		h1.admitPatient();
		h1.dischargePatient();
		h1.treatPatient();
		
		System.out.println("----------");
	
	}

}
