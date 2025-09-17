// Fig. 9.5: Circle.java
// Definição da classe Circle

public class Circle extends Point { // herda de Point
    protected double radius;

    // construtor sem argumentos
    public Circle()
    {
        // chamada implícita para o construtor da superclasse ocorre aqui
        setRadius( 0 );
    }

    // construtor
    public Circle( double circle Radius, int xCoordinate,
        int yCoordinate )
    {
        // chama o construtor da superclasse para configurar coordenadas
        super ( xCoordinate, yCoordinate );

        // configura o raio
        setRadius( circleRadius );
    }

    // configura o raio do Circle
    public void setRadius( double circleRadius )
    {
        radius = ( circleRadius >= 0.0 ? circleRadius : 0.0 );
    }

    obtém o raio do Circlepublic double getRadius()
    {
        return radius;
    }

    // calcula a área do Circle
    public double area()
    {
        return Math.PI * radius * radius;
    }

    // converte o Circle para um String 

    public String toString()
    {
        return "Center = " + "[" + x + ", " + y + "]" +
              "; Radius = " + radius;
    }

}   // fim da classe Circle

