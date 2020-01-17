package user;

import org.springframework.beans.factory.annotation.Autowired;
import services.MongoUserServices;

public class UserServices {

    @Autowired
    MongoUserServices mongoUserServices;

    public void insertUserDetails(User user) {

        mongoUserServices.insertData(user);
    }

    public boolean deleteUser(String email) {
        if (mongoUserServices.deleteData(email))
            return true;
        return false;
    }

    public User searchUser(String email) {

        return mongoUserServices.searchData(email);
    }


}
