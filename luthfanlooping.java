public class luthfanlooping{
	
	public static void main (String[] args)
	{
		int max_loop = 5;
		int i = 1, j;
		boolean balik = false;
		while(i > 0) {
			j = 1;
			while(j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			if (balik) {
				i--;
			}else{
				i++;
			}
 
			if (i == max_loop) {
				balik = true;
			}
 
		}
	}
}
