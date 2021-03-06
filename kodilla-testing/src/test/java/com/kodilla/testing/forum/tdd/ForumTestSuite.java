package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

//Test Suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is begining of all Tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        //When
        forumUser.addPost("mrSmith", "Hello everyone, this is my first contribution here!");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrSmith");
        //When
        forumUser.addComment(thePost, "Thank you for all good words!", "mrSmith");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    public void getPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrSmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrivedPost);
    }
    @Test
    public void getComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrSmith");
        forumUser.addComment(thePost,theComment.getCommentBody(), theComment.getAuthor());
        //When
        ForumComment retrivedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrivedComment);
    }
    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrSmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrSmith");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrSmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrSmith");
        forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
