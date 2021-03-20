package Algorithm;
import java.time.*;

public class Time {

	public static void main(String[] args) {
		LocalTime time= LocalTime.now();
		System.out.println(time);
		System.out.println(time.plusHours(20).plusMinutes(24).plusSeconds(30));

	}

}
