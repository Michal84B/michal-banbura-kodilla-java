package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultUserMap = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getBirthday().getYear() >= 1998)
                .filter(ForumUser -> ForumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
    }
}
