// Fig 9.4: Point.java
// Definição da classe Point

public class Point {
    protected int x, y; // coordenadas de Point

    // Construtor sem argumentos
    public Point()
    {
        // chamada implícita do construtor da superclasse ocorre aqui
        setPoint( 0, 0 );
    }

    // construtor
    public Point( int xCoordinate, int yCoordinate )
    {
        // chamada implícita do construtor da superclasse ocorre aqui
        setPoint ( xCoordinate, yCoordinate );
    }

    // configura as coordenadas x e y de Point
    public voic setPoint( int xCoordinate, int yCoordinate )
    {
        x = xCoordinate;
        y = yCoordinate;
    }

    // obtém a coordenada x
    public int getX()
    {
        return x;
    }

    // obtém a coordenada y
    public int getY()
    {
        return y;
    }

    // converte para uma representação de String
    public String toString()
    {
        return "[" + x + ", " + y + "] ";
    }

}   // fim da classe Point