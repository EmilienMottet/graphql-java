package com.howtographql.hackernews;

public class User {

  private final String id;

  private final String email;

  private final String password;

  private final String name;

  public User(String name, String email, String password) {
    this(null, name, email, password);
  }

  public User(String id, String name, String email, String password) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public String getId() {
    return id;
  }
}
