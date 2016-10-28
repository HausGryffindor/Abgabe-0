package de.unistuttgart.ilias3;

/**
 * PSE Aufgabenblatt 0
 * 
 * @author Laura Sophie Bertsch (3227725)
 * @author Marco Haas (3142635)
 * @author Andreas Seibert (3228669)
 * 
 * @version 1.2
 * 
 *          This Class provides functions to sort Numbers according their
 *          importance, compute Leap Years, solve x^2-Problems and compute your
 *          PSE Mark
 */

public class IfElseSwitch {
	public static void main(String[] args) {

	}

	/**
	 * Sortiert die Parameter nach Wertigkeit und gibt sie anschließend in
	 * abfolgenden Reihenfolge auf der Konsole aus.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @param thirdNumber
	 */

	public static void compare3Numbers(int firstNumber, int secondNumber, int thirdNumber) {
		int kleinsteZahl = 0, mittlereZahl = 0, größteZahl = 0;

		// Mark: Prüfung auf drei gleichgroße Variablen
		if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
			System.out.println("Alle übergebenen Werte sind Wertgleich");
			return;
		}
		// Mark: Fallprüfung zwei gleichgroße Variablen
		else if ((firstNumber == secondNumber) && (firstNumber < thirdNumber)) {
			System.out.println(firstNumber + " und " + secondNumber + " sind gleich groß, wobei " + thirdNumber
					+ " die größte von den Dreien ist.");
			return;
		} else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
			System.out.println(firstNumber + " und " + secondNumber + " sind gleich groß, wobei " + thirdNumber
					+ " die kleinste von den Dreien ist.");
			return;
		} else if ((secondNumber == thirdNumber) && (secondNumber < firstNumber)) {
			System.out.println(secondNumber + " und " + thirdNumber + " sind gleich groß, wobei " + firstNumber
					+ " die größte von den Dreien ist.");
			return;
		} else if ((secondNumber == thirdNumber) && (secondNumber > firstNumber)) {
			System.out.println(secondNumber + " und " + thirdNumber + " sind gleich groß, wobei " + firstNumber
					+ " die kleinste von den Dreien ist.");
			return;
		} else if ((thirdNumber == firstNumber) && (thirdNumber < secondNumber)) {
			System.out.println(thirdNumber + " und " + firstNumber + " sind gleich groß, wobei " + secondNumber
					+ " die größte von den Dreien ist.");
			return;
		} else if ((thirdNumber == firstNumber) && (thirdNumber > secondNumber)) {
			System.out.println(thirdNumber + " und " + firstNumber + " sind gleich groß, wobei " + secondNumber
					+ " die kleinste von den Dreien ist.");
			return;
		}
		// Mark :Fälle mit gleichgroßen Variablen ausgeschlossen
		else if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
			kleinsteZahl = firstNumber;
			mittlereZahl = secondNumber;
			größteZahl = thirdNumber;
		} else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
			größteZahl = firstNumber;
			mittlereZahl = secondNumber;
			kleinsteZahl = thirdNumber;
		} else if ((firstNumber < thirdNumber) && (thirdNumber < secondNumber)) {
			kleinsteZahl = firstNumber;
			mittlereZahl = thirdNumber;
			größteZahl = secondNumber;
		} else if ((secondNumber < firstNumber) && (firstNumber < thirdNumber)) {
			kleinsteZahl = secondNumber;
			mittlereZahl = firstNumber;
			größteZahl = thirdNumber;
		} else if ((secondNumber < thirdNumber) && (thirdNumber < firstNumber)) {
			kleinsteZahl = secondNumber;
			mittlereZahl = thirdNumber;
			größteZahl = firstNumber;
		} else if ((thirdNumber < firstNumber) && (firstNumber < secondNumber)) {
			kleinsteZahl = thirdNumber;
			mittlereZahl = firstNumber;
			größteZahl = secondNumber;
		}

		System.out.println("Ihre Zahlen absteigend Sortiert: \n");
		System.out.println(String.format("%d, %d, %d", größteZahl, mittlereZahl, kleinsteZahl));
		return;
	}

	/**
	 * Überprüft Jahre zwischen 1590 und 2090 auf die Eingenschaft "Schaltjahr"
	 * 
	 * @param year das zu prüfende Jahr
	 * @return boolean Schaltjahr ja/nein
	 */

	public static boolean isLeapYear(int year) {

		if ((year < 1590) && (year > 2090)) {
			return false;
		}
		if ((year % 4) == 0) {
			if (((year % 100) == 0) && ((year % 400) != 0)) {
				return false;
			}
			return true; // Erfüllt Schaltjahrbedingungen
		} else {
			return false; // Erfüllt die Bedingungen nicht
		}
	}

	/**
	 * Errechnet aus der Punktzahl die Note der PSE Prüfung
	 * 
	 * @param points erreichte Punktzahl
	 * @return mark Klaursurnote
	 */

	public static double computeGrade(int points) {
		if ((points >= 0) && (points <= 44)) {
			return 5.0;
		} else if ((points >= 45) && (points <= 47)) {
			return 4.0;
		} else if ((points >= 48) && (points <= 52)) {
			return 3.7;
		} else if ((points >= 53) && (points <= 57)) {
			return 3.3;
		} else if ((points >= 58) && (points <= 62)) {
			return 3.0;
		} else if ((points >= 63) && (points <= 67)) {
			return 2.7;
		} else if ((points >= 68) && (points <= 72)) {
			return 2.3;
		} else if ((points >= 73) && (points <= 77)) {
			return 2.0;
		} else if ((points >= 78) && (points <= 82)) {
			return 1.7;
		} else if ((points >= 83) && (points <= 87)) {
			return 1.3;
		} else if ((points >= 88) && (points <= 90)) {
			return 1.0;
		} else {
			return 0;
		}
	}

	/**
	 * Errechnet die Lösung einer quadratischen Gleichung Bezeichnungen der
	 * Parameter bezogen auf die Mitternachtsformel
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */

	public static void ComputeRealSolutions(double a, double b, double c) {

		// Überprüfen, ob die Diskriminante negativ ist, falls ja, gibt es keine
		// Lösung.

		if (Math.sqrt(b * b - 4 * a * c) < 0) {
			System.out.println("Es gibt keine reele Lösung");
		}

		// Überprüfen, ob die Diskriminante gleich 0 ist, falls ja, gibt es eine
		// Lösung, die berechnet und ausgegeben wird.
		else if (Math.sqrt((b * b - 4 * a * c)) == 0) {
			double x1 = -b / 2 * a;
			System.out.println("Es gibt genau eine reele Lösung: " + x1);
		}
		// Falls die ersten beiden Fälle nicht zutreffen, gibt es zwei Lösungen,
		// die berechnet und ausgegeben werden.
		else {
			double x2 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
			double x3 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
			System.out.println("Es gibt genau zwei reele Lösungen:}\n" + "x1: " + x2 + "\n x2: " + x3);

		}

	}
}