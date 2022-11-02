import java.util.List;

/**
 * ContactApp main class
 * @author Abdus Sakur
 */
public class ContactApp {
    public static void  main(String[] args){
        //Generating list of contacts
        List<Contact> contacts = List.of(new Contact("Raad", "ra@gmail.com", 23, Contact.Gender.MALE),
                new Contact("Noor", "n@y.com", 25, Contact.Gender.FEMALE),
                new Contact("Lili", "l@y.com", 27, Contact.Gender.FEMALE),
                new Contact("Will Smith", "will@gmail.com", 50, Contact.Gender.MALE));

        // initializing reference of Contact Service
        ContactService contactService = new ContactService();

        /* Calling using anonymous class and over ridding the only method of interface
         based on the criteria we need */
        List<Contact> contactAged18TO25 = contactService.findContact(contacts, new FilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                return 18<= contact.getAge() && contact.getAge() <= 25;
            }
        });

        /* Replacing anonymous class with lambda expression, we can only use lambda expression instead of anonymous class
        when it has a only one method */
        List<Contact> contactMaleAged18To25 =
                contactService.findContact(contacts,(Contact contact)->{
                    return 18<= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.MALE;
                });

        for(Contact contact : contactAged18TO25){
            System.out.println(contact.getName());
        }
    }
}
