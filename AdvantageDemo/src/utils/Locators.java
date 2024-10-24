package utils;

public class Locators {
	
	//Home Page Locators
	public static final String USER_MENU="//*[@id='menuUser']";
	public static final String USER_VALUE="//*[@id='menuUserLink']/span";
	public static final String SEARCH_ICON="//a[@title='SEARCH']";
	public static final String SEARCH_INPUT="//*[@id='autoComplete']";
	public static final String PRODUCT_RESULT="//img[@class='imgProduct']";
	public static final String LOGIN_INPUT="//input[@name='username']";
	public static final String PASSWORD_INPUT="//input[@name='password']";
	public static final String SIGNIN_BUTTON="//button[@id='sign_in_btn']";
	public static final String LOGOUT_BUTTON="//*[@id='loginMiniTitle']/label[3]";
	public static final String SAVECART_BUTTON="//button[@name='save_to_cart']";
	public static final String CART_ITEMS="//span[@class='cart ng-binding']";
	public static final String HOMEPAGE_ICON="//a[@href='#/']";
	public static final String SPEAKER_LIST="//span[@id='speakersTxt']";
	public static final String PRODUCT_LABEL="//a[contains(text(), '";
	
	//Register Page Locators
	public static final String SIGNUP_BUTTON="//a[contains(text(), 'CREATE NEW ACCOUNT')]";
	public static final String USERNAME_INPUT="//input[@name='usernameRegisterPage']";
	public static final String EMAIL_INPUT="//input[@name='emailRegisterPage']";
	public static final String PASSWORDR_INPUT="//input[@name='passwordRegisterPage']";
	public static final String CONFIRM_PASSWORD_INPUT="//input[@name='confirm_passwordRegisterPage']";
	public static final String FNAME_INPUT="//input[@name='first_nameRegisterPage']";
	public static final String LNAME_INPUT="//input[@name='last_nameRegisterPage']";
	public static final String COUNTRY_LIST="//select[@name='countryListboxRegisterPage']";
	public static final String CITY_INPUT="//input[@name='cityRegisterPage']";
	public static final String PROMOTIONS_CHECKBOX="//input[@name='allowOffersPromotion']";
	public static final String TERMS_CHECKBOX="//input[@name='i_agree']";
	public static final String REGISTER_BUTTON="//button[@id='register_btn']";
			
	//Checkout Page Locators
	public static final String SHOPPINGCART_LINK="//a[@id='shoppingCartLink']";
	public static final String CHECKOUT_BUTTON="//button[@name='check_out_btn']";
	public static final String NEXT_BUTTON="//button[@id='next_btn']";
	public static final String SAFEPAY_RADIO="//input[@name='safepay']";
	public static final String SAFEPAY_USERNAME="//input[@name='safepay_username']";
	public static final String SAFEPAY_PASSWORD="//input[@name='safepay_password']";
	public static final String SAFEPAY_SAVE="//input[@name='save_safepay']";
	public static final String PAYNOW_SAFEPAY="//button[@id='pay_now_btn_SAFEPAY']";
	
}
