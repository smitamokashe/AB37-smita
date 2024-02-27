package interfacePkg;

	interface State_tax{
		void state_ittax();
		void state_gsttax();
	}
	
	interface Country_tax{
		void country_ittax();
		void country_gsttax();
	}
	public class InterfaceAssignment implements Country_tax, State_tax {
		
	public static void main(String[] args) {
		InterfaceAssignment ia = new InterfaceAssignment();
		ia.state_ittax();
		ia.state_gsttax();
		ia.country_ittax();
		ia.country_gsttax();
	}
	public void state_ittax() {
		System.out.println("State IT Tax method");
	}
	public void state_gsttax() {	
		System.out.println("State GST Tax method");
	}
	public void country_ittax() {
		System.out.println("Country ITTax method");
	}
	public void country_gsttax() {
		System.out.println("Country GST Tax method");
	}

}