package com.myapp.entity;

public class BatchInfo {

  private String batchName;
  private int batchID;
  private String trainerName;
public BatchInfo(String batchName, int batchID, String trainerName) {
	super();
	this.batchName = batchName;
	this.batchID = batchID;
	this.trainerName = trainerName;
}
public String getBatchName() {
	return batchName;
}
public void setBatchName(String batchName) {
	this.batchName = batchName;
}
public int getBatchID() {
	return batchID;
}
public void setBatchID(int batchID) {
	this.batchID = batchID;
}
public String getTrainerName() {
	return trainerName;
}
public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
}
  
  
}
