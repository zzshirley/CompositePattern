package com.ccnu.nercel;


public class file extends Inode{
	
	String fileName;
	
	file(String fileName){
		super(fileName);
	}
	@Override
	void add(Inode inode) {
		// TODO Auto-generated method stub
	}
	@Override
	void remove(Inode inode) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println(nodename);
	}

}
