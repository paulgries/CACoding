package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String clear = null;
    private String clearError = null;

    public ClearState(ClearState copy) {
        clear = copy.clear;
        clearError = copy.clearError;
    }

    public ClearState() {}

    public String getClear() {
        return clear;
    }

    public String getClearError() {
        return clearError;
    }

    public void setClear(String clear) {
        this.clear = clear;
    }

    public void setClearError(String clearError) {
        this.clearError = clearError;
    }
}
