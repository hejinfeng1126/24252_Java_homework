package com.huawei.classroom.student.h58;

import java.io.File;

public class FTPFile {
	/**
	 * 这个类下面所有的代码都没有实现，请实现这个类里面的方法，如果有必要可以增加适当的方法和类
	 * @param server
	 * @param pathFileName
	 * @throws Exception
	 */

	public FTPFile(MyFTPServer server, String pathFileName) throws Exception {

	}

	/**
	 * 按文件名升序的方式列出所有的目录和文件，和java中File.listFiles功能类似
	 * @return
	 * @throws Exception
	 */
	public FTPFile[] listFiles() throws Exception {
		return null;
	}

	/**
	 * 是否是目录
	 * @return
	 * @throws Exception
	 */
	public boolean isDirectory() throws Exception {
		return false;
	}

	/**
	 * 是否是文件
	 * @return
	 * @throws Exception
	 */
	public boolean isFile() throws Exception {
		return false;
	}
	/**
	 * 返回相对于ftp_home的路径+文件名
	 * @return
	 * @throws Exception
	 */
	public String getPathFileName() throws Exception {
		return  "";
	}
	/**
	 * 如果是文件，返回文件大小
	 * @return
	 * @throws Exception
	 */
	public long length() throws Exception {
		return 0;
	}
	/**
	 * 如果是文件，把文件全部内容读入到byte[]中，不需要考虑内存不够情况
	 * @return
	 * @throws Exception
	 */
	public byte[] readToBytes() throws Exception {
		return null;
	}

}
