package com.kovitad.repository.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import com.mongodb.Mongo;
import com.mongodb.WriteConcern;

//@Configuration
public class ApplicationConfig extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "e-shop";
	}

	@Override
	public Mongo mongo() throws Exception {
		Mongo mongo = new Mongo();
		mongo.setWriteConcern(WriteConcern.SAFE);
		return mongo;
	}

	@Override
	public String getMappingBasePackage() {
		return "com.kovitad.domain";
	}
}
