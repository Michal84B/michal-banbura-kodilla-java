package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "Marek84", 'M',
                1984, 04, 04, 123));
        userList.add(new ForumUser(002, "Kasia18", 'F',
                2000, 01,02, 56));
        userList.add(new ForumUser(003,"Grześ15", 'M',
                2003, 02, 15, 40));
        userList.add(new ForumUser(129, "GrażynaPL", 'F',
                1980, 07, 25, 203));
        userList.add(new ForumUser(184, "Waldek", 'M',
                1970, 09, 21, 0));
    }
}
