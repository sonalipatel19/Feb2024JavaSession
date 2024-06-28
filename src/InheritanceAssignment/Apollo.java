package InheritanceAssignment;

public class Apollo extends Hospital{
	
	@Override
	public void treatPatient() {
		System.out.println("Apollo -- Treat Patient");
	}
	
	@Override
	public void dischargePatient() {
		System.out.println("Apollo -- Discharge Patient");
	}
	
	public void performSurgery() {
		System.out.println("Apollo -- perform Surgery");
	}

}
