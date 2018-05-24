package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User henio = new Millenials("Henryk");
        User miecio = new YGeneration("Mieczysław");
        User sebix = new ZGeneration("Sebastian");

        //When
        String henioMedia = henio.sharePost();
        String miecioMedia = miecio.sharePost();
        String sebixMedia = sebix.sharePost();

        //Then
        Assert.assertEquals("Facebook", henioMedia);
        Assert.assertEquals("Twitter", miecioMedia);
        Assert.assertEquals("Snapchat", sebixMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User henio = new Millenials("Henryk");

        //When
        henio.socialChanger(new TwiterPublisher());
        String henioMedia = henio.sharePost();

        //Then
        Assert.assertEquals("Twitter", henioMedia);
    }
}
