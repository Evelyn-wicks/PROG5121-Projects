Google Developers. (2026). libphonenumber: Google’s library for parsing, formatting, and validating international phone numbers. GitHub. Available at: https://github.com/google/libphonenumber (github.com in Bing)[accessed 27/09/2026]
GeeksforGeeks. (2025). Java Program to Validate Phone Numbers using Google’s libphonenumber Library. Available at: https://www.geeksforgeeks.org/java-program-to-validate-phone-numbers-using-googles-libphonenumber-library (geeksforgeeks.org in Bing)[accssessed] 25/09/2026
javathinking.com. (2026). Using libphonenumber for Phone Number Validation and Conversion. Available at: https://javathinking.com/libphonenumber-validation (javathinking.com in Bing)[accessed 25/09/2026]
// Regex for South African cellphone numbers in E.164 format
// Reference: Google libphonenumber library
private static final String SA_CELL_REGEX = "^\\+27\\d{9}$";

public boolean checkCellPhoneNumber() {
    return cellPhoneNumber.matches(SA_CELL_REGEX);
}
// Regex pattern adapted from Google's libphonenumber library (Google Developers, 2026)
