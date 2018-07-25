package com.howtographql.hackernews;

import com.howtographql.hackernews.SigninPayload;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.howtographql.hackernews.User;

public class SigninResolver implements GraphQLResolver<SigninPayload> {

    public User user(SigninPayload payload) {
        return payload.getUser();
    }
}
