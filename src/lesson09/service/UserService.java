package lesson09.service;

import lesson09.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //    @Autowired
//    @Qualifier("UserRepository")
    private UserRepository userRepository;

//    @Autowired
//    @Qualifier("UserRepository")
//    public void setUserRepository(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }

    @Autowired
    public void setUserRepository(@Qualifier("UserRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        System.out.println("UserService add");
        userRepository.save();
    }
}
