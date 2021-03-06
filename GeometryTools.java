import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;
import java.lang.Math;

@DesignerComponent(version = 1,  description = "This is an extensions used to do solve simple geometry problems.<br><br><b>Creator: </b>Ruthenium Alpha<br><br><b>Released on: </b>16 Dec 2020",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "https://static.wixstatic.com/media/0cb73c_468601c78ef0446c9dc9084ee5b2c95d~mv2.png")
@SimpleObject(external = true)
public class GeometryTools extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    public GeometryTools(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }
  
  @SimpleFunction (description = "Calculates the area of a Square. Input should be in same unit.")
  public double AreaOfSquare ( double sideLength )
  {
    return sideLength * sideLength;
  }
  @SimpleFunction (description = "Calculates the area of Rectangle. Input should be in same unit.")
  public double AreaOfRectagle ( double length, double width )
  {
    return length * width;
  }
  @SimpleFunction (description = "Calculates the area of Circle. Input should be in same unit.")
  public double AreaOfCircle ( double radius )
  {
    return (double) (Math.PI * (radius * radius));
  }
  @SimpleFunction (description = "Calculates the area of Triangle. Input should be in same unit.")
  public double AreaOfTriangle ( double side1, double side2, double side3 )
  {
    return (double) Math.sqrt(((side1 + side2 + side3)/2) * (((side1 + side2 + side3)/2)-side1) * (((side1 + side2 + side3)/2)-side2) * (((side1 + side2 + side3)/2)-side3));
  }
  @SimpleFunction (description = "Calculates the volume of a Cube. Input should be in same unit.")
  public double VolumeOfCube ( double sideLength )
  {
    return sideLength * sideLength * sideLength;
  }
  @SimpleFunction (description = "Calculates the volume of a Cuboid. Input should be in same unit.")
  public double VolumeOfCuboid ( double length, double width, double hieght )
  {
    return (length * width) * hieght;
  }
  @SimpleFunction (description = "Calculates the perimetre of a Square. Input should be in same unit.")
  public double PerimetreOfSquare ( double sideLength )
  {
    return sideLength * 4;
  }
  @SimpleFunction (description = "Calculates the perimetre of Rectangle. Input should be in same unit.")
  public double PerimetreOfRectagle ( double length, double width )
  {
    return (length * 2) + (width * 2);
  }
  @SimpleFunction (description = "Calculates the number of diagonals in the given figure.")
  public int FindTotalDiagonals ( int numberOfSides )
  {
    return (int) ((numberOfSides * (numberOfSides - 3)) / 2);
  }
  @SimpleFunction (description = "Calculates the circumference of a Circle. Input should be in same unit.")
  public double CircumferenceOfCircle ( double radius )
  {
    return (double) Math.PI * (double) (radius * 2);
  }
  @SimpleFunction (description = "Calculates the perimetre of Triangle. Input should be in same unit.")
  public double PerimetreOfTriangle ( double side1, double side2, double side3 )
  {
    return side1 + side2 + side3;
  }
  
}
