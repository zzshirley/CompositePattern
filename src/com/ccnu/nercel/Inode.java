package com.ccnu.nercel;

public abstract class Inode {
	
	String nodename;
	Inode(String nodename){
		this.nodename=nodename;		
	}
	abstract void add(Inode inode);
	
	abstract void remove(Inode inode);
	
	abstract void display();
	
	
}
