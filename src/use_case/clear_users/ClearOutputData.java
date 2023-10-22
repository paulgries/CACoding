package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private final String usernames;
    private boolean useCaseFailed;

    public ClearOutputData(String usernames, boolean useCaseFailed) {
        this.usernames = usernames;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsernames() { return usernames; }
}
