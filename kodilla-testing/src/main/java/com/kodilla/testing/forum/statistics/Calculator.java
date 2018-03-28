package com.kodilla.testing.forum.statistics;

public class Calculator {
    private Statistics statistics;

    private int usersQty;
    private int postsQty;
    private int commentsQty;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

   // public Calculator(Statistics statistics) {
     //   this.statistics = statistics;
   // }

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
    public void showStatistics(){
        System.out.println("Avarge Posts per user: " + avgPostsPerUser + "Avarge comments per user: " + avgCommentsPerUser +
                "Avarge comments per post: " + avgCommentsPerPost);
    }
}
