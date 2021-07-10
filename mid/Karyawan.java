package mid;

public class Karyawan {

	private String id;
	private String name;
	private String gender;
	private String jabatan;
	private int gaji;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}

	public Karyawan(String id, String name, String gender, String jabatan, int gaji) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.jabatan = jabatan;
		this.gaji = gaji;
	}

	
}
