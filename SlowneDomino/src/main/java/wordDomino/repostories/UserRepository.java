package wordDomino.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

/**
 * Created by RENT on 2017-10-27.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);
}
