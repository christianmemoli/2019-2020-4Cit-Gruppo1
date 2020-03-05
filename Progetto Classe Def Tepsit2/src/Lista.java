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
	 while(p!=null){
			System.out.println("Informazioni prodotto:\n");
			System.out.println("Nome: "+p.getInfo().getNome());
			System.out.println("Peso: "+p.getInfo().getPeso());
			System.out.println("Marca: "+p.getInfo().getMarca());
			System.out.println("Quantita': "+p.getInfo().getQuantita());
			System.out.println("Id: "+p.getInfo().getId());
			System.out.println("Sconto: "+p.getInfo().getSconto());
			System.out.println("Prezzo: "+p.getInfo().getPrezzo());
			p=p.getPunt();
		}
		return;
	}
	
	public String cercaProdottoPerId(int numero)
	{ 
		Nodo p;
		p=pl;	
		if(pl==null) {
			return "lista vuota";
			}
		do {if (p.getInfo().getId()==numero) {
		       return p.getInfo().getNome();    
			}
		else {
			return "Nessun prodotto trovato";
		}
		
		}while(p!=null);
  }
	
	public void killProdotto(int numero) {
		Nodo p;
		p=pl;
		do {if (numero ==p.getInfo().getId() ) {
		       p.setInfo(null); 
			}
		p=p.getPunt();
		}while(p!=null);
		return;
	}
	
	
	public void OrdinamentoBubbleSort() {  
	     int n = 10; 
	     Nodo p,p1;
	     p=pl;
	     for(int i=0; i < n; i++){  
	        for(int j=1; j < (n-i); j++){  
	            if(p.getInfo().getNome().compareTo(p.getInfo().getNome())>0){  
	            	p.setPunt(p1)p.setPunt(p1);
	            	p.setPunt()=p.setInfo(i+1);
	            	if(i==2) {
	            		p.setPunt()=pl;
	            	}
	            	if(i==i-1) {
	            		p.setPunt()=null;
	            	}else p.setPunt()=p.setInfo(i+2);
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
		Lista l=new Lista();
		l.cercaProdottoPerId(numero);
		Scanner input = new Scanner(System.in);
		do {
			switch (numero){
			case 1:{
				System.out.print("Scrivi nome da inserire: ");
				String str=input.next();
				Prodotto x=p.getInfo();
				x.setNome(str);
				}break;
			case 2:{
				System.out.print("Scrivi peso da inserire: ");
				double str=input.nextDouble();
				Prodotto x=p.getInfo();
				x.setPeso(str);
				}break;
			
			case 3:{
				System.out.print("Scrivi marca da inserire: ");
				String str=input.next();
				Prodotto x=p.getInfo();
				x.setMarca(str);
				}break;
			
			case 4:{
				System.out.print("Scrivi ID da inserire: ");
				int str=input.nextInt();
				Prodotto x=p.getInfo();
				x.setId(str);
				}break;
			
			case 5:{
				System.out.print("Scrivi quantita' da inserire: ");
				int str=input.nextInt();
				Prodotto x=p.getInfo();
				x.setQuantita(str);
				}break;
			
			case 6:{
				System.out.print("Scrivi prezzo da inserire: ");
				Float str=input.nextFloat();
				Prodotto x=p.getInfo();
				x.setPrezzo(str);
				}break;
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



