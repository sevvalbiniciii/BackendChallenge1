package intro;

public class Main {
	public static void main(String[] args) {
		System.out.print("*");
		int n = 6; // Satır sayısı
        int k = 0; // Yıldız sayısı
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k += 2;
        }
    }
}	
    		 
	
	


