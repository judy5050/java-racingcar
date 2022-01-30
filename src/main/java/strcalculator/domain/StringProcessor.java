package strcalculator.domain;

public class StringProcessor {

    private String userInput;

    public StringProcessor(final String userInput) {
        this.userInput = userInput;
        deleteSpaceString();
        checkInput();
        validation();
    }

    private void checkInput() {
        if (userInput == null || userInput.trim().length() == 0) {
            throw new IllegalArgumentException("연산 가능한 수식을 입력해주세요.");
        }
    }

    private void validation() {
        final boolean matches = userInput.matches("[+\\-*/]|[0-9]+");
        if (matches == false) {
            throw new IllegalArgumentException("숫자와 연산자, 공백문자만 입력할 수 있습니다.");
        }

    }

    public String[] parseInputNumber() {
        final String[] numbers = userInput.split("[+\\-*/]");
        return numbers;
    }

    public String[] parseInputOperands() {
        final String[] operands = userInput.split("[0-9]+");
        return operands;
    }

    private void deleteSpaceString() {
        userInput = userInput.replaceAll(" ", "");

    }

}
