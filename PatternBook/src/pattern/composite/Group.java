package pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ramudu
 */
public class Group implements Community{
    private ArrayList members = new ArrayList();

      
    public void addPerson(Community community){
        this.members.add(community);
        
    }
    
    
     @Override
    public void display() {
         for (Iterator member = members.iterator(); member.hasNext();) {
             Community nextCommunity = (Community) member.next();
             nextCommunity.display();
             
         }
        
    }

    /**
     * @return the members
     */
    public ArrayList getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(ArrayList members) {
        this.members = members;
    }

}
