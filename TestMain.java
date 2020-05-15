package com.deere.u90787.saweb.domain.recording;

/**
 * 
 */

/**
 * @author ab04873
 *
 */
public class TestMain {

	public static void main(String[] args) 
	{
			RecordingParser test = new RecordingParser();
			RecordingData data;
			try {
				data = test.parseRecording("C:\\Users\\sn06854\\Downloads\\4f564901a4790f7c04f5658f32a581057b5b01369fa6");
				System.out.println(data);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
