package com.cc.entity;

public class Topic {
private int Tid;
private String Tname;
public int getTid() {
	return Tid;
}
public void setTid(int tid) {
	Tid = tid;
}
public String getTname() {
	return Tname;
}
public void setTname(String tname) {
	Tname = tname;
}
@Override
public String toString() {
	return "Topic [Tid=" + Tid + ", Tname=" + Tname + "]\n";
}
public Topic(int tid, String tname) {
	super();
	Tid = tid;
	Tname = tname;
}
public Topic(){
	
}
}
