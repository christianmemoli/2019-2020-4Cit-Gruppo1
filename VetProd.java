import java.util.*;
public class VetProd {

private static final int DIM=100;
private Prodotto[] vett;

public VetProd() {
	vett=new Prodotto[DIM];
}
/*inserimento prodotto singolo*/
public void Inserimento() {
	for(int i=0;i<DIM;i++){ 	 
		vett[i]=new Prodotto ();
		Scanner input=new Scanner(System.in);
					
		System.out.println("Inserisci il nome del prodotto: \n");
		vett[i].setNome(input.nextLine());
					
		System.out.println("Inserisci la marca del prodotto: \n");
		vett[i].setMarca(input.nextLine());
					
		System.out.println("Inserisci il peso del prodotto: \n");
		vett[i].setPeso(input.nextFloat());
		
		System.out.println("Inserisci la quantita' del prodotto: \n");
		vett[i].setQuantita(input.nextInt());
		
		System.out.println("Inserisci l'ID del prodotto: \n");
		vett[i].setId(input.nextInt());
		
		System.out.println("Inserisci il prezzo del prodotto: \n");
		vett[i].setPrezzo(input.nextFloat());
	}
}
//cercare metodo per ordinare stringhe
 public void OrdinamentoBubbleSort() {  
     int n = DIM;  
     String appoggio;
     for(int i=0; i < n; i++){  
        for(int j=1; j < (n-i); j++){  
            if(vett[j-1].getNome().compareTo(vett[j].getNome())>0){  
                appoggio = vett[j-1].getNome();  
                vett[j-1] = vett[j];  
                vett[j].setNome(appoggio);
               }  
           }  
     }  
}
		
public void killProdotto(int numero) {
	vett[numero]=null;
}
//nuovo metodo per organizzare gli sconti
public void InserimentoSconto(int numero) {
	Scanner input=new Scanner(System.in);
	int s= input.nextInt();
		float prezzo=vett[numero].getPrezzo();
		System.out.println("Inserisci lo sconto che vuoi applicare");
		input.nextInt(s);
		vett[numero].setSconto(s);
		float sconto=(prezzo/100)*s;
		prezzo=prezzo-sconto;
		vett[numero].setPrezzo(prezzo);	
}

public void OrdinaSconto() {
	
    for(int i = 0; i < DIM; i++) {
        boolean flag = false;
        for(int j = 0; j < DIM-1; j++) {
            if(vett[j].getSconto()>vett[j+1].getSconto()) {
                Prodotto k = vett[j];
                vett[j]= vett[j+1];
                vett[j+1] = k;
                flag=true;
            }
        }
        if(!flag) break;
    }
}

public String cercaProdottoPerNome(String chiave)
{
	for (int i=0; i<DIM; i++) {
	    if (vett[i].getNome().equals(chiave)) {
	       return vett[i].getNome();  
	      }
	} return "Nessun prodotto trovato";
}

public void Modifica() {
	int scelta;
	do {
		System.out.println("\n SCEGLIERE"); 
		System.out.println("\n1 modifica nome");
		System.out.println("2 modifica peso");
		System.out.println("3 modifica marca");
		System.out.println("4 modifica ID");
		System.out.println("5 modifica quantita");
		System.out.println("6 modifica prezzo");
		System.out.println("7 esci");
		Scanner input = new Scanner(System.in);
		scelta = input.nextInt();
		switch (scelta){
		case 1:{
			System.out.print("Scrivi nome da inserire: ");
			String str=input.next();
			}
		
		case 2:{
			System.out.print("Scrivi peso da inserire: ");
			String str=input.next();
			}
		
		case 3:{
			System.out.print("Scrivi marca da inserire: ");
			String str=input.next();
			}
		
		case 4:{
			System.out.print("Scrivi ID da inserire: ");
			String str=input.next();
			}
		
		case 5:{
			System.out.print("Scrivi quantita' da inserire: ");
			String str=input.next();
			}
		
		case 6:{
			System.out.print("Scrivi prezzo da inserire: ");
			Float str=input.nextFloat();
			}
		}
	}while(scelta!=7);
}
		
public String Stampa() {
	String s=null;
	for(int i=0;i<DIM;i++) {
		s=s+"\n "+vett[i].getNome()+" "+vett[i].getMarca()+" "+vett[i].getPeso()+" "+vett[i].getId()+" "+vett[i].getQuantita()+" "+vett[i].getPrezzo()+" "+vett[i].getSconto();
	}
	return s;
  }
}
//correggere tutti gli errori e trasformare in lista