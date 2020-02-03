import java.util.*;
import java.util.Scanner.*;
import java.io.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Lista {
private Nodo pl;
	
	public Lista() {
		pl=null;
	}
	
	public void Inserimento(Prodotto c) {
		Nodo pn= new Nodo(c);
		pn.setPunt(pl);
		pl=pn;
		return;
	}
	
	public void Visualizzazione() {
		Nodo p;
		p=pl;	
		if(pl==null) {
			return;
			}
		do {
			System.out.println("Informazioni prodotto:\n");
			System.out.println("Nome: "+p.getInfo().getNome());
			System.out.println("Peso: "+p.getInfo().getPeso());
			System.out.println("Marca: "+p.getInfo().getMarca());
			System.out.println("Quantita': "+p.getInfo().getQuantita());
			System.out.println("Id: "+p.getInfo().getId());
			System.out.println("Sconto: "+p.getInfo().getSconto());
			System.out.println("Prezzo: "+p.getInfo().getPrezzo());
			p=p.getPunt();
		}while(p!=null);	
		return;
	}
	
	public String cercaProdottoPerNome(String chiave)
	{ 
		Nodo p;
		p=pl;	
		if(pl==null) {
			return "lista vuota";
			}
		do {if (p.getInfo().getNome().equals(chiave)) {
		       return p.getInfo().getNome();    
			}
		p=p.getPunt();
		}while(p!=null);
		return "Nessun prodotto trovato";
  }
	
	public void killProdotto(int numero) {
		Nodo p;
		p=pl;
		do {if (numero ==p.getInfo().getId() ) {
		       p.setInfo(null); 
			}
		p=p.getPunt();
		}while(p!=null);
	}
	
	
	public void OrdinamentoBubbleSort() {  
	     int n = 10; 
	     Nodo p,p1;
	     p=pl;
	     String appoggio=null,s;
	     for(int i=0; i < n; i++){  
	        for(int j=1; j < (n-i); j++){  
	            if(p.getInfo().getNome().compareTo(p.getInfo().getNome())>0){  
	            	s=appoggio;
	                s = p.getInfo().getNome();  
	                p1.getInfo() = p.getInfo();  
	                p.getInfo().setNome(appoggio);
	                p=p.getPunt();
	               }  
	           }  
	     }  
	}
	
		/*public void OrdinaSconto() {
		 int n = 10; 
	     Nodo p,p1;
	     p=pl;
	    for(int i = 0; i < DIM; i++) {
	        boolean flag = false;
	        for(int j = 0; j < DIM-1; j++) {
	            if(p.getInfo().getSconto().compareTo(p.getInfo().getSconto())>0) {
	                p.getInfo(k);
	                vett[j]= vett[j+1];
	                vett[j+1] = k;
	                flag=true;
	            }
	            p=p.getPunt();
	        }
	        if(!flag) break;
	    }
	}*/
	
	public void Modifica(int numero) {
		Nodo p;
		p=pl;
		Scanner input = new Scanner(System.in);
		do {
			switch (numero){
			case 1:{
				System.out.print("Scrivi nome da inserire: ");
				String str=input.next();
				Prodotto x=p.getInfo();
				x.setNome(str);
				}
			case 2:{
				System.out.print("Scrivi peso da inserire: ");
				double str=input.nextDouble();
				Prodotto x=p.getInfo();
				x.setPeso(str);
				}
			
			case 3:{
				System.out.print("Scrivi marca da inserire: ");
				String str=input.next();
				Prodotto x=p.getInfo();
				x.setMarca(str);
				}
			
			case 4:{
				System.out.print("Scrivi ID da inserire: ");
				int str=input.nextInt();
				Prodotto x=p.getInfo();
				x.setId(str);
				}
			
			case 5:{
				System.out.print("Scrivi quantita' da inserire: ");
				int str=input.nextInt();
				Prodotto x=p.getInfo();
				x.setQuantita(str);
				}
			
			case 6:{
				System.out.print("Scrivi prezzo da inserire: ");
				Float str=input.nextFloat();
				Prodotto x=p.getInfo();
				x.setPrezzo(str);
				}
			}
		}while(numero!=7);
	}
		
	public void InserimentoSconto(int numero) {
		Nodo p;
		p=pl;
		float prezzo=0;
		Scanner input = new Scanner(System.in);
		do {if (numero ==p.getInfo().getId() ) {
			System.out.print("Inserire lo sconto da inserire: ");
			Float s=input.nextFloat();
			Prodotto x=p.getInfo();
		    float sconto=(p.getInfo().getPrezzo()/100)*s;
			prezzo=prezzo-sconto;
			x.setPrezzo(prezzo);
			}
		p=p.getPunt();
		}while(p!=null);
	}
}



