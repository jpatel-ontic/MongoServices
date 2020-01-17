package services;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import user.User;

public class MongoUserServices {


    private DataServices mongoService;
    private DB database;

    @Autowired
    public MongoUserServices(DataServices mongoService) {
        this.mongoService = mongoService;
        this.database = mongoService.mongoClient.getDB("User");
    }


    public void insertData(User user) {
        BasicDBObject obj = new BasicDBObject().append("email", user.getEmail()).append("fname", user.getFirstName()).append("lname", user.getLastName());
        DBCollection users = database.getCollection("users");
        users.insert(obj);
    }

    public boolean deleteData(String key) {
        DBCollection users = database.getCollection("users");
        users.remove(new BasicDBObject("email", key));
        return true;
    }

    public User searchData(String key) {
        DBCollection collection = database.getCollection("users");
        BasicDBObject query = new BasicDBObject();
        query.put("email", key);
        DBCursor cursorDetails = collection.find(query);
        if (cursorDetails.size() == 0) {
            System.out.println("No data available for this user");
            return null;
        }
        String fname = (String) cursorDetails.one().get("fname");
        String lname = (String) cursorDetails.one().get("lname");
        User user = new User.UserBuilder(key).firstName(fname).lastName(lname).build();
        return user;
    }


}
