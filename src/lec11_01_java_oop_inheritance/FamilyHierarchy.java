package lec11_01_java_oop_inheritance;

public class FamilyHierarchy {

	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		grandFather.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Aunt aunt = new Aunt ();
		aunt.auntInfo();
		aunt.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Cousin1 cousin1 = new Cousin1();
		cousin1.cousin1Info();
		cousin1.auntInfo();
		cousin1.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		uncle.grandFatherInfo();
		
		
		System.out.println("\n----------------------------------------------------\n");
		Cousin2 cousin2 = new Cousin2();
		cousin2.cousin2Info();
		cousin2.uncleInfo();
		cousin2.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Father father = new Father();
		father.fatherInfo();
		father.grandFatherInfo();
			
		System.out.println("\n----------------------------------------------------\n");
		Sister sister = new Sister();
		sister.sisterInfo();
		sister.fatherInfo();
		sister.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Niece niece = new Niece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		GrandChildren grandChildren = new GrandChildren();
		grandChildren.grandChildrenInfo();
		grandChildren.nieceInfo();
		grandChildren.sisterInfo();
		grandChildren.fatherInfo();
		grandChildren.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		MySelf mySelf = new MySelf();
		mySelf.myInfo();
		mySelf.fatherInfo();
		mySelf.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Daughter daughter = new Daughter();
		daughter.daughterInfo();
		daughter.myInfo();
		daughter.fatherInfo();
		daughter.grandFatherInfo();
		
		
		
		
		

	}

}
