package addressbook.model;

public class GroupData {
    private final String g_name;
    private final String g_header;
    private final String g_footer;

    public GroupData(String g_name, String g_header, String g_footer) {
        this.g_name = g_name;
        this.g_header = g_header;
        this.g_footer = g_footer;
    }

    public String getG_name() {
        return g_name;
    }

    public String getG_header() {
        return g_header;
    }

    public String getG_footer() {
        return g_footer;
    }
}
