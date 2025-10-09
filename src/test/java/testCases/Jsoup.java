//package testCases;
//
//import baseClass.BrowserActions;
//import org.jsoup.nodes.Element;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import javax.swing.text.Document;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Jsoup extends BrowserActions {
//
//    @BeforeMethod
//    public void openingBrowser() {
//        browserOpen();
//    }
//
//    @AfterMethod(enabled = false)
//    public void closingBrowser() {
//        browserClose();
//    }
//@Test
//    public class OtpExtractor {
//
//        /**
//         * Extracts OTP code from raw HTML email content.
//         *
//         * @param htmlBody Full HTML content of the email
//         * @return OTP as String
//         */
//        public static String extractOtp(String htmlBody) {
//            // Step 1: Try direct regex match (first attempt)
//            String otp = extractOtpWithRegex(htmlBody);
//            if (otp != null) {
//                System.out.println("OTP extracted via regex: " + otp);
//                return otp;
//            }
//
//            // Step 2: If regex fails, use Jsoup to parse spans
//            otp = extractOtpWithJsoup(htmlBody);
//            if (otp != null) {
//                System.out.println("OTP extracted via Jsoup: " + otp);
//                return otp;
//            }
//
//            // Step 3: If all fail
//            throw new IllegalStateException("OTP not found in email content.");
//        }
//
//        private static String extractOtpWithRegex(String body) {
//            Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
//            Matcher matcher = pattern.matcher(body);
//            if (matcher.find()) {
//                return matcher.group();
//            }
//            return null;
//        }
//
//        private static String extractOtpWithJsoup(String htmlBody) {
//              String extractOtpWithJsoup(String htmlbody) {
//                try {
//                    Document doc = Jsoup.parse(htmlBody);
//                    for (Element span : doc.select("span")) {
//                        String text = span.text().trim();
//                        if (text.matches("\\d{6}")) {
//                            return text;
//                        }
//                    }
//                } catch (Exception e) {
//                    System.err.println("Jsoup parsing error: " + e.getMessage());
//                }
//                return null;
//            }
//
//        }
//    }
//
//}
