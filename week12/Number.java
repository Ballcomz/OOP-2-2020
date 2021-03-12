package week12;

public class Number {
	double Number;

	public Number(double d) {
		this.Number = d;
	}

	public double getNumber() {
		return Number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}

		return this.getNumber() == ((Number) obj).getNumber();
	}
}
