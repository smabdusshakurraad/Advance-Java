import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to find contact based on criteria
 * @author Abdus Sakur
 */
public class ContactService {
    /**
     * find out list of contacts of aged between 18 to 25
     * @param contacts {@link List<Contact>}
     * @return {@link List<Contact>}
     */
    public List<Contact> findContactAgeBetween18And25(List<Contact> contacts){
        List<Contact> contactAgedBetween18And25 = new ArrayList<>();
        for(Contact contact : contacts){
            if(18 <= contact.getAge() && contact.getAge() <= 25){
                contactAgedBetween18And25.add(contact);
            }
        }
        return contactAgedBetween18And25;
    }

    /**
     * find out list of male contacts of aged between 18 to 25
     * @param contacts {@link List<Contact>}
     * @return {@link List<Contact>}
     */
    public List<Contact> findMaleContactAgeBetween18And25(List<Contact> contacts){
        List<Contact> contactMaleAgedBetween18And25 = new ArrayList<>();
        for(Contact contact : contacts){
            if(18 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.MALE){
                contactMaleAgedBetween18And25.add(contact);
            }
        }
        return contactMaleAgedBetween18And25;
    }

    /**
     * find out list of female contacts of aged between 18 to 25
     * @param contacts {@link List<Contact>}
     * @return {@link List<Contact>}
     */
    public List<Contact> findFemaleContactAgeBetween18And25(List<Contact> contacts){
        List<Contact> contactFemaleAgedBetween18And25 = new ArrayList<>();
        for(Contact contact : contacts){
            if(18 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.FEMALE){
                contactFemaleAgedBetween18And25.add(contact);
            }
        }
        return contactFemaleAgedBetween18And25;
    }

    /**
     * Method for find out contact based on given criteria given in the argument
     * Since 2nd parameter is an interface. So, it can receive anonymous class.
     * @param contacts {@link List<Contact>}
     * @param criteria {@link FilterCriteria}
     * @return {@link List<Contact>}
     */
    public List<Contact> findContact(List<Contact> contacts, FilterCriteria criteria){
        List<Contact> matchedContact = new ArrayList<>();
        for(Contact contact : contacts){
            if(criteria.match(contact)){
                matchedContact.add(contact);
            }
        }
        return matchedContact;
    }

    // another example of anonymous class and replacing it with lambda functio
    File file = new File("./");
    File[] files = file.listFiles(new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.isFile();
        }
    });
    // using lambda expression
    File[] fileLambdaList = file.listFiles(pathname -> pathname.isFile());
    //using method reference
    File[] fileMethodReferenceList = file.listFiles(File::isFile);
}
