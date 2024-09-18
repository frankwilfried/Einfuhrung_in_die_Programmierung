package klasseObjekte;

public class Strecke {
	private Punkt start ;
	private Punkt ziel ;
	public Strecke (Punkt start ,Punkt ziel ) {
		this.start=start;
		this.ziel= ziel;
	}
    public boolean fuehrtAufwaerts() {
    return 	start.gibY()< ziel.gibY();
    }
    public Strecke drehe90() {
    	return new Rechteck((this.x,this.y),)
    }
} 
