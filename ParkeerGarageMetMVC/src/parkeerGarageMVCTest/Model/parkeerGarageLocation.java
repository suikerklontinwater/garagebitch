package parkeerGarageMVCTest.Model;

public class parkeerGarageLocation {
	// Geeft de verieping aan van de locatie
	private int floor;
	// Geeft de rij aan van de locatie
	private int row;
	// Geeft de plek aan van de locatie in de rij
	private int place;

	/**
	 * Constructor for objects of class Location
	 */
	public parkeerGarageLocation(int floor, int row, int place) {
		this.floor = floor;
		this.row = row;
		this.place = place;
	}

	/**
	 * Implement content equality.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof parkeerGarageLocation) {
			parkeerGarageLocation other = (parkeerGarageLocation) obj;
			return floor == other.getFloor() && row == other.getRow() && place == other.getPlace();
		} else {
			return false;
		}
	}

	/**
	 * Retourneert een string van de verdieping, rij en plaats
	 * 
	 * @return Een string van de locatie
	 */
	public String toString() {
		return floor + "," + row + "," + place;
	}

	/**
	 * Use the 10 bits for each of the floor, row and place values. Except for very
	 * big car parks, this should give a unique hash code for each (floor, row,
	 * place) tupel.
	 * 
	 * @return A hashcode for the location.
	 */
	public int hashCode() {
		return (floor << 20) + (row << 10) + place;
	}

	/**
	 * @return The floor.
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @return The row.
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return The place.
	 */
	public int getPlace() {
		return place;
	}

}