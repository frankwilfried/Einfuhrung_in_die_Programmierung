package klasseObjekte;

public class Rechteck {
	private int breite ;
	private int höhe ;
	public Rechteck (int breite ,int höhe ) {
	this.breite = breite ;
	this.höhe=höhe ;
	}
	public double gibSeitenverhaltnis() {
		return(double) this.breite/ this.höhe;
	}
    public boolean istGroesser(Rechteck rechteck ) {
    	return (this.breite*this.höhe) >= (rechteck.breite* rechteck.höhe);
    }
    public Rechteck drehe90() {
    	return new Rechteck(this.höhe,this.breite );
    }
    public static void main(String args[]) {
    double verhaelthnis = new Rechteck(2,1).drehe90().gibSeitenverhaltnis();
    System.out.println(verhaelthnis);
    }
}
