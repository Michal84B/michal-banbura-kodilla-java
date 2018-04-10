package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char male;
    private final LocalDate birthday;
    private final int postsQty;

    public ForumUser(final int userId, final String username, final char male, final int yearOfBirth, final int monthOfBirth,
                     final int dayOfBirth, final int posts) {
        this.userId = userId;
        this.username = username;
        this.male = male;
        this.birthday = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQty = posts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getMale() {
        return male;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPosts() {
        return postsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", male=" + male +
                ", birthday=" + birthday +
                ", postsQty=" + postsQty +
                '}';
    }
}
