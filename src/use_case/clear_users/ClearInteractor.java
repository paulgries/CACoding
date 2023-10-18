package use_case.clear_users;

// TODO Complete me
import entity.User;
import java.util.List;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        List<User> users = userDataAccessObject.extractUsers();
        String result = "";

        for (User user : users) {
            result += user.getName() + "\n";
        }

        ClearOutputData clearOutputData = new ClearOutputData(result);
        clearPresenter.prepareClearView(clearOutputData);
    }
}
