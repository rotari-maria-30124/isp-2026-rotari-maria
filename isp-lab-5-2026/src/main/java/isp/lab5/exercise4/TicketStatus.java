package isp.lab5.exercise4;

public enum TicketStatus {
    NEW("New"),
    PAID("Paid"),
    USED("Used");

    private String displayName;

    TicketStatus(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return this.displayName;
    }
}
