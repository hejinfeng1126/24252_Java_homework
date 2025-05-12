package com.huawei.classroom.student.h58;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.huawei.classroom.student.h958.ftp.FTPException;
import com.huawei.classroom.student.h958.ftpd.FTPDConnection;
 
/**
 * 
 * 
 */
public class MyFTPServer extends Thread{

	/**
	 * 这个类下面所有的代码都没有实现，请实现这个类里面的方法，如果有必要可以增加适当的方法和类
	 * @param ip
	 * @param port
	 * @param remoteHome
	 * @throws Exception
	 */
    public MyFTPServer(String ip,int port,String remoteHome ) throws Exception{    	

    }


    public boolean login(String username,String password) {
    	return true;
    }


}
