package main;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    POLYGENDER("Polygender"),
    BIGENDER("Bigender"),
    UNKNOWN("Unknown"), 
    NON_BINARY("Non-binary"), 
    AGENDER("Agender"), 
    GENDERFLUID("Genderfluid"), 
    GENDERQUEER("Genderqueer");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Gender getGender(String gender) {
        for (Gender g : Gender.values()) {
            if (g.getValue().equalsIgnoreCase(gender)) {
                return g;
            }
        }
        return UNKNOWN;
    }
}
