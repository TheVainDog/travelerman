package com.vaindog.travelerman.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {

	@Id
	private ObjectId _id;
	private String email;
	private String password;
}
