package familytree.service;

import java.util.HashMap;
import java.util.Map;

import familytree.model.Person;

public class FamilyTreeService {
	private Map<String, Person> people;

    public FamilyTreeService() {
        this.people = new HashMap<>();
    }

    public void addPerson(String name, String gender) {
        people.put(name, new Person(name, gender));
    }

    public void addRelationship(String name, String relationship) {
        Person person = people.get(name);
        if (relationship.equals("husband") && person.getSpouse() == null) {
        	people.get(name).setSpouse(people.get(name));
        } else if (relationship.equals("wife") && person.getSpouse() == null) {
        	people.get(name).setSpouse(people.get(name));
        }
    }
    
    public void connect(String name1, String relationship, String name2) {
        Person person1 = people.get(name1);
        Person person2 = people.get(name2);

        if (relationship.equals("father")) {
            person1.addChild(person2);
        } else if (relationship.equals("son")) {
            person2.addChild(person1);
        } else if (relationship.equals("daughter")) {
            person2.addChild(person1);
        } else {
            System.out.println("Invalid relationship");
        }
    }
    
    public int countSons(String name) {
        Person person = people.get(name);
        int count = 0;
        for (Person child : person.getChildren()) {
            if (child.getGender().equals("Male")) {
                count++;
            }
        }
        return count;
    }

    public int countDaughters(String name) {
        Person person = people.get(name);
        int count = 0;
        for (Person child : person.getChildren()) {
            if (child.getGender().equals("Female")) {
                count++;
            }
        }
        return count;
    }

    public int countWives(String name) {
        Person person = people.get(name);
        return person.getSpouse() != null ? 1 : 0;
    }

    public String fatherOf(String name) {
        Person person = people.get(name);
        Person father = person.getFather();

        return (father != null) ? father.getName() : "Unknown";
    }
    
}
