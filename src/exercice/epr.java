package exercice;

public class epr {
	 public static int[] spiegelsumme(int[] tab) {
	        int taille = tab.length;
	        int[] result = new int[(taille + 1) / 2];
	        for (int i = 0; i < result.length; i++) {
	            result[i] = tab[i] + tab[taille - i-1];
	        }
	return result;
	    }
public static int[] paarsummen (int[] tab) {
	int []result = new int[tab.length-1];
	for (int i=0; i< result.length ;i++) {
		result[i]= tab[i]+tab[i+1];

	}
	return result;
}
	    public static int[]doppelt (int[]tab){
	    	int[]result =new int[2*tab.length];
	    	for (int i=0 ; i<result.length ;i++) {
	    	if (i%2==0) {result[i]=tab[i/2];}
	    	
	    	else {	result[i]=result[i-1];
	   
	    	}
	    	}
	    	return result ;
	    }
	    public static int[]middle (int []tab ){
	    int[]result =new int[tab.length-2];
	    for(int i=0;i<result.length;i++) {
	    result[i]=tab[i+1]	;
	    }
	    return result;
	    }
	    public static int []jedeZweiteKomponente(int[]tab ){
	    	
	    	int []result =new int[tab.length/2];
	    	for(int i=0 ;i<result.length;i++) {
	    		result[i]=tab[2*i+1];
	    		
	    	}return result;
	    }
	    public static boolean sindTeiler(int[]tab) {
	    	int compteur =0;
	    	for (int i =0; i < tab.length-1 ;i++) {
	    		if (tab[i+1]%tab[i]==0) {
	    			compteur=compteur+1;}
	    		
	    
	    }
		return compteur== tab.length-1;
	    }
	    public static boolean sindTeiler2(int[] a) {
	    	boolean sindTeiler = true ;
	    	int i = 0;
	    	while (i < a.length-1 && sindTeiler) {
	    	sindTeiler = a[i +1] % a[i] == 0;
	    	i++;
	    	}
	    	return sindTeiler;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]tabe =new int[]{1,5,5,20,200,400};
	System.out.println(	sindTeiler2(tabe));
	//	for (int i=0 ;i< result.length ;i++) {
		//	System.out.print(result[i]+",");
		}
	}


