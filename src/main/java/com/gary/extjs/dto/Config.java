package com.gary.extjs.dto;


public class Config {
	private String modularPath = "desktop/model";

	private String functionPath = "desktop/function";

	private String com = "Gary";

	private String debugSuffix = "";
	
	private String gzipCharacter = "UTF-8";
	
	private String modularTplPath = "Modular.tpl";
	
	private String modularIconPath = "icons";
	
	private String modularIconTplPath = "Modular-Icon.tpl";
	
	private String functionTplPath = "Function.tpl";
	
	private double iconMaxW = 46;
	
	private double iconMaxH = 46;
	
	private double iconMinW = 16;
	
	private double iconMinH = 16;
	
	private String ROLE_SESSION_VAL_NAME = "Gary-Extjs-Desktop-Role"; 
	
	private String USER_SESSION_VAL_NAME = "Gary-Extjs-Desktop-User";
	
	private boolean nodejs = false;
	
	private String nodejsServerPath = null;
	
	private String nodejsIp = "localhost";
	
	private int nodejsPort = 2013;
	
	private int nodejsSocketIoPort = 4567;
	
	private boolean runNode = true;
	
	private int monitoringPush = 2;
	
	private String imageMagickPath;

	public void setModularPath(String modularPath) {
		this.modularPath = modularPath;
	}

	public void setFunctionPath(String functionPath) {
		this.functionPath = functionPath;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public void setDebugSuffix(String debugSuffix) {
		this.debugSuffix = debugSuffix;
	}

	public void setGzipCharacter(String gzipCharacter) {
		this.gzipCharacter = gzipCharacter;
	}

	public String getModularPath() {
		return modularPath;
	}

	public String getFunctionPath() {
		return functionPath;
	}

	public String getCom() {
		return com;
	}

	public String getDebugSuffix() {
		return debugSuffix;
	}

	public String getGzipCharacter() {
		return gzipCharacter;
	}

	public String getModularTplPath() {
		return modularTplPath;
	}

	public void setModularTplPath(String modularTplPath) {
		this.modularTplPath = modularTplPath;
	}

	public String getModularIconPath() {
		return modularIconPath;
	}

	public void setModularIconPath(String modularIconPath) {
		this.modularIconPath = modularIconPath;
	}

	public String getModularIconTplPath() {
		return modularIconTplPath;
	}

	public void setModularIconTplPath(String modularIconTplPath) {
		this.modularIconTplPath = modularIconTplPath;
	}

	public double getIconMaxW() {
		return iconMaxW;
	}

	public void setIconMaxW(double iconMaxW) {
		this.iconMaxW = iconMaxW;
	}

	public double getIconMaxH() {
		return iconMaxH;
	}

	public void setIconMaxH(double iconMaxH) {
		this.iconMaxH = iconMaxH;
	}

	public double getIconMinW() {
		return iconMinW;
	}

	public void setIconMinW(double iconMinW) {
		this.iconMinW = iconMinW;
	}

	public double getIconMinH() {
		return iconMinH;
	}

	public void setIconMinH(double iconMinH) {
		this.iconMinH = iconMinH;
	}

	public String getFunctionTplPath() {
		return functionTplPath;
	}

	public void setFunctionTplPath(String functionTplPath) {
		this.functionTplPath = functionTplPath;
	}

	public String getROLE_SESSION_VAL_NAME() {
		return ROLE_SESSION_VAL_NAME;
	}

	public void setROLE_SESSION_VAL_NAME(String rOLE_SESSION_VAL_NAME) {
		ROLE_SESSION_VAL_NAME = rOLE_SESSION_VAL_NAME;
	}

	public boolean isNodejs() {
		return nodejs;
	}

	public void setNodejs(boolean nodejs) {
		this.nodejs = nodejs;
	}

	public String getNodejsIp() {
		return nodejsIp;
	}

	public void setNodejsIp(String nodejsIp) {
		this.nodejsIp = nodejsIp;
	}

	public int getNodejsPort() {
		return nodejsPort;
	}

	public void setNodejsPort(int nodejsPort) {
		this.nodejsPort = nodejsPort;
	}

	public String getUSER_SESSION_VAL_NAME() {
		return USER_SESSION_VAL_NAME;
	}

	public void setUSER_SESSION_VAL_NAME(String uSER_SESSION_VAL_NAME) {
		USER_SESSION_VAL_NAME = uSER_SESSION_VAL_NAME;
	}

	public String getNodejsServerPath() {
		return nodejsServerPath;
	}

	public void setNodejsServerPath(String nodejsServerPath) {
		this.nodejsServerPath = nodejsServerPath;
	}

	public boolean isRunNode() {
		return runNode;
	}

	public void setRunNode(boolean runNode) {
		this.runNode = runNode;
	}

	public int getNodejsSocketIoPort() {
		return nodejsSocketIoPort;
	}

	public void setNodejsSocketIoPort(int nodejsSocketIoPort) {
		this.nodejsSocketIoPort = nodejsSocketIoPort;
	}

	public int getMonitoringPush() {
		return monitoringPush;
	}

	public void setMonitoringPush(int monitoringPush) {
		this.monitoringPush = monitoringPush;
	}

	public String getImageMagickPath() {
		return imageMagickPath;
	}

	public void setImageMagickPath(String imageMagickPath) {
		this.imageMagickPath = imageMagickPath;
	}
}
