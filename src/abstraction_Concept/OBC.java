package abstraction_Concept;

public class OBC extends Bank {

	public static void main(String[] args) {
		Bank b;

		b = new OBC();
		int ROI = b.getRateOFInterest();
		System.out.println("ROI OBC: " + ROI + "%");
		b = new PNB();
		int ROI1 = b.getRateOFInterest();
		System.out.println("ROI PNB: " + ROI1 + "%");
		b = new SBI();
		int ROI2 = b.getRateOFInterest();
		System.out.println("ROI SBI: " + ROI2 + "%");

	}

	int getRateOFInterest() {

		return 4;
	}

}
