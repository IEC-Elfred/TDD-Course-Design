package com.snake.extra;

import java.applet.AudioClip;

import java.io.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;


public class Music  {

	private  AudioClip aau;

	public  void musicstart(String musicFile){
		try {
			URL cb;
			//引音乐文件
			File f = new File(musicFile);
			cb = f.toURL();
			aau = Applet.newAudioClip(cb);
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 循环播放
	 */
	public void musicLoopplay(){
		aau.loop();
	}

	public boolean musicLoopplay(boolean isSuccess){
		aau.loop();
		return true;
	}

	/**
	 * 单次播放
	 */
	public void musicPlay(){
		aau.play();//aau.play()
	}
	public boolean musicPlay(boolean isSuccess){
		aau.play();
		return true;
	}
	/**
	 * 停止播放
	 */
	public  void musicStop(){
		aau.stop();
	}
	public boolean musicStop(boolean isSuccess){
		aau.stop();
		return true;
	}
	public void setAau(AudioClip aau){
		this.aau = aau;
	}

}
