package com.howtographql.hackernews;

public class Link {
  private final String id;
  private final String url;
  private final String descritpion;
  private final String userId;

  public Link(String url, String descritpion, String userId) {
    this(null, url, descritpion, userId);
  }

  public Link(String id, String url, String descritpion, String userId) {
    this.id = id;
    this.url = url;
    this.descritpion = descritpion;
    this.userId = userId;
  }

  public String getUrl() {
    return url;
  }

  public String getDescription() {
    return descritpion;
  }

  public String getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }
}
