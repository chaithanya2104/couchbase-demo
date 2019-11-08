package com.example.couchbasedemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Collections;
import java.util.List;

@Configuration
public class MyCouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("127.0.0.1");
    }

    @Override
    protected String getBucketName() {
        return "persons";
    }

    @Override
    protected String getBucketPassword() {
        return "password";
    }

    @Override
    protected String getUsername() {
        return "academy";
    }
}
