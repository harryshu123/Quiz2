package car;

public class CarPayment {
	private int CarCost;
	private double Interestloan;
	private int DownPayment;
	private int Lengthloan;
	//private int StickerPrice;
	//private int Taxes;
	//private int Extras;
	//CarCost = StickerPrice + Taxes + Extras;
	
	public CarPayment(int carcost, double interestloan, int downpayment, int lengthloan) {
		this.CarCost = carcost;
		this.Interestloan = interestloan;
		this.DownPayment = downpayment;
		this.Lengthloan = lengthloan;
	}
	
	public double Monthpay() {
		double i = Interestloan/12;	
		double x = Math.pow((i+1), Lengthloan);
		double d = (x - 1);
		double y = i*x;
		double dx = d/y;
		double m = (CarCost-DownPayment)/dx;
		return m;
	}
	public double TotalInterest() {
		double i = Interestloan/12;	
		double x = Math.pow((i+1), Lengthloan);
		double d = (x - 1);
		double y = i*x;
		double dx = d/y;
		double m = (CarCost-DownPayment)/dx;
		double total = (m * Lengthloan) - (CarCost-DownPayment);
		return total;
	}
	
}
