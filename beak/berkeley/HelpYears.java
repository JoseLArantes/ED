package com.beak.berkeley;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelpYears {

	public static boolean isLeapYear(int year) throws NumberFormatException {
		if (year % 4 != 0) {
			return false;
		} else {
			if (year % 100 != 0) {
				return true;
			} else {
				if (year % 400 != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static int daysInMonth(int month, int year) {
		int fev;
		if (isLeapYear(year) == true) {
			fev = 29;
		} else {
			fev = 28;
		}
		switch (month) {
		case 2:
			return fev;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	public static boolean isValidDate(int month, int day, int year) {
		if ((year < 1) || (month > 12) || (month < 1) || (day < 1)
				|| (day > 31)) {
			return false;
		}
		if ((month == 2) && (day == 29)) {
			if (isLeapYear(year) == true) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException,
			NumberFormatException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Digite a data (formato MM/DD/AAAA): ");
		String data = keyboard.readLine();
		String mes = "", dia = "", ano = "";
		try {
			if (data.length() == 10) {
				mes = data.substring(0, 2);
				dia = data.substring(3, 5);
				ano = data.substring(6, 10);
				if (isValidDate(Integer.parseInt(mes), Integer.parseInt(dia),
						Integer.parseInt(ano)) == true) {
					System.out.println(Integer.parseInt(mes) + "/"
							+ Integer.parseInt(dia) + "/"
							+ Integer.parseInt(ano));
				} else {
					System.out.println("Data inválida!!");
				}
			} else {
				System.out.println("Valores inválidos!");
				;
			}

		} catch (NumberFormatException e) {
			System.out.println("Valores inválidos!");
			;
		}

	}

}
