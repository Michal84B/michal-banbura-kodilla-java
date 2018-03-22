package com.kodilla.testing.forum;
import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName){
        //user name visible on forum
        this.name = name;
        //real name of user
        this.realName = realName;
    }
    public void addPost(String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }
    public void addComment(ForumPost thePost, String commentBody, String author){
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }
    public int getPostsQuantity(){
        return posts.size();
    }
    public int getCommentsQuantity(){
        return comments.size();
    }
    public ForumPost getPost(int postNumber){
        ForumPost thePost = null;
        if(postNumber >= 0 && postNumber < posts.size()){
            thePost = posts.get(postNumber);
        }
        return thePost;
    }
    public ForumComment getComment(int commentsNumber){
        ForumComment theComment = null;
        if(commentsNumber >= 0 && commentsNumber < comments.size()){
            theComment = comments.get(commentsNumber);
        }
        return theComment;
    }
    public boolean removePost(ForumPost thePost){
        boolean result = false;
        if(posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }
    public boolean removeComment(ForumComment theComment){
        boolean result = false;
        if(comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }
    public String getName(){
        return name;
    }
    public String getRealName(){
        return realName;
    }
}
