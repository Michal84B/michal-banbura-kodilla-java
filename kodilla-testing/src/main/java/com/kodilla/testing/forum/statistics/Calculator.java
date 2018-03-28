package com.kodilla.testing.forum.statistics;

public class Calculator {
    Statistics statistics;

    int usersQty;
    int postsQty;
    int commentsQty;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersQty = statistics.usersNames().size();
        this.postsQty = statistics.postsCount();
        this.commentsQty = statistics.commentsCount();
        this.avgPostsPerUser = (double) postsQty / usersQty;
        this.avgCommentsPerUser = (double) commentsQty / usersQty;
        this.avgCommentsPerPost = (double) commentsQty / postsQty;
    }

    public int getUsersQty(){
        return usersQty;
    }
    public int getPostsQty(){
        return postsQty;
    }
    public int getCommentsQty(){
        return commentsQty;
    }
    public double getAvgPostsPerUser(){
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
