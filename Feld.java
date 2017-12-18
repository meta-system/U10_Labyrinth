public class Feld {
	public int zeile, spalte;
	private boolean status;
	
	public Feld (int zeile, int spalte, boolean status){
		this.zeile = zeile;
		this.spalte= spalte;
		this.status= status;
	} 
	
	public int getZeile(){
		return zeile;
	}
	public int getSpalte(){
		return spalte;
	}
	public boolean equals (Feld feld2){
		if (feld2.zeile != zeile) {
			return false;
		}
		if (feld2.spalte != spalte){
			return false;
		}
		return true;
	}
	public void setStatus(boolean status){
		this.status = status;
	}
	public String toString(){
		return "("+zeile+","+spalte+")";
	}
	

}
