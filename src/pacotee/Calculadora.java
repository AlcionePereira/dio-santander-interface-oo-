package pacotee;

class Calculadora implements Op {
    public static void main(String[] args) {
        System.out.println("Começando...");
    }


    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 - operando2));

    }

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Multiplicacao: "+ (operando1 * operando2));

    }

    @Override
    public void divida(double operando1, double operando2) {
        System.out.println("Divisao: "+ (operando1 / operando2));

    }

}

