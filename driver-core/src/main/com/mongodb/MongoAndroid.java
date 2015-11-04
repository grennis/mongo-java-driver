package com.mongodb;

public class MongoAndroid {
    public static void init() {
        java.security.Security.addProvider(new gnu.javax.crypto.jce.GnuSasl());
    }
}
