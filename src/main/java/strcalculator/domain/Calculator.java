package strcalculator.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Calculator {

    private final String[] numberList;
    private final String[] operandList;
    private final Map<String, Supplier<Integer>> operandDivision = new HashMap<>();
    private int leftNumber = 0;
    private int rightNumber = 0;

    {
        operandDivision.put("+", () -> leftNumber + rightNumber);
        operandDivision.put("-", () -> leftNumber - rightNumber);
        operandDivision.put("*", () -> leftNumber * rightNumber);
        operandDivision.put("/", () -> leftNumber / rightNumber);
    }

    public Calculator(final String[] numberList, final String[] operandList) {
        this.numberList = numberList;
        this.operandList = operandList;
    }

    public void calculate() {
        leftNumber = Integer.parseInt(numberList[0]);
        for (int i = 1; i < operandList.length; i++) {
            rightNumber = Integer.parseInt(numberList[i]);
            String operator = operandList[i];
            leftNumber = operandDivision.get(operator).get();
        }
        System.out.println(leftNumber);
    }

}
