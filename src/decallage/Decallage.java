package decallage;

import java.util.ArrayList;
import java.util.Scanner;

public class Decallage {

	static int mod = 28;
	//chaine a dechiffrer : Xihdiolvwvniomv.nvwvnion.muMcvpiomvwllcp.tvwvfcl.vy.yc,vyv.mnvko.vpiomvwp.tvl.ommcvf.vjl.gc.lvybwff.ha.uFwvjliybwch.v.nwj.vm.lwvz.vxicl.vohvxihvj.ncnvyw .,vl.fwr.lv.nvjwmm.lvwovjliybwchv.r.lycy.uvZ.mif.vjiolvf.mv won.mvzvilnialwjb.u
	
	public static void main(String[] args) {
		
		ArrayList <Character> alphabet = new ArrayList <Character> ();  //Declaration d'une liste comportant toutes les lettres de l'alphabet (francais)
		
		alphabet.add(' ');
		alphabet.add('A'); //1
		alphabet.add('B'); //2
		alphabet.add('C'); //3
		alphabet.add('D'); //4
		alphabet.add('E'); //5
		alphabet.add('F'); //6
		alphabet.add('G'); //7
		alphabet.add('H'); //8
		alphabet.add('I'); //9
		alphabet.add('J'); //10
		alphabet.add('K'); //11
		alphabet.add('L'); //12
		alphabet.add('M'); //13
		alphabet.add('N'); //14
		alphabet.add('O'); //15
		alphabet.add('P'); //16
		alphabet.add('Q'); //17
		alphabet.add('R'); //18
		alphabet.add('S'); //19
		alphabet.add('T'); //20
		alphabet.add('U'); //21
		alphabet.add('V'); //22
		alphabet.add('W'); //23
		alphabet.add('X'); //24
		alphabet.add('Y'); //25
		alphabet.add('Z'); //26
		alphabet.add('.');
	
		
				
		System.out.print("Entrez un texte a dechiffrer : ");
		Scanner sc = new Scanner (System.in);
		String texteCrypte = sc.nextLine();
		String texteCrypteMaj = texteCrypte.toUpperCase();

		
		//	DECHIFFREMENT = dk (x) = x - k mod 28
		
		for(int cle=0 ; cle<mod ; cle++) { //chiffrement
			
			System.out.println("\n\ncle = " + cle);
			int i=0;
			
			while(i<texteCrypteMaj.length()) {
			
				
				char lettreChiffree = texteCrypteMaj.charAt(i); //récuperer l'index de la lettre a dechiffrer
				
				if(alphabet.contains(lettreChiffree)) { //savoir si on est bien en presence d'une lettre et non d'un autre type de caractere
					//System.out.println(cle + "oui");
					int alphabetLettre = alphabet.indexOf(lettreChiffree);
					//System.out.println(cle + " - " + alphabetLettre);
					int indexNewLettre = alphabetLettre - cle; //calcul de l'index de la nouvelle lettre
					
					if(indexNewLettre<0) { //si nouvel index de la lettre en cours de dechiffrement est negatif
						int mod_nb_negatif = Math.floorMod(indexNewLettre, mod); //calcul du modulo de cet index
						//System.out.println(cle + " - " + mod_nb_negatif);
						System.out.print(alphabet.get(mod_nb_negatif));
					}
					else {
						int mod_nb_positif = indexNewLettre%mod;
						//System.out.println(cle + " - " + mod_nb_positif);
						System.out.print(alphabet.get(mod_nb_positif));
					}				

				}
				else { //Si on est en presence d'un caractere autre qu'une lettre, l'afficher
					System.out.print(lettreChiffree);
				}
		
					
				i++;
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
