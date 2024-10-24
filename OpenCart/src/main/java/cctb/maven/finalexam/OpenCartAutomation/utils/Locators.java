package cctb.maven.finalexam.OpenCartAutomation.utils;


public class Locators {
	
	//Home Page
	public static final String SEARCH_INPUT = "search";
	public static final String SEARCH_BUTTON = "//button[@type='button' and @class='btn btn-default btn-lg']";
	public static final String ACCOUNT_MENU = "//span[normalize-space()='My Account']";
	public static final String REGISTER_LINK = "//a[normalize-space()='Register']";
	public static final String LOGIN_LINK = "Login";
	
	
	//Register Page
	public static final String FNAME_INPUT = "input-firstname";
    public static final String LNAME_INPUT = "input-lastname";
    public static final String EMAIL_INPUT = "input-email";
    public static final String PHONE_INPUT = "input-telephone";
    public static final String PASSWORD_INPUT = "input-password";
    public static final String CPWD_INPUT = "input-confirm";
    public static final String TERMS_CHECKBOX = "agree";
    public static final String CONTINUE_BUTTON = "//input[@value='Continue']";
    public static final String SUCESS_MESSAGE = "//h1[text()='Your Account Has Been Created!']";
    
    //Login Page
    public static final String LOGIN_EMAIL_INPUT = "input-email";
    public static final String LOGIN_PASSWD_INPUT = "input-password";
    public static final String LOGIN_BUTTON = "//input[@value='Login']";
    public static final String ACCOUNT_LINK = "//a[text()='My Account']";
    
    //Search Results Page
    public static final String SEARCH_RESULT = "//h4/a[text()='iPhone']";

}
