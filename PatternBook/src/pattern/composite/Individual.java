package pattern.composite;

/**
 *
 * @author ramudu
 */
public class Individual implements Community{
    private String name;

    public Individual(String name) {
        setName(name);
    }

    @Override
    public void display() {
        System.out.println("Name :"+ this.getName());
    }

      /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
