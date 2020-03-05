import java.util.*;
import java.util.Scanner.*;
import java.io.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input=new Scanner(System.in);
		Lista l=new Lista();
		Prodotto m= new Prodotto();
		String c;
		int scelta,numero;
		scelta=0;
	
		do {
			System.out.println("\nSCEGLI");
			System.out.println("Premi 1 per inserire");
			System.out.println("Premi 2 per visualizzare la lista");
			System.out.println("Premi 3 per ordinare i prodotti alfabeticamente");
			System.out.println("Premi 4 per modificare un prodotto");	
			System.out.println("Premi 5 per inserire gli sconti");
			System.out.println("Premi 6 per cercare un prodotto tramite ID");
			System.out.println("Premi 7 per ordinare i prodotti secondo gli sconti");
			System.out.println("Premi 8 per cancellare un prodotto");
			System.out.println("Premi 9 per uscire dal programma");
			scelta = Input.nextInt();
			switch (scelta){	
			case 1: {
				System.out.print("Quanti prodotti vuoi inserire?");
				int v=Input.nextInt(); Input.nextLine();
				for(int i=0;i<v;i++)
					{
					System.out.print("Inserisci il nome del prodotto");
					String nome=Input.nextLine();Input.nextLine();
					
					System.out.print("Inserisci il peso del prodotto");
					double peso=Input.nextDouble();Input.nextLine();
					
					System.out.print("Inserisci la marca del prodotto");
					String marca=Input.nextLine();Input.nextLine();
					
					System.out.print("Inserisci la quantita' del prodotto");
					int quantita=Input.nextInt();Input.nextLine();
					
					System.out.print("Inserisci l'id del prodotto");
					int id=Input.nextInt();Input.nextLine();
					
					System.out.print("Inserisci il prezzo del prodotto");
					float prezzo=Input.nextFloat();
					m.setNome(nome);
					m.setPeso(peso);
					m.setMarca(marca);
					m.setQuantita(quantita);
					m.setId(id);
					m.setPrezzo(prezzo);
					l.Inserimento(m);
					}
			} break;
			
			case 2: {
				l.Visualizzazione();
			} break;
		
			case 3: {
//				l.OrdinamentoBubbleSort();
			} break;
		
			case 4: {
				System.out.println("\n SCEGLIERE"); 
				System.out.println("\nPremere 1 per modificare il nome");
				System.out.println("\nPremere 2 per modifica il peso");
				System.out.println("\nPremere 3 per modifica la marca");
				System.out.println("\nPremere 4 per modifica l'ID");
				System.out.println("\nPremere 5 per modifica la quantita");
				System.out.println("\nPremere 6 per modifica il prezzo");
				System.out.println("\nPremere 7 per uscire");
				Scanner input = new Scanner(System.in);
				scelta = input.nextInt();
				l.Modifica(scelta);
			} break;
		
			case 5: {
				System.out.print("Scrivere l'ID del prodotto: ");
				numero=Input.nextInt();
				l.InserimentoSconto(numero);
				System.out.print("Inserisci il prezzo del prodotto");
				float prezzo=Input.nextFloat();
				m.setPrezzo(prezzo);
				} break;
		
			case 6: {
				System.out.print("Scrivi un ID da cercare: ");
				int s=Input.nextInt();
				System.out.println(l.cercaProdottoPerId(s));
				} break;
		
			case 7: {
				//l.OrdinaSconto();
				} break;
		
			case 8: {
				System.out.print("Scrivi l'ID del prodotto da eliminare: ");
				numero=Input.nextInt();
				l.killProdotto(numero);
				} break;
			}
		}while(scelta!=9);
	}
}


