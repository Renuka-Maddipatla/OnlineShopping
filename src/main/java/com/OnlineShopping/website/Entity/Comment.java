package com.OnlineShopping.website.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Comment")
public class Comment {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
private String text;

public Comment(String text) {
	super();
	this.text = text;
}

public Comment() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

	
}
