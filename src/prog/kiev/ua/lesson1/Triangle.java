package prog.kiev.ua.lesson1;

public class Triangle {
	private double sideOneLength;
	private double sideTwoLength;
	private double sideThreeLength;
	public Triangle(double sideOneLength, double sideTwoLength, double sideThreeLength) {
		super();
		this.sideOneLength = sideOneLength;
		this.sideTwoLength = sideTwoLength;
		this.sideThreeLength = sideThreeLength;
	}
	public Triangle() {
		super();
	}
	public double getSideOneLength() {
		return sideOneLength;
	}
	public void setSideOneLength(double sideOneLength) {
		this.sideOneLength = sideOneLength;
	}
	public double getSideTwoLength() {
		return sideTwoLength;
	}
	public void setSideTwoLength(double sideTwoLength) {
		this.sideTwoLength = sideTwoLength;
	}
	public double getSideThreeLength() {
		return sideThreeLength;
	}
	public void setSideTreeLength(double sideThreeLength) {
		this.sideThreeLength = sideThreeLength;
	}
	
	public double getSquare() {
		double halfPerimeter = (this.sideOneLength + this.sideTwoLength + this.sideThreeLength) / 2;
		return Math.sqrt(halfPerimeter
				* (halfPerimeter - this.sideOneLength)
				* (halfPerimeter - this.sideTwoLength)
				* (halfPerimeter - this.sideThreeLength)
				);
	}

}
