import java.util.Scanner;
class Furniture {
	protected int modelNo;
	protected String modelName;
	protected String modelDescription;
	protected Material material;
	protected FurnitureType type;
	public Furniture() {
		modelName = new String();
		modelDescription = new String();
	}
	public Furniture(int modelNo, String modelName, String modelDescription, Material material, FurnitureType type) {
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.modelDescription = modelDescription;
		this.material = material;
		this.type = type;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Model No : ");
		modelNo = in.nextInt();
		modelName = in.nextLine();
		System.out.println("Enter Model Name :");
		modelName = in.nextLine();
		System.out.println("Enter Model Description :");
		modelDescription = in.nextLine();
		System.out.println("Enter Furniture Material : ");
		material = Material.acceptMaterial();
		System.out.println("Enter Furniture Type : ");
		type = FurnitureType.acceptFurnitureType();
	}
	public void showData() {
		System.out.println("Model No : "+modelNo);
		System.out.println("Model Name : "+modelName);
		System.out.println("Model Description : "+modelDescription);
		System.out.println("Furniture Material : "+material);
		System.out.println("Furniture Type : "+type);
	}
	public static void main(String args[]) {
		Furniture f = new Furniture();
		f.acceptData();
		f.showData();
	}
}
