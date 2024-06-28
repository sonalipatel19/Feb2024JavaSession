package InheritanceAssignment;

public class Fortis extends Hospital{

	@Override
	public void treatPatient() {
		System.out.println("Fortis -- Treat Patient");
	}
	
	@Override
	public void dischargePatient() {
		System.out.println("Fortis -- Discharge Patient");
	}
	
	public void prescribeMedication() {
		System.out.println("Fortis -- prescribe Medication");
	}
}
