package core;

public enum Resolutions {
    iPhone_X("375x812"),
    iPad("768x1024"),
    iPad_PRO("1024x1366"),
    iPhone_6_7_8("375x667");

    private String value;

    Resolutions(String device) {
        this.value = device;
    }

    public String getValue(){
        return value;
    }
}
