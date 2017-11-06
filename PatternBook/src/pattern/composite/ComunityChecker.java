package pattern.composite;

/**
 *
 * @author ramudu
 */
public class ComunityChecker {

    public static void main(String[] args) {
        Individual p1 = new Individual("Person 1");
        Individual p2 = new Individual("Person 2");
        Individual p3 = new Individual("Person 3");
        Individual p4 = new Individual("Person 4");

        Group group1 = new Group();
        group1.addPerson(p1);
        group1.addPerson(p2);
        
        Group group2 = new Group();
        group2.addPerson(p3);
        group2.addPerson(p4);
        
        Group group3 = new Group();
        group3.addPerson(group1);
        group3.addPerson(group2);
        
        group1.display();
        group2.display();
        group3.display();
        
        
    }

}
