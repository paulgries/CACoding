package interface_adapter.clear_users;

// TODO Complete me
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import interface_adapter.ViewManagerModel;

public class ClearPresenter implements ClearOutputBoundary {
    final ClearViewModel clearViewModel;
    final ViewManagerModel viewManagerModel;
    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareClearView(ClearOutputData outputData) {
        clearViewModel.setResponse(outputData.getUsernames());
    }
}
