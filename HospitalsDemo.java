package code1;

public class HospitalsDemo {
	public static void main(String[] args) {
		Hospitals sn=new Hospitals();
		Hospitals sn1=new Hospitals();
		Hospitals sn2=new Hospitals(1,"Ragiv Gandhi","Sri");
		sn.setSno(1);
		sn.setHospitalName("East Coast Hospitals");
		sn.setPatientName("Balaji");
		sn1.setSno(2);
		sn1.setHospitalName("Government Primary Health Centers");
		sn1.setPatientName("Amudha");
		System.out.println(sn);
		System.out.println(sn1);
		System.out.println(sn2);
	}
}
