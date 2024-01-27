package familytree.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
    private List<Person> children;
    private Person spouse;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.children = new ArrayList<>();
        this.spouse = null;
    }

    public String getName() {
        return name;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    public Person getSpouse() {
        return spouse;
    }
    
    public String getGender() {
        return gender;
    }
    
    public Person getFather() {
        for (Person child : children) {
            if (child.getGender().equals("Male") || child.getGender().equals("Female")) {
                return child;
            }
        }
        return null;
    }
    
}
