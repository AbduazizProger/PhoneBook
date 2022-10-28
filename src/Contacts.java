public class Contacts {
    private String first;
    private String last;
    private String number;
    public Contacts(String first, String last, String number) {
        this.first = first;
        this.last = last;
        this.number = number;
    }

    public String getFirst() {
        return this.first;
    }

    public String getLast() {
        return this.last;
    }

    public String getNumber() {
        return this.number;
    }
}
