package com.liferay.amazonaws;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

public class AmazonAWSMain {

	public static void main(String[] args) {
		AmazonS3 amazonS3 = new AmazonS3Client();

		System.out.println(amazonS3);
	}

}