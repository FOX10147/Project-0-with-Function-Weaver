package IDB2.FunctionWeaver.Calculators;

public class Powers extends IntermediateOperations {
    public Powers() {
        super();
    }
    
    public StringBuilder powerTest (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Powers";

        // announce();
        baseString();
        partString();
        result = Math.pow(base,value);
        changeString();

        return equation;
    }

    public StringBuilder exponentTest (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Powers";

        // announce();
        partString();
        result = Math.exp(value);
        changeString();

        return equation;
    }
}