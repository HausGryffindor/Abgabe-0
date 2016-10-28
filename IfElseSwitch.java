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
	 * Sortiert die Parameter nach Wertigkeit und gibt sie anschlie�end in
	 * abfolgenden Reihenfolge auf der Konsole aus.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @param thirdNumber
	 */

	public static void compare3Numbers(int firstNumber, int secondNumber, int thirdNumber) {
		int kleinsteZahl = 0, mittlereZahl = 0, gr��teZahl = 0;

		// Mark: Pr�fung auf drei gleichgro�e Variablen
		if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
			System.out.println("Alle �bergebenen Werte sind Wertgleich");
			return;
		}
		// Mark: Fallpr�fung zwei gleichgro�e Variablen
		else if ((firstNumber == secondNumber) && (firstNumber < thirdNumber)) {
			System.out.println(firstNumber + " und " + secondNumber + " sind gleich gro�, wobei " + thirdNumber
					+ " die gr��te von den Dreien ist.");
			return;
		} else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
			System.out.println(firstNumber + " und " + secondNumber + " sind gleich gro�, wobei " + thirdNumber
					+ " die kleinste von den Dreien ist.");
			return;
		} else if ((secondNumber == thirdNumber) && (secondNumber < firstNumber)) {
			System.out.println(secondNumber + " und " + thirdNumber + " sind gleich gro�, wobei " + firstNumber
					+ " die gr��te von den Dreien ist.");
			return;
		} else if ((secondNumber == thirdNumber) && (secondNumber > firstNumber)) {
			System.out.println(secondNumber + " und " + thirdNumber + " sind gleich gro�, wobei " + firstNumber
					+ " die kleinste von den Dreien ist.");
			return;
		} else if ((thirdNumber == firstNumber) && (thirdNumber < secondNumber)) {
			System.out.println(thirdNumber + " und " + firstNumber + " sind gleich gro�, wobei " + secondNumber
					+ " die gr��te von den Dreien ist.");
			return;
		} else if ((thirdNumber == firstNumber) && (thirdNumber > secondNumber)) {
			System.out.println(thirdNumber + " und " + firstNumber + " sind gleich gro�, wobei " + secondNumber
					+ " die kleinste von den Dreien ist.");
			return;
		}
		// Mark :F�lle mit gleichgro�en Variablen ausgeschlossen
		else if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
			kleinsteZahl = firstNumber;
			mittlereZahl = secondNumber;
			gr��teZahl = thirdNumber;
		} else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
			gr��teZahl = firstNumber;
			mittlereZahl = secondNumber;
			kleinsteZahl = thirdNumber;
		} else if ((firstNumber < thirdNumber) && (thirdNumber < secondNumber)) {
			kleinsteZahl = firstNumber;
			mittlereZahl = thirdNumber;
			gr��teZahl = secondNumber;
		} else if ((secondNumber < firstNumber) && (firstNumber < thirdNumber)) {
			kleinsteZahl = secondNumber;
			mittlereZahl = firstNumber;
			gr��teZahl = thirdNumber;
		} else if ((secondNumber < thirdNumber) && (thirdNumber < firstNumber)) {
			kleinsteZahl = secondNumber;
			mittlereZahl = thirdNumber;
			gr��teZahl = firstNumber;
		} else if ((thirdNumber < firstNumber) && (firstNumber < secondNumber)) {
			kleinsteZahl = thirdNumber;
			mittlereZahl = firstNumber;
			gr��teZahl = secondNumber;
		}

		System.out.println("Ihre Zahlen absteigend Sortiert: \n");
		System.out.println(String.format("%d, %d, %d", gr��teZahl, mittlereZahl, kleinsteZahl));
		return;
	}

	/**
	 * �berpr�ft Jahre zwischen 1590 und 2090 auf die Eingenschaft "Schaltjahr"
	 * 
	 * @param year das zu pr�fende Jahr
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
			return true; // Erf�llt Schaltjahrbedingungen
		} else {
			return false; // Erf�llt die Bedingungen nicht
		}
	}

	/**
	 * Errechnet aus der Punktzahl die Note der PSE Pr�fung
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
	 * Errechnet die L�sung einer quadratischen Gleichung Bezeichnungen der
	 * Parameter bezogen auf die Mitternachtsformel
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */

	public static void ComputeRealSolutions(double a, double b, double c) {

		// �berpr�fen, ob die Diskriminante negativ ist, falls ja, gibt es keine
		// L�sung.

		if (Math.sqrt(b * b - 4 * a * c) < 0) {
			System.out.println("Es gibt keine reele L�sung");
		}

		// �berpr�fen, ob die Diskriminante gleich 0 ist, falls ja, gibt es eine
		// L�sung, die berechnet und ausgegeben wird.
		else if (Math.sqrt((b * b - 4 * a * c)) == 0) {
			double x1 = -b / 2 * a;
			System.out.println("Es gibt genau eine reele L�sung: " + x1);
		}
		// Falls die ersten beiden F�lle nicht zutreffen, gibt es zwei L�sungen,
		// die berechnet und ausgegeben werden.
		else {
			double x2 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
			double x3 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
			System.out.println("Es gibt genau zwei reele L�sungen:}\n" + "x1: " + x2 + "\n x2: " + x3);

		}

	}
}