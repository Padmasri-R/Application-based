package code1;

public class Hospitals {
	private int sno;
	private String hospitalName;
	private String patientName;
	public Hospitals()
	{
		System.out.println("Welcome to the Hospital");
	}
		public Hospitals(int sno,String hospitalName,String patientName)

	{
		this();
		this.sno=sno;
		this.hospitalName=hospitalName;
		this.patientName=patientName;
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	@Override
	public String toString() {
		return "Hospitals [sno=" + sno + ", hospitalName=" + hospitalName + ", patientName=" + patientName + "]";
	}
}


