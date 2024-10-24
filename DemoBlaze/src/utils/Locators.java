package utils;

public class Locators {
    // Login Page Locators
    public static final String LOGIN_BUTTON = "login2"; // ID of the login button
    public static final String USERNAME_FIELD = "loginusername"; // ID of the username field
    public static final String PASSWORD_FIELD = "loginpassword"; // ID of the password field
    public static final String LOGIN_SUBMIT_BUTTON = "//button[text()='Log in']"; // XPath of the login submit button

    // Product Page Locators
    public static final String ADD_TO_CART_BUTTON = "//a[normalize-space()='Add to cart']"; // XPath of the add to cart button

    // Contact Page Locators
    public static final String CONTACT_LINK = "Contact"; // Link text for contact
    public static final String RECIPIENT_NAME_FIELD = "recipient-name"; // ID of the recipient name field
    public static final String RECIPIENT_EMAIL_FIELD = "recipient-email"; // ID of the recipient email field
    public static final String MESSAGE_TEXT_AREA = "message-text"; // ID of the message text area
    public static final String SEND_MESSAGE_BUTTON = "//button[text()='Send message']"; // XPath of the send message button
}
