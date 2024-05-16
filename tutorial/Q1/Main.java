package Q1;

public class Main {
    public static void main(String[] args) {
        // Provided
        // Validator numericValidator = new Validator(new IsNumeric());
        // boolean b1 = numericValidator.validate("aaaa");

        // Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        // boolean b2 = lowerCaseValidator.validate("bbbb");

        // System.out.println("B1: " + b1);
        // System.out.println("B2: " + b2);

        Validator numValidator = new Validator(new ValidationStrategy() {
            @Override
            public boolean execute(String s) {
                return s.matches("\\d+");
            }
        });
        Validator lCaseValidator = new Validator(s -> s.matches("[a-z]+"));
        System.out.println("numValidator " + numValidator.validate("aaaa"));
        System.out.println("lCaseValidator" + lCaseValidator.validate("bbbb"));
    }
}
