import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int row,column;
	
		System.out.println("Mayin Tarlası oyununa hoşgeldiniz:");
	    System.out.println("Lütfen oynamak istediginiz boyutları giriniz:!");
	   // System.out.println("Satır sayısı:  ");
	    //row = scan.nextInt();
	   // System.out.println("Sutun sayısı:  ");
	    //column=scan.nextInt();
	    
	    
	    MayinTarlasi mayin =new MayinTarlasi(5,5);
	    mayin.run();
	    
	}

}
