package com.pojo;

import java.io.Serializable;

public class File1 implements Serializable {

	private static final long serialVersionUID = -6446936696907562299L;

	private int fileId;
	private String fileName;
	private int folderId;
	private String typeId;
	private int userId;
	private String createTime;
	private String owner;
	private int status;
	private String hdfsPath;
	private String fileSize;
	private String mark;
	private String fileDeletetime;
	private String fileStore;

	public File1() {
		super();
	}
	public File1(int fileId, String fileName, String typeId, String createTime, String fileDeletetime, int userId,
			int folderId, String fileSize, int status, String mark, String fileStore) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.typeId = typeId;
		this.createTime = createTime;
		this.fileDeletetime = fileDeletetime;
		this.userId = userId;
		this.folderId = folderId;
		this.fileSize = fileSize;
		this.status = status;
		this.mark = mark;
		this.fileStore = fileStore;
	}
	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getFolderId() {
		return folderId;
	}

	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getHdfsPath() {
		return hdfsPath;
	}

	public void setHdfsPath(String hdfsPath) {
		this.hdfsPath = hdfsPath;
	}

	
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileDeletetime() {
		return fileDeletetime;
	}
	public void setFileDeletetime(String fileDeletetime) {
		this.fileDeletetime = fileDeletetime;
	}
	public String getFileStore() {
		return fileStore;
	}
	public void setFileStore(String fileStore) {
		this.fileStore = fileStore;
	}
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
