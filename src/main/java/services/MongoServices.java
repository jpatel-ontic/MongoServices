package services;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

//

public class MongoServices {
    //public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient();
//        DB database = mongoClient.getDB("CURD");
//        System.out.println("Created");
//        DB database = mongoClient.getDB("Student");
//        DBCollection collection = database.getCollection("Student");
//        DBObject student=new BasicDBObject()
//                .append("Id","201601220")
//                .append("Name","jeet");
//        System.out.println("Done");
//        collection.insert(student);

//        MongoDatabase db = mongoClient.getDatabase("CURD");
//        Document course=new Document();
//        course.append("courseID", "M101P");
//        course.append("title", "MongoDB for Developers");
//        course.append("startDate", "15 Mar 2016 at 17:00 UTC");
//        course.append("endDate", "03 May 2016 at 17:00 UTC");
//        course.append("instructor","Andrew Erlichson");
//        course.append("aboutCourse", "Learn everything you need to know to get started building a MongoDB-based app");
//        db.getCollection("courses").insertOne(course);





//        DBCollection courses = database.getCollection("courses");
//        DBObject course=new BasicDBObject();
//        ((BasicDBObject) course).append("courseID", "M101P");
//        ((BasicDBObject) course).append("title", "MongoDB for Developers");
//        ((BasicDBObject) course).append("startDate", "15 Mar 2016 at 17:00 UTC");
//        ((BasicDBObject) course).append("endDate", "03 May 2016 at 17:00 UTC");
//        ((BasicDBObject) course).append("instructor","Andrew Erlichson");
//        ((BasicDBObject) course).append("aboutCourse", "Learn everything you need to know to get started bulding a app");
//        courses.insert(course);
//
//        DBCursor docs= database.getCollection("courses").find();
//        System.out.println("jeeta");
//        for(DBObject d: docs){
//
//            System.out.println(d);
//        }

//        database.getCollection("courses")
//                .update(new BasicDBObject("courseID", "M101P"),new BasicDBObject("$set", new BasicDBObject("endDate", "15 Mar 2016 at 17:00 UTC")));




   // }
}
