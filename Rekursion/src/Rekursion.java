
public class Rekursion {
	
	static long start;
	static long end;
	static long time;
	
	static int summe = 30;
	static int fakultaet = 40;
	static int powFak = 50;
	
	public static void main(String[] args) {
		
		start = System.nanoTime();
		long sumRek = rekSumme(summe);
		end = System.nanoTime();
		time = (end-start) / 1000;
		System.out.println("Mittels Rekursion berechnete Summe: " + sumRek);
		System.out.println("      -Berechnet in: " + time + " Millisekunden"); 
		System.out.println();

		start = System.nanoTime();
		long sumEnd = endSumme(0, summe);
		end = System.nanoTime();
		time = (end-start) / 1000;
		System.out.println("Mittels Endrekursion berechnete Summe: " + sumEnd);
		System.out.println("      -Berechnet in: " + time + " Millisekunden"); 
		System.out.println();
		
		start = System.nanoTime();
		long fakRek = rekFakultaet(fakultaet);
		end = System.nanoTime();
		time = (end-start) / 1000;
		System.out.println("Mittels Rekursion berechnete Fakultaet: " + fakRek);
		System.out.println("      -Berechnet in: " + time + " Millisekunden"); 
		System.out.println();
		
		start = System.nanoTime();
		long fakEnd = endFakultaet(1, fakultaet);
		end = System.nanoTime();
		time = (end - start) / 1000;
		System.out.println("Mittels Endrekursion berechnete Fakultaet: " + fakEnd);
		System.out.println("      -Berechnet in: " + time + " Millisekunden"); 
		System.out.println();
		
		start = System.nanoTime();
		long powFakRek = powFak(2, powFak);
		end = System.nanoTime();
		time = (end - start) / 1000;
		System.out.println("Mittels Rekursion berechnete Hochfunktion: " + powFakRek);
		System.out.println("      -Berechnet in: " + time + " Millisekunden"); 
		System.out.println();
		
		start = System.nanoTime();
		long powFakEnd = endPowFak(1, 2, powFak);
		end = System.nanoTime();
		time = (end - start) / 1000;
		System.out.println("Mittels Endrekursion berechnete Hochfunktion: " + powFakEnd);
		System.out.println("      -Berechnet in: " + time + " Millisekunden"); 
		System.out.println();
		
		
	
	}
	
	public static long rekSumme(int number) {
		if (number >= 1) {
			return number + rekSumme(number - 1);
		}
		return 0;
	}
	

	public static long endSumme(long sum, int number) {
		if (number == 0) {
			return sum;
		}
		return endSumme(sum + number, number - 1);
	}
	
	
	public static long rekFakultaet(int number) {
		if (number >= 1) {
			return number * rekFakultaet(number - 1);
		}
		return 1;
	}
	
	
	public static long endFakultaet(long fak, int number) {
		if (number == 0) {
			return fak;
		}
		return endFakultaet (fak * number, number - 1);
	}
	
	
	public static long powFak(int basis, int exp) {
		if (exp >= 1) {
			return basis * powFak(basis, exp - 1);
		}
		return 1;
	}
	

	public static long endPowFak(long fak, int basis, int exp) {
		if (exp == 0) {
			return fak;
		}
		return endPowFak(fak * basis, basis, exp - 1);
	}
	
}
