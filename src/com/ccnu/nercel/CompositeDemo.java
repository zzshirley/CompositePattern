package com.ccnu.nercel;

import java.io.File;

public class CompositeDemo {
	public static void main(String[] args) {
		Inode inoder =new Inoder("/Documents");
		try {
			createtree(inoder);
			} catch (Exception e) {
				e.printStackTrace();
				}
		inoder.display();		
	}
	public static void createtree(Inode inode) throws Exception{
		File file = new File(inode.nodename);
		File[] f=file.listFiles();
		for(File fi :f) {
			if(fi.isFile()) {
				file filer =new file(fi.getAbsolutePath());
				inode.add(filer);
			}
			if(fi.isDirectory()) {
				Inoder inoder = new Inoder(fi.getAbsolutePath());
				inode.add(inoder);
				createtree(inoder);
			}
		}
	}
	
}
