import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ContactsBook {
   private List<Contact> contacts;

   public ContactsBook(List<Contact> contacts) {
      this.contacts = contacts;
   }

   public ContactsBook() {
      this.contacts = new LinkedList<>();
   }

   public void addContact(Contact contact) {
      this.contacts.add(contact);
   }

   public void setContacts(List<Contact> contacts) {
      this.contacts = contacts;
   }

   public List<Contact> getContacts() {
      return contacts;
   }

   public List<Contact> SortContact() {
      Collections.reverse(contacts);
      return contacts;
   }
}
