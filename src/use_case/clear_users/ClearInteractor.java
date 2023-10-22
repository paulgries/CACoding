package use_case.clear_users;

// TODO Complete me


import entity.User;
import use_case.login.LoginOutputData;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        String usernames = userDataAccessObject.delete();
        ClearOutputData clearOutputData = new ClearOutputData(usernames, false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
