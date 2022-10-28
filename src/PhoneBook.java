import java.util.ArrayList;

public class PhoneBook {
    String name;
    ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    /**
     * Create a new phonebook with given name
     */
    public PhoneBook(String name) {
        this.name = name;
    }

    /**
     * Return the phonebook name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Insert a new contact at the end
     */
    public void add(String first, String last, String number) {
        Contacts c = new Contacts(first, last, number);
        contacts.add(c);
    }

    /**
     * Return the first contact
     */
    public String first() {
        return "First: " + contacts.get(0).getFirst() + ", " + "Last: " + contacts.get(0).getLast() + ", " + "Number: " + contacts.get(0).getNumber();
    }

    /**
     * Return the i-th contact (supposing that first
     * index is 1)
     */
    public String get(int i) {
        return "First: " + contacts.get(i - 1).getFirst() + ", " + "Last: " + contacts.get(i - 1).getLast() + ", " + "Number: " + contacts.get(i - 1).getNumber();
    }

    /**
     * Return a string containing the list of textual
     * representation of all contacts, separated by  ", ".
     * List starts with "("and ends with ")"
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < contacts.size(); i++) {
            s += contacts.get(i).getFirst() + " " + contacts.get(i).getLast() + " " + contacts.get(i).getNumber() + ", \n";
        }
        return s;
    }

    /**
     * Return the textual representation of first
     * contact containing "needle"
     */
    public String find(String needle) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirst().equals(needle)) {
                return contacts.get(i).getFirst() + " " + contacts.get(i).getLast() + " " + contacts.get(0).getNumber();
            }
            if (contacts.get(i).getLast().equals(needle)) {
                return contacts.get(i).getFirst() + " " + contacts.get(i).getLast() + " " + contacts.get(0).getNumber();
            }
            if (contacts.get(i).getNumber().equals(needle)) {
                return contacts.get(i).getFirst() + " " + contacts.get(i).getLast() + " " + contacts.get(0).getNumber();
            }
        }
        return null;
    }

}
