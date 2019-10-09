package com.ycs.basbo.constants;

public class Constants {
	
	/**
	 * 系统运行环境
	 */
    public static final String SYS_ENV = "sys.runmode";
    public static final String SYS_ENV_DEV = "develop";
    public static final String SYS_ENV_PRD = "product";
    public static final String SYS_ENV_HOST_ADDR = "host.host_addr";
	   
	public static final String USER="USR";
	
	/**
     * 用户信息session相关
     */
	public static final String SESSION_EMAIL_CODE="session.emailcode";
	public static final String SESSION_RUN_MODE="session.runmode";
	public static final String SESSION_STATUS_ON="on";
	public static final String SESSION_STATUS_OFF="off";
	public static final String USER_SESSION_USRNO="USRNO";
    public static final String USER_SESSION_USERNAME="USERNAME";
    public static final String USER_SESSION_TOKENID="TOKENID";
    public static final String USER_SESSION_REGDT="REGDT";
    public static final String USER_SESSION_INFO="userInfo";
    public static final String USER_SESSION_MOBILE = "USERMOBILE";
    
    
    /**
     * 需要排除权限校验的接口权限
     */
    public static enum OUT_AUTH_URL{
        NORMAL("0000"),ALLOW("1111");
        private String enumVal;
        
        private OUT_AUTH_URL(String enumVal) {
            this.enumVal = enumVal;
        }
        
        @Override
        public String toString() {
            return String.valueOf(this.enumVal);
        }
    };
	
    
    /** 默认当前页 */
    public static final int DEFAULT_CURRENT_PAGE = 1;
    /** 页大小 */ 
    public static final int DEFAULT_PAGE_SIZE = 10;
    /** 默认总条数 */
    public static final int DEFAULT_TOTAL_COUNT = 0;
    /** 默认总页数 */
    public static final int DEFAULT_TOTAL_PAGE = 0;
    /** 默认起始条数 */
    public static final int DEFAULT_ROW = 0;
    
   
   
}
