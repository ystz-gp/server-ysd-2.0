package com.java.b2cdemo;


import com.mind.platform.system.base.DataRow;

public class CreateRequestFileNoticeReportDemo {

	public static void main(String[] agrs){
		DataRow requestDataRowDto = ReportDemo.initFileNoticeReportDemo();
		
		String msg = ReportDemo.encryptionFileNoticeDemo(requestDataRowDto);
		
//		msg = "PFNUU1BhY2thZ2U+PEVuY3J5cHRlZFRleHQ+aWV1TFZmUFhuWUg3S3cxcEVUaDNRYWNvTDJJQVFlRjJYMEltSFdxRC92T002bFZCZHNCZDFxeE52elRCNFhObzMwVVRWUmRXSWo4NzNOcHBWRmdraEtobkxPOHhYUkZzWndoZFhWemdsS2dGZE1uYk0zbUk1S2RsWlB6aTRUWG9PWE1oM000STNkUWxZdzNBRXNFcmlyTitnZnFzelRRb3lSSjhSUGNXeG11NUpYbVp1d1NOM3dlckNINzc3ZFRQcW53Umh4QkNKa3BKQmRpUjg0eVdWT3NoNHFiYll6SDFEUk85NjhHNlF0aXFmQkdIRUVJbVNzOUM0bTJ0KzQrTmVqeGlvSnMwYjRpY25XOUl2ZDllMFBjOWo3UmRxTGN5MzFxeE5zMU1mRzNLSFVHUURwM2xkN2REZVlPVnA1b1FMNUtrdWdqUllHMDBuczB0Ukw0ZlFmajAzd016cUJydkRJTmxXYUNtNHBSQUNiZTgyWWdQUFFaNXhyek12bmxSMi8xUko5dmdiWVhhblpLZXFtTjllay9IamVTME1PUXVMa01JZFJjWVViTDBoQzF3M3dxOWFhMFh2VXJGdFpSWVdmRGp3OHlvSmxIa0lJcTI2c29zaEg3V25rTk4xTXE5SFkyYk1rZE9qeE53QUN0WE5LbERXVnhWMFhtalFQeUdyMVZpaVFUVm5JQi8wYzUwVUhmdmVFOGVHVlR2YTY0dU13S2tPai9PZ1pwcGJ2bU0zdFpvWmNVV0crR3RoSHlwMWlRUXQxRTVVQXRHNFNOR1VsK1Y0L3hYbFRYQWU3OFowbkNtTzRSNzkzT1ZxR3k3Y0hQL3dDT2Y1THVGS3lVdVVXQWh3SzdrdXJJam4rUzdoU3NsTGk4V2wrV1NpelljQmlwSnNTb3l0d2FmWFgvb0h1b2ZwZkwxS3J4enBsdFJ1aVdMaVZ0VXdkK2xiTDBHU1hXeEFqeElGZVo1L1I1R1RlRXNEakVwTFUvN292TzI0RzZFVjNibWxyWFBReGo1dlNGeSszaHU3QlhpZU0vMmRBU2dSTDdZT2loUG5TdjRLZFE1d29DaUJIZSsyRG9vVDUwcitCcWptUC9WcUlxOG5QSklZUUN5Z0RjOXNQUDVwZkdqdVVkSWk4T3pGd1dNakI3NUtXZnlRSTluZkQxYWdvcGtvYjdybFJzUGRUZFA8L0VuY3J5cHRlZFRleHQ+PEtleUluZm8+PFJlY2VpdmVyWDUwOUNlcnRTTj45MDg1MzM3NjYzNDc2NjI3OTM2OTQxNjA3MDc0Mjk0NDcxNzA0PC9SZWNlaXZlclg1MDlDZXJ0U04+PEVuY3J5cHRlZEtleT5qWEI2TVJMUXl5UTRGMGpSTGxPWEtabm1MUDZLSW1jQmJJY2V2cmF1UDdRSHlOcjFpTE1WRmlJWE9Zb0hFajYvMzFmUFovVkpiaGFvU3NjRUdtOUc4YXJQelY5OWJydWplRFc1VEZJY0hvWG0rTEI3VHFHK2MxUlV5SXdBK3k5Q29jMWwweExoU2lnUC80c0QrV29XMlE3NHFGQWcrWmNWSjdHK3FzREpJMUU9PC9FbmNyeXB0ZWRLZXk+PC9LZXlJbmZvPjwvU1RTUGFja2FnZT4=";		
		DataRow agreementsignDaterow = ReportDemo.decryptionFileNoticeDemo(msg);
		System.out.println(agreementsignDaterow);
	}
	
}