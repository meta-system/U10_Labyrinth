import java.io.BufferedReader;
import java.io.FileReader;

public class Labyrinth {
	// zeilen und spalten
	// labyrinth
	
	public Labyrinth(String datei) throws Exception {
		// Datei oeffnen
		// Zeilen und Spalten auslesen
		// Array erstellen und fuellen
	}

	public static void main(String[] args) throws Exception {
		// Labyrinth Objekt L aus args[0] erzeugen
		// Evtl. Labyrinth ausgeben
		Feld fStartFeld = new Feld(0,0,true);
		Agent zeroZeroSeven = // Agent erzeugen
		Feld fZielfeld = new Feld(L.getZeilen() - 1, L.getSpalten() - 1, true);
		while (!zeroZeroSeven.aktuellesFeld().equals(fZielfeld)) {
			zeroZeroSeven.geheWeiter();
		}
		System.out.println(zeroZeroSeven);
	}
}