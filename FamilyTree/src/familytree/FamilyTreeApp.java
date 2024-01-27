package familytree;

import familytree.service.FamilyTreeService;

public class FamilyTreeApp {
	public static void main(String[] args) {
		FamilyTreeService familyTree = new FamilyTreeService();

		familyTree.addPerson("John Shakespeare","Male");
		familyTree.addPerson("Mary Adren", "Female");
		familyTree.addPerson("Joan","Female");
		familyTree.addPerson("Margaret", "Female");
		familyTree.addPerson("William", "Male");
		familyTree.addPerson("Anne hathaway", "Female");
		familyTree.addPerson("Gilbert", "Male");
		familyTree.addPerson("Anne", "Female");
		familyTree.addPerson("Richard", "Male");
		familyTree.addPerson("Edmund", "Male");
		familyTree.addPerson("Susanna", "Female");
		familyTree.addPerson("John Hall", "Male");
		familyTree.addPerson("Hamnet", "Male");
		familyTree.addPerson("Judith", "Female");
		familyTree.addPerson("Thomas Quiney", "Male");
		familyTree.addPerson("Elizabeth", "Female");
        familyTree.addPerson("Shakespeare", "Male");
        familyTree.addPerson("Thomas", "Male");

        familyTree.addRelationship("John Shakespeare", "husband");
        familyTree.addRelationship("William", "husband");
        familyTree.addRelationship("Susanna", "wife");
        familyTree.addRelationship("Judith", "wife");        

        familyTree.connect("John Shakespeare", "father", "Joan");
        familyTree.connect("John Shakespeare", "father", "Margaret");
        familyTree.connect("John Shakespeare", "father", "William");
        familyTree.connect("John Shakespeare", "father", "Gilbert");
        familyTree.connect("Anne", "daughter", "John Shakespeare");
        familyTree.connect("Richard", "son", "John Shakespeare");
        familyTree.connect("Edmund", "son", "John Shakespeare");
         
        familyTree.connect("William", "father", "Susanna");
        familyTree.connect("William", "father", "Hamnet");
        familyTree.connect("William", "father", "Judith");
        
        familyTree.connect("Elizabeth", "daughter", "John Hall");
        
        familyTree.connect("Thomas Quiney", "father", "Shakespeare");
        familyTree.connect("Thomas Quiney", "father", "Thomas");

        System.out.println("John Shakespeare son count: " + familyTree.countSons("John Shakespeare"));
        System.out.println("John Shakespeare daughter count: " + familyTree.countDaughters("John Shakespeare"));
        System.out.println("John Shakespeare wife count: " + familyTree.countWives("John Shakespeare"));
  
        System.out.println("Father of Anne: " + familyTree.fatherOf("Anne"));
        
        System.out.println("William son count:" + familyTree.countSons("William"));
        System.out.println("William daughter count:" + familyTree.countDaughters("William"));
        System.out.println("William wife count: " + familyTree.countWives("William"));
        System.out.println("Father of Willaim: " + familyTree.fatherOf("William"));
    }
}
