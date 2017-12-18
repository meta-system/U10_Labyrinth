import java.io.BufferedReader;
import java.io.FileReader;

public class Labyrinth {
	// zeilen und spalten
	private int zeilen, spalten;
	public Feld[][] labyrinth;
	// labyrinth
	
	public Labyrinth(String datei) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(file));
        
		// Datei oeffnen
		// Zeilen und Spalten auslesen
		// Array erstellen und fuellen
	}
	public int getZeilen(){
		return zeilen;
	}
	public int getSpalten(){
		return spalten:
	}
	public String toString(){
		String erg = "";
		for (int z = 0; z < labyrinth.length ; z++){
			for (int s = 0; s < labyrinth[i].length; s++){
				erg+= (labyrinth[z][s].getStatus()) ? "O" : "X";
			}
		}
		return erg;
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
