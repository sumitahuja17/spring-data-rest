package com.ahuja.sumit.id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.ahuja.sumit.id.repository"})
public class CouchbaseServerConfig extends AbstractCouchbaseConfiguration{

    @Autowired
    private AppProperties prop;
    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList("127.0.0.1");
        //return prop.getHosts();
    }

    @Override
    protected String getBucketName() {
        return "sample";
    }

    @Override
    protected String getBucketPassword() {
        return "sample123";
    }
}
