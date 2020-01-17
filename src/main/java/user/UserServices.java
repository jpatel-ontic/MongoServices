package user;

import services.MongoUserServices;

public class UserServices {
    MongoUserServices mongoUserServices =new MongoUserServices();
    public void insertUserDetails(User user) {

        mongoUserServices.insertData(user);
    }
    public boolean deleteUser(String email){
        if(mongoUserServices.deleteData(email))
            return  true;
        return  false;
    }
    public User searchUser(String email){

        return mongoUserServices.searchData(email);
    }



}
