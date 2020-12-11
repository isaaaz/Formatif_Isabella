import java.util.Scanner;

/*
* Author: isabella
* Date: 10-Dec-2020
*/
public class Formatif
{

	public static void main(String[] args)
		{
			int[] Tab = {32,8,18,6,12,3};
			
			// 1. Afficher la somme des éléments d’un tableau d’entiers
			
			System.out.println(somme(Tab));
			
			
			// 2. Afficher un message disant si l’élément recherché est présent ou non
			
			if (present(Tab))
				System.out.println("Présent");
			else
				System.out.println("Pas présent");
			
			
			// 3. Afficher le tableau modifié
			
			int[] b = tableauModifie(Tab);
			
			for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
			}
			
			
		}
			
	
			// 1. Méthode pour calculer la somme des éléments d’un tableau d’entiers
			
				static int somme (int[] a) {
				int sum = 0; 
				for (int i=0; i<a.length; i++) {
					sum+=a[i];
				}
				return sum;
			}
			
			
			// 2. Méthode pour tester si un tableau contient un élément donné
			
				static boolean present (int[] a) {
					Scanner sc = new Scanner (System.in);
					int num = sc.nextInt();
					sc.close();
					for (int i=0; i<a.length; i++) {
						if (a[i]==num) {
							return true;
						}
					}
						return false;
						
				}

				
				
			// 3. Méthode pour retourne le même tableau amputé du plus grand nombre de cet élément.
				
				static int[] tableauModifie (int[] a) {	
					
				
					int position = MethodesTableaux.plusGrandIndex(a);
					a[position] = a[a.length-1]; 
					
					int[] monTab = new int[a.length-1];
					
					for (int i=0; i<monTab.length; i++) {
						if (i<position)
						monTab[i] = a[i];
						else 
						monTab[i] = a[i+1];
						
					}
					return monTab;
				}
				
						
		

}
