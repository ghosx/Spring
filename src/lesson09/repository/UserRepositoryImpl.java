package lesson09.repository;


import org.springframework.stereotype.Repository;

@Repository("UserRepository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepositoryImpl save");
    }
}
