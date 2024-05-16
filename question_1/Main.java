package question_1;

public class Main {
    public static void main(String[] args) {
        // Provided
        // Validator numericValidator = new Validator(new IsNumeric());
        // boolean b1 = numericValidator.validate("aaaa");
        // Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        // boolean b2 = lowerCaseValidator.validate("bbbb");

        // Refactored
        Validator numericValidator = new Validator(s -> s.matches("[a-z]+"));
        boolean b1 = numericValidator.validate("aaaa");

        Validator lowerCaseValidator = new Validator(s -> s.matches("\\d+"));
        boolean b2 = lowerCaseValidator.validate("bbbb");

        System.out.println(b1);
        System.out.println(b2);
    }
}
