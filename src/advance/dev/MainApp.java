package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		p.setName("Man");
//		p.setOld(19);
//		p.setHoa(6);
//		p.setToan(10);
//		p.setLy(7);		
		SinhVien arr[] = new SinhVien[5];		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new SinhVien(null, i, null, null, i);
			System.out.println(" Nhập Sinh Viên Thứ : " + (i+1));
			System.out.println("Nhap ten :");
			arr[i].setName(sc.nextLine());
			arr[i].setAdress(sc.nextLine());
			arr[i].setDtb(sc.nextFloat());
			arr[i].setOnl(sc.nextInt());
			arr[i].setSdt(sc.nextLine());
			sc.nextLine();
			
			
			System.out.println("Diem Trung binh" + arr[i].getDtb() );

			}
			System.out.println("---------------------------");
	}

}