package mid;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;




public class Main {
	
	
	Random rand = new Random();
	
	
	Vector<Karyawan> vKaryawan  = new Vector<Karyawan>();
	
	Scanner scan = new Scanner(System.in);
	
	int menu, gaji;
	String id, name, gender, jabatan;
	
	Karyawan anak;
	
	public Main() {
		do {
			System.out.println("1. Insert Data Karyawan");
			System.out.println("2. View Data Karyawan");
			System.out.println("3. Update Data Karyawan");
			System.out.println("4. Delete Data Karyawan");
			System.out.println("5. Exit");
			System.out.print("Choose >> ");
			menu = scan.nextInt();scan.nextLine();
			
			if(menu == 1) {
				do {
					System.out.print("Input nama karyawan [>=3]: ");
					name = scan.nextLine();
				}while(name.length()<3);
				
				do {
					System.out.print("Input jenis kelamin [Laki-laki | Perempuan]: ");
					gender = scan.nextLine();
				}while(!gender.equals("Laki-laki") && !gender.equals("Perempuan"));
				
				do {
					System.out.print("Input jabatan manager [Manager | Supervisor | Admin]: ");
					jabatan = scan.nextLine();
				}while(!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin"));
				
				
				id ="-"+Math.abs(rand.nextInt()%10)+Math.abs(rand.nextInt()%10)+Math.abs(rand.nextInt()%10)+Math.abs(rand.nextInt()%10);
				
				anak = new Karyawan(id, name, gender, jabatan, gaji);
				vKaryawan.add(anak);
			
				
			}else if(menu == 2) {
				
				printData();
				if(vKaryawan.size()==0) {
					System.out.println("No Data!");
					System.out.println("Pressn ENTER to continue");
				}
				
			}else if(menu == 3) {
				
				printData();
				
			}else if(menu == 4) {
				printData();
				int index = 0, flag = 0;
				System.out.print("Angka yang ingin didelete: ");
				id = scan.nextLine();
				for (Karyawan anak : vKaryawan) {
					if(anak.getId().equals(id)) {
						flag=1;
						vKaryawan.remove(index);
						System.out.println("Data berhasil di delet!");
						break;
					}
					index++;
				}
				
				if(flag == 0){
					System.out.println("Data not found!");
					System.out.println("Press ENTER to continue");
					scan.nextLine();
				}
			}
		}while(menu != 5);
	}
	
	private void printData() {
		for (Karyawan anak : vKaryawan) {
			ran();
			System.out.println(anak.getId()+" "+anak.getName()+" "+anak.getGender()+" "+anak.getJabatan());
		}
	}
	
	private void ran() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		int length = 2;
		 
		Random rand = new Random();
		
		char[] text = new char[length];
		
		for(int i=0; i<length; i++) {
			text[i] = characters.charAt(rand.nextInt(characters.length()));
		}
	
		for(int i=0; i<text.length; i++) {
			randomString += text[i];
		}
		
		System.out.print(randomString);
	}

	public static void main(String[] args) {
		
		new Main();

	}

}
