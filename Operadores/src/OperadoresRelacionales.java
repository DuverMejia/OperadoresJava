public class OperadoresRelacionales {
    static void main() {
        //operadores relacionales/comparacion
        int  a = 3, b = 2, c =3;

        //igualdad
        boolean  resultado = a ==b;
        System.out.println("resultado = " + resultado);

        resultado = a==c;
        System.out.println("resultado = " + resultado);

        //operador distinto
        resultado = a !=b;
        System.out.println("resultado = " + resultado);

        //mayor que
        resultado = a > b;
        System.out.println("resultado = " + resultado);
        resultado = a > c ;
        System.out.println("resultado = " + resultado);
        resultado = a >=b;
        System.out.println("resultado = " + resultado);

        //menor que
        resultado = a < b;
        System.out.println("resultado = " + resultado);
        resultado = a <= b ;
        System.out.println("resultado = " + resultado);
    }
}
