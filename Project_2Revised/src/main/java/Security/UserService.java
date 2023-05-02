package Security;

import org.springframework.stereotype.Service;

public interface UserService {
    User findByUsername(String username);
    void save(User user);
}

