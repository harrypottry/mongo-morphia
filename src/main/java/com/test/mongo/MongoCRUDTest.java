package com.test.mongo;

import com.mongodb.*;

/**
 * Created by
 */
public class MongoCRUDTest {

    public static void main(String[] args) {

        Mongo mongo = new Mongo("192.168.200.111",27017);

        DB db = new DB(mongo,"test-demo");

        DBCollection collection =  db.getCollection("member");

        //类比法：JDBC,相对来说比较底层
        DBObject dbObject = new BasicDBObject();
        dbObject.put("name","Tom");
        dbObject.put("age",18);
        dbObject.put("addr","HunanChangsha");


        collection.insert(dbObject);

        DBCursor cursor = collection.find();
        for (DBObject obj : cursor){
            System.out.println(obj);
        }

        //Morphia,  MongoDB界的一个ORM鼻祖

        //MongoTemplate


    }

}
