package com.test.mongo.morphia;

import com.test.mongo.morphia.entity.Member;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;

/**
 * Created by
 */
public class MorphiaTest {
    public static void main(String[] args) {

        //吗啡
        final Morphia morphia = new Morphia();
        Datastore ds = morphia.createDatastore(new MongoClient("192.168.200.111",27017),"test-demo");

        Member member = new Member();
        member.setName("Tom");
        member.setAge(18);
        member.setAddr("HunanChangsha");

        Key<Member> key = ds.save(member);

        System.out.println(key.getId());

    }
}
