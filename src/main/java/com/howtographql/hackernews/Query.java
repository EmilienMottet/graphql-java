package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import java.util.List;

public class Query implements GraphQLRootResolver {

  private final LinkRepository linkRepository;

  public Query(LinkRepository linkRepository) {
    this.linkRepository = linkRepository;
  }

  public List<Link> allLinks(LinkFilter filter) {
    System.out.println("ici");

    List<Link> list = linkRepository.getAllLinks(filter);
    for (Link l : list) {
      System.out.println("l3 : " + l.getId());
      System.out.println("l3 : " + l.getUrl());
      System.out.println("l3 : " + l.getDescription());
    }
    return list;
  }
}
