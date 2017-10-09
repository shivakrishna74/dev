package com.yash.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class ReadS3 {
	
	public static void main(String args[]) throws IOException
	{
		AmazonS3 s3Client = new AmazonS3Client(); 
		S3Object object = s3Client.getObject(
                new GetObjectRequest("shiva007", "new2.txt"));
		InputStreamReader isr = new InputStreamReader(object.getObjectContent());
		BufferedReader br=new BufferedReader(isr);
		String line;
		int sum=0;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		}
		
	}

