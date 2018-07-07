import java.util.Scanner;

public class luthfanmatriks {
	private static Scanner sc=new Scanner(System.in);
	private static int menu, ulang_1, ulang_2, ulang_3, kolom_1, baris_1, kolom_2, baris_2;

	public static void main(String[]args){
		System.out.println("MENGHITUNG MATRIKS");
		System.out.println("Pilih salah satu dari 3 pilihan dibawah!");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.print("\n Proses yang dipilih : ");
		
		menu = sc.nextInt();
		
		switch (menu) {
			case 1:
				jumlah();
				break;
				
			case 2:
				kurang();
				break;
				
			case 3:
				kali();
				break;
				
			default:
				System.out.println("Pilihan tidak sesuai!");
				break;
		}

	}
	
	private static boolean jumlahkurang_cek(int baris_1, int kolom_1, int baris_2, int kolom_2)
	{
		if((baris_1 == baris_2) && (kolom_1 == kolom_2))
		{
			return true;
		} 
			else 
		{
			return false;
		}
		
	}
	
	
	private static boolean kali_cek(int kolom_1, int baris_2)
	{
		if(kolom_1 == baris_2)
		{
			return true;
		} 
			else 
		{
			return false;
		}
		
	}
	
	
	private static void jumlah()
	{
		System.out.println("PENJUMLAHAN MATRIKS");
		System.out.println("Ordo Matriks A");
		System.out.print("Jumlah Baris : "); baris_1 = sc.nextInt();
		System.out.print("Jumlah Kolom : "); kolom_1 = sc.nextInt();
		
		System.out.println("Ordo Matriks B");
		System.out.print("Jumlah Baris : "); baris_2 = sc.nextInt();
		System.out.print("Jumlah Kolom : "); kolom_2 = sc.nextInt();
		
		System.out.println();
		
		if(jumlahkurang_cek(baris_1, kolom_1, baris_2, kolom_2))
		{
			int matriks_a[][] = new int[baris_1][kolom_1];
			int matriks_b[][] = new int[baris_2][kolom_2];
			int jumlah_hasil[][] = new int[baris_1][kolom_1];
			
			System.out.println("Input Matriks A");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					System.out.print("- Matrik A baris ke-"+(ulang_1+1)+" kolom ke-"+(ulang_2+1)+" : ");
					matriks_a[ulang_1][ulang_2] = sc.nextInt();
				}
			}
			
			System.out.println("Input Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_2; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_2; ulang_2++)
				{
					System.out.print("Matrik B baris ke- "+(ulang_1+1)+" kolom ke-"+(ulang_2+1)+" : ");
					matriks_b[ulang_1][ulang_2] = sc.nextInt();
				}
			}
			
			System.out.println("Matriks A");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					System.out.print(matriks_a[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_2; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_2; ulang_2++)
				{
					System.out.print(matriks_b[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks A + Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					jumlah_hasil[ulang_1][ulang_2] = matriks_a[ulang_1][ulang_2] + matriks_b[ulang_1][ulang_2];
					System.out.print(jumlah_hasil[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
		} else 
		{
			System.out.println("Matriks A dan matriks B tidak dapat dijumlahkan");
		}
				
	}
	
	
	private static void kurang()
	{
		System.out.println("PENGURANGAN MATRIKS");
		System.out.println("Ordo Matriks A");
		System.out.print("Jumlah Baris : "); baris_1 = sc.nextInt();
		System.out.print("Jumlah Kolom : "); kolom_1 = sc.nextInt();
		
		System.out.println("Ordo Matriks B");
		System.out.print("Jumlah Baris : "); baris_2 = sc.nextInt();
		System.out.print("Jumlah Kolom : "); kolom_2 = sc.nextInt();
		
		System.out.println();
		
		if(jumlahkurang_cek(baris_1, kolom_1, baris_2, kolom_2))
		{
			int matriks_a[][] = new int[baris_1][kolom_1];
			int matriks_b[][] = new int[baris_2][kolom_2];
			int hasil_kurang[][] = new int[baris_1][kolom_1];
			
			System.out.println("Input Matriks A");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					System.out.print("Matriks A baris ke-"+(ulang_1+1)+" kolom ke-"+(ulang_2+1)+" : ");
					matriks_a[ulang_1][ulang_2] = sc.nextInt();
				}
			}
			
			System.out.println("Input Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_2; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_2; ulang_2++)
				{
					System.out.print("Matriks B baris ke-"+(ulang_1+1)+" kolom ke-"+(ulang_2+1)+" : ");
					matriks_b[ulang_1][ulang_2] = sc.nextInt();
				}
			}
			
			System.out.println("Matriks A");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					System.out.print(matriks_a[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_2; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_2; ulang_2++)
				{
					System.out.print(matriks_b[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks A - Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					hasil_kurang[ulang_1][ulang_2] = matriks_a[ulang_1][ulang_2] - matriks_b[ulang_1][ulang_2];
					System.out.print(hasil_kurang[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
			
		} else 
		{
			System.out.println("Matriks A dan matriks B tidak dapat dikurangkan");
		}
	}
	
	
	private static void kali()
	{
		System.out.println("PERKALIAN MATRIKS");
		System.out.println("Ordo Matriks A");
		System.out.print("Jumlah Baris : "); baris_1 = sc.nextInt();
		System.out.print("Jumlah Kolom : "); kolom_1 = sc.nextInt();
		
		System.out.println("Ordo Matriks B");
		System.out.print("Jumlah Baris : "); baris_2 = sc.nextInt();
		System.out.print("Jumlah Kolom : "); kolom_2 = sc.nextInt();
		
		System.out.println();
		
		if(kali_cek(kolom_1, baris_2))
		{
			int matriks_a[][] = new int[baris_1][kolom_1];
			int matriks_b[][] = new int[baris_2][kolom_2];
			int hasil_kali[][] = new int[baris_1][kolom_2];
			
			System.out.println("Input Matriks A");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					System.out.print("Matriks A baris ke-"+(ulang_1+1)+" kolom ke-"+(ulang_2+1)+" : ");
					matriks_a[ulang_1][ulang_2] = sc.nextInt();
				}
			}
			
			System.out.println("Input Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_2; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_2; ulang_2++)
				{
					System.out.print("Matriks B baris ke-"+(ulang_1+1)+" kolom ke-"+(ulang_2+1)+" : ");
					matriks_b[ulang_1][ulang_2] = sc.nextInt();
				}
			}
			
			System.out.println("Matriks A");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_1; ulang_2++)
				{
					System.out.print(matriks_a[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_2; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_2; ulang_2++)
				{
					System.out.print(matriks_b[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}

			System.out.println("Matriks A . Matriks B");
			for(ulang_1 = 0; ulang_1 < baris_1; ulang_1++)
			{
				for(ulang_2 = 0; ulang_2 < kolom_2; ulang_2++)
				{
					for(ulang_3 = 0; ulang_3 < baris_2; ulang_3++)
					{
						hasil_kali[ulang_1][ulang_2] += matriks_a[ulang_1][ulang_3] * matriks_b[ulang_3][ulang_2];
					}
					System.out.print(hasil_kali[ulang_1][ulang_2]+" ");
				}
				System.out.println();
			}
			
		} else 
		{
			System.out.println("Matriks A dan matriks B tidak dapat dikalikan");
		}
	}

}