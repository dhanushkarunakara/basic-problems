package programming;

public class TypecastingClasses {
	public static void main(String[] args) {
		GrandFather gf = new Child1();
		
		
	}

}

class GrandFather{
	int gaf = 1;
}

class Parent1 extends GrandFather{
	int par1 = 21;
}

class Child1 extends Parent1{
	int chi1 = 31;
}

class Child2 extends Parent1{
	int chi2 = 32;
}

class Parent2 extends GrandFather{
	int par2 = 22;
}

class Child3 extends Parent2{
	int chi3 = 33;
}

class Child4 extends Parent2{
	int chi4 = 34;
}