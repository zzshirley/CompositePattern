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
	void display(int depth) {
		// TODO Auto-generated method stub
		if(depth>0) {
			for(int i=0;i<depth;i++) {
				System.out.println('-');
			}
		}
		System.out.println("file-"+fileName);
	}
	@Override
	void searchfile(String name) {
		// TODO Auto-generated method stub
		
	}
}
