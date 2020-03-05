import java.util.*;
import java.util.Scanner.*;
import java.io.*;
import java.lang.*;
public class Nodo {
	private Prodotto info;
	private Nodo punt;
	
	public Nodo(Prodotto c){
		info = new Prodotto(c.getNome(), c.getPeso(), c.getMarca(), c.getQuantita(), c.getId(), c.getSconto(), c.getPrezzo());
		punt = null;
	}
	
	public Nodo(){
		punt = null;
	}
	
	public void setInfo(Prodotto c){
		this.info=c;
	}
	
	public Prodotto getInfo(){
		return info;
	}
	
	public void setPunt(Nodo p){
		this.punt =p;
	}
	
	public Nodo getPunt(){
		return punt;
	}
}
