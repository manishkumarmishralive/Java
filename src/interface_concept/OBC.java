package interface_concept;

public class OBC implements Bank {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println("ROI :" + sbi.rateOfInterest() + "%");
		sbi.loan();
	}

	public float rateOfInterest() {

		return 3.4f;
	}

}
