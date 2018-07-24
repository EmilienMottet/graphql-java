package com.howtographql.hackernews;

public class Link {
  private final String url;
  private final String descritpion;

  public Link(String url, String descritpion) {
    this.url = url;
    this.descritpion = descritpion;
  }

  public String getUrl() {
    return url;
  }

  public String getDescription() {
    return descritpion;
  }

}
