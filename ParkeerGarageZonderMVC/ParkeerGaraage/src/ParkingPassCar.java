import java.util.Random;
import java.awt.*;

//Deze klasse geeft aan wanneer een auto niet meer geparkeerd staat op een locatie
public class ParkingPassCar extends Car {
	private static final Color COLOR = Color.blue;

	// Auto gaat van de locatie af na een random tijd
	public ParkingPassCar() {
		Random random = new Random();
		int stayMinutes = (int) (15 + random.nextFloat() * 3 * 60);
		this.setMinutesLeft(stayMinutes);
		this.setHasToPay(false);
	}

	// De kleur wanneer een auto is geparkeerd op een locatie
	public Color getColor() {
		return COLOR;
	}
}
