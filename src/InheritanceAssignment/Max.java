package InheritanceAssignment;

public class Max extends Hospital{
	
	@Override
	public void treatPatient() {
		System.out.println("Max -- Treat Patient");
	}
	
	@Override
	public void dischargePatient() {
		System.out.println("Max -- Discharge Patient");
	}
	
	public void conductTest() {
		System.out.println("Max -- conduct Test");
	}

}
