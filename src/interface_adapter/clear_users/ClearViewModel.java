package interface_adapter.clear_users;

// TODO Complete me
import interface_adapter.ViewModel;
import use_case.clear_users.ClearOutputData;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    private String response;
    private ClearState state = new ClearState();
    public ClearViewModel() { super("clear"); }
    public void setState(ClearState state) {  this.state = state; }
    public void setResponse(String response) { this.response = response; }
    public String getResponse() {return response; }
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    @Override
    public void firePropertyChanged() { support.firePropertyChange("state", null, this.state); }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
