package programming;

public class TypecastingInterfaces {
	
	public static void main(String[] args) {
		
		Parent11 p11 = new Child();
		Parent21 p22 = (Parent21) p11;
		
	}
}

interface GrandFather1{
	int gaf = 1;
}

interface Parent11 extends GrandFather1{
	int par1 = 21;
}

interface Parent21 extends GrandFather1{
	int par2 = 22;
}

class Child implements Parent11,Parent21{
	int child = 31;
}