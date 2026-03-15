public class OperadoresUnarios
{ static void main(String[] args) {
        // Operadores unarios
        int a = 3, b = -2, resultado = 0;
        var c = true;
        //operador unario valor negativo
        resultado = -a;
        System.out.println("resultado = " + resultado);
        resultado = -b;
        System.out.println("resultado = " + resultado);
        // Operador unario de incremento
        resultado = ++a;
        System.out.println("a = " + a);
        //post incremento
        a = 3;
        resultado = a++;
        System.out.println("resultado = " + resultado); // aqui tomo a antes del postincremento
        System.out.println("resultado = " + a);
        //Operador decremento
        a=3;
        resultado = --a;
        System.out.println("resultado = " + resultado);
        resultado = a--;
        System.out.println("resultado = " + resultado);
        System.out.println("a = " + a);
        //operador unario de negación
    System.out.println("c = " + c);
        var resultado2 = !c;
    System.out.println("resultado2 = " + resultado2);

    }
}
