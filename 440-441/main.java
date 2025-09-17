// Fig. 9.6: InheritanceTest.java
// Demonstrando o relacionamento "é um"

// Pacotes do núcleo de Java
import java.text.DecimalFormat;

// Pacotes de extensão de Java
import javax.swingJOptionPane;

public class InheritanceTest {

    // testa as classes Point e Circle
    public static void main( String args[] )
    {
        Point point1, point2;
        Circle circle1, circle2;

        point1 = new Point( 30, 50 );
        circle1 = new Circle( 2.7, 120. 89 );

        String output = "Point point1: " + point1.toString() +
            "\nCircle = circle1: " + circle1.toString();

        // usa relacionamento "é um" para fazer referência a
        // um Circle com uma referência a Point
        point2 = circle1;   // atribui Circle a uma referência para Point

        output += "\n\nCircle circle1 (via point2 reference): " +
            point2.toString();

        // usa "downcasting" (coerção de uma referência para superclasse para
        // um tipo de dado de subclasse) para atribuir point2 a circle2
        circle2 = ( Circle ) point2;

        output += "\n\nCircle circle1 (via circle2): " +
            circle2.toString();

        DecimalFormat precision2 = new DecimalFormat( "0.00" );
        output += "\nArea of c (via circle2): " +
        precision2.format( circle2.area() );

        // tentando fazer referência a um objeto Point com uma referência a Circle
        if ( point1 instanceof Circle ) {
            circle2 = ( Circle ) point1;
            output += "\n\ncast successful";
        }
        else
            output += "\n\npoint1 does not refer to a Circle";
        
        JOptionPane.showMessageDialog( null, output,
            "Demonstrating the \"is a\" relationship",
        JOptionPane.INFORMATION_MESSAGE );

        System.exit( 0 );
    }

}   // fim da classe InheritanceTest