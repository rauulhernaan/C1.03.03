package acme.entities.audit;


public enum Mark {
	
	A("A "),
    A_PLUS("A+"),
    B("B "),
    C("C "),
    F("F "),
    F_MINUS("F-");

    private final String value;

    private Mark(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
