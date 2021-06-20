// Eric Hackett
//this class is the formula for the conversions of units

public class LenghtConverter {

	// constants that can't be changed
	private final double MILLIMETER_TO_MILLIMETER = 1.0;
	private final double CENTIMETER_TO_MILLIMETER = 10.0;
	private final double METER_TO_MILLIMETER = 1000.0;
	private final double KILOMETER_TO_MILLIMETER = 1000000.0;
	private final double INCH_TO_MILLIMETER = 25.4;
	private final double FOOT_TO_MILLIMETER = 304.8;
	private final double YARD_TO_MILLIMETER = 914.4;
	private final double MILE_TO_MILLIMETER = 1609344.0;
	private final double NAUTICALMILE_TO_MILLIMETER = 1852000.0;

	private double factor;

	// For conversion of length from a type of unit to meters and vice versa

	public LenghtConverter(String unit) {
		if (unit.equals("in")) {
			factor = INCH_TO_MILLIMETER;
		} else if (unit.equals("ft")) {
			factor = FOOT_TO_MILLIMETER;
		} else if (unit.equals("yd")) {
			factor = YARD_TO_MILLIMETER;
		} else if (unit.equals("mi")) {
			factor = MILE_TO_MILLIMETER;
		} else if (unit.equals("nmi")) {
			factor = NAUTICALMILE_TO_MILLIMETER;
		} else if (unit.equals("mm")) {
			factor = MILLIMETER_TO_MILLIMETER;
		} else if (unit.equals("cm")) {
			factor = CENTIMETER_TO_MILLIMETER;
		} else if (unit.equals("m")) {
			factor = METER_TO_MILLIMETER;
		} else if (unit.equals("km")) {
			factor = KILOMETER_TO_MILLIMETER;
		}

	}

	// Converts a unit to meters

	public double toUnit(double measurement) {

		return (measurement * factor);
	}

	// Converts from meters

	public double fromUnit(double measurement) {

		return (measurement / factor);

	}

}
