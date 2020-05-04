package com.test.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

/**
 * Created by
 */
public class NativeCRUDTest {

    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://192.168.200.111:27017");

        MongoDatabase db = mongoClient.getDatabase("test-demo");

        MongoCollection coll = db.getCollection("t_member");


        Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));

        coll.insertOne(doc);

//        System.out.println(mongoClient);
    }
}
