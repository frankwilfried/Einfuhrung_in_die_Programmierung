package klasseObjekte;

public class Datum {
	private int tag;
	private int monat;
	private int jahr ;
	public Datum(int tag ,int monat, int jahr) {
		this.tag=tag;
		 this.monat=monat;
		 this.jahr=jahr;
	}
	public int gibDifferenz(Datum datum) {
		return ((datum.tag +30*datum.monat+360*datum.jahr )-
				(this.tag+this.monat*30+ this.jahr*360));
	}
public Datum addiere (int tage) {
	int total= tage + this.tag+this.monat*30+ this.jahr*360;
	return new Datum ((total%30),(total%360)/30,total/360)  ;
	
}
public String toString() {
	return tag + "."+ monat +"."+jahr ;
}
public static void  main(String arg[]) {
	
	Datum datum =new Datum(23,3,2017);
	Datum new_datum =datum.addiere(7);
	System.out.println(new_datum);
}
}
