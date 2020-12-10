import java.util.Scanner;

/*
* Author: isabella
* Date: 5-Dec-2020
*/
public class MethodesTableaux
{

	public static void main(String[] args)
		{
			int[] myTab = {14,1298,24,12,2,9,8,3,123,4,10};
			
			System.out.println("l'élément le plus grand est " + plusGrandNum(myTab));
		
			System.out.println("L'élément le plus petit est "+ plusPetitNum(myTab));
		
			System.out.println("La moyenne des éléments est " + moyenne(myTab));
		
			System.out.println("Le nombre d’éléments d’un tableau d’entiers inférieure à 10 est " + LessThanTen(myTab)); 
		
			System.out.println("L’indice de l’élément le plus petit est " + indicePetit(myTab));
		
			System.out.println("L'élément est présent dans le tableau : " + inOrNot(myTab));
		
			System.out.println("Le plus grand commun diviseur de deux entiers est " + GCF(11,99));
		
			int[] b = order(myTab);
			System.out.println(b[2]);
		}
	
	
	
	// 1. methode pour afficher le plus grand nomber
	
	static int plusGrandNum (int[] Tab) 
	{
		int max=0; //variable qui servira pour la valeur maximale
		for (int i=0; i<Tab.length; i++) {
			if(Tab[i]>max) {
				max=Tab[i];
			}
		}
		return max;
	}
	
	// 2. methode pour afficher le plus petit nomber
	
	static int plusPetitNum (int[] array) {
		int min=array[0];
		for (int i=0; i<array.length; i++) {
			if (array[i]<min) {
				min=array[i];
			}
		}
		return min;
		
	}
	
	// 3. methode pour afficher la moyenne 
	
	static int moyenne(int[] array) {
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			sum += array[i];
			}
		int moyenne = sum/array.length;
	
		return moyenne;
	
	}
	
	// 4. methode pour afficher les nombers inferieure a 10
	
	static int LessThanTen (int[] array) {
		int num = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i]<10) {
				num++;
			}
		}
		return num;
			
	}
	
	// 5. methode pour afficher l’indice de l’élément le plus petit
	
	static int indicePetit (int[] array) {
		int small = array[0];
		int position = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i]<small) {
				small = array[i];
				position=i;
			}
		}
		return position;
	}
	
	// 6.. methode pour afficher l'index du plus grand nombre
			static int plusGrandIndex(int []Tab)
			{
				int max=0; // variable qui servira pour la valeur maximale
				int pos=0; // variable pour la position du plus grand nombre
				for(int i=0;i<Tab.length;i++)
				{
					if(Tab[i]>max)
					{
						max=Tab[i];
						pos=i;
					}
				}
				return pos;
			}

	// 7. methode pour dire si un élément quelconque est présent ou non
	
	static boolean inOrNot (int[] array) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for (int i=0; i<array.length; i++) {
			if (array[i]==num) {
				return true;
			}
		}
			return false;
			
	}
	
	
	// *8. methode pour en ordre croissant les éléments d’un tableau
	
	static int[] order (int[] a) {
		
		for (int i=0; i<a.length; i++) { //a[0]
			int min;
			for (int ii=i+1; ii<a.length; ii++) { //a[1]
				
				if (a[ii]<a[i]) { //small to large
					// put a[ii] the one that is compared in the variable 
					min=a[i]; //min=3
					a[i]=a[ii]; // a[i] turns to the value of a[ii] -> a[0]=0
					a[ii]=min; //a[1]=3
				}
			}
			
			
		}
		return a;
		}
	
	
	
	// 10. methode pour trouver le plus grand commun diviseur de deux entiers.
	
	static int GCF (int a, int b) {
		int gcf=1;
		int k=1; // possible common factor
		while(k<=a && k<=b)
		{
			if(a%k==0 && b%k==0)
				gcf=k;
			k++;
		}
		return gcf;
	}
		/*int num = 1;
		 * if (a<=b) {
			for (int i=1; i<=a; i++) {
				if (a%i == 0 && b%i == 0) {
					num=i; 
				}
			}
		}
		else {
			for (int i=1; i<=b; i++) {
				if (a%i == 0 && b%i == 0) {
					num=i; 
				}
			}
		}
		return num;
	}*/


}





