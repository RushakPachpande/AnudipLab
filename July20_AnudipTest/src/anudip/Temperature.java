//  Rushak : You are developing a temp recording system. The program
//  should:
//  Initialize an array with the temperatures recorded over a week (7 days).
//  Calculate and print the average temp for the week. Find and print the
//  highest and lowest temperatures recorded.

package anudip;

public class Temperature {
	double[] temperatures = { 37.5, 35.9, 27.4, 41.2, 33.1, 40.8, 39.2 };

	public void average() {
		double avg = 0;
		for (int i = 0; i < temperatures.length; i++) {
			avg = avg + temperatures[i];
		}
		System.out.println("Average Temperature : " + (avg / 7));
	}

	public void maxTemp() {
		double max = temperatures[0];
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] > max) {
				max = temperatures[i];
			}
		}
		System.out.println("Highest temp: " + max);
	}

	public void lowTemp() {
		double low = temperatures[0];
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] < low) {
				low = temperatures[i];
			}
		}
		System.out.println("Lowest temp: " + low);
	}

	public static void main(String[] args) {
		Temperature temp = new Temperature();
		temp.average();
		temp.maxTemp();
		temp.lowTemp();
	}
}
