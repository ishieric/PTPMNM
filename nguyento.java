import java.util.Scanner;

public class NguyenTo {

	public static void main(String[] args) {
		int a=0;
		Scanner ban_phim=new Scanner(System.in);
		System.out.println("Nhap mot so: ");
		a=ban_phim.nextInt();
		String kq=" ";
		if(a%2==0)
			kq="So chan";
		else
			kq="So le";
		System.out.println("So vua nhap "+a+" " +"la"+" "+kq);
		
		
	}
}