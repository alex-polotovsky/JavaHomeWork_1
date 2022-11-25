package calculator;

/* import calculator.view;
import calculator.calc; */

public class controller {
    static void control() {
        calc.x = view.inView();
        calc.y = view.inView();
        String operator = view.operatorView();
        double res;
        switch (operator) {
            case "+":
                res = calc.sum();
                break;
            case "-":
                res = calc.sub();
                break;
            default:
                res = 0.0;
                break;

        }
        
        view.outView(res);
    }
}
