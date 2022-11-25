package calculator;


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
            case "*":
                res = calc.mult();
                break;
            case "/":
                res =calc.div();
                break;

            default:
                res = 0.0;
                break;
        }  
        view.outView(res);
    }
}
