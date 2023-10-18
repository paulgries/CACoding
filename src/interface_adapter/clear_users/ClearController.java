package interface_adapter.clear_users;

// TODO Complete me
import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    private final ClearInputBoundary clearInteractor;

    public ClearController(ClearInputBoundary clearInteractor) {
        this.clearInteractor = clearInteractor;
    }

    public void execute() {
        clearInteractor.execute();
    }
}
