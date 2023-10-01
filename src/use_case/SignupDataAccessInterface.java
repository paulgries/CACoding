package use_case;

import entity.User;

public interface SignupDataAccessInterface {
    boolean existsByName(String identifier);

    void save(User user);
}
