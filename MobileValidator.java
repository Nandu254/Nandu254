class LengthNotSufficientException extends Exception {
 LengthNotSufficientException(String msg) { super(msg); }
}
public class MobileValidator {
 static void validate(String num) throws LengthNotSufficientException {
 for(char c : num.toCharArray())
 if(!Character.isDigit(c))
 throw new NumberFormatException("Invalid - NumberFormatException");
 if(num.length() > 10)
 throw new ArrayIndexOutOfBoundsException("Invalid - ArrayIndexOutOfBoundsException");
 if(num.length() < 10)
 throw new LengthNotSufficientException("Invalid - LengthNotSufficientException");
 System.out.println(num + " -> Valid Mobile Number");
 }
 public static void main(String[] args) {
 String[] numbers = {"9885089465", "98567890121", "88664433", "98abj@123"};
 for(String n : numbers) {
 try { validate(n); }
 catch(NumberFormatException e) { System.out.println(n + " -> " + e.getMessage()); }
 catch(ArrayIndexOutOfBoundsException e) { System.out.println(n + " -> " + e.getMessage()); }
 catch(LengthNotSufficientException e) { System.out.println(n + " -> " + e.getMessage()); }
 finally { System.out.println("Validation attempt completed."); }
 }
 }
}