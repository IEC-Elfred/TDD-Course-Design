package com.snake.extra;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.applet.AudioClip;
import java.net.MalformedURLException;

public class MusicTest {
    private Music mMusic;

    @Before
    public void setUp() throws Exception {
        System.out.println("MusicTest test setUp");
        mMusic = new Music();
        mMusic.setAau(new AudioClip() {
            @Override
            public void play() {

            }

            @Override
            public void loop() {

            }

            @Override
            public void stop() {

            }
        });
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("MusicTest test tearDown");
    }

    @Test
    public void musicLoopplay(){
        Assert.assertTrue(mMusic.musicLoopplay(false));
    }

    @Test
    public void musicPlay(){
        Assert.assertTrue(mMusic.musicPlay(false));
    }

    @Test
    public  void musicStop(){
        Assert.assertTrue(mMusic.musicStop(false));
    }

}
