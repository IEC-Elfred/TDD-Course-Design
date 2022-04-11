package com.snake.extra;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FileReadWriteTest {
    private Filereadwrite mFilereadwrite;
    private String[] scores ;
    @Before
    public void setUp() throws Exception {
        mFilereadwrite = new Filereadwrite();
        scores = new String[]{"44","59","60","11"};
        mFilereadwrite.score = scores;
        System.out.println("FileReadWrite test setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("FileReadWrite test tearDown");
    }

    @Test
    public void isInRank() {
        int scoreNow = 55;
        Assert.assertTrue(this.mFilereadwrite.isInRank(scoreNow));
    }

}
