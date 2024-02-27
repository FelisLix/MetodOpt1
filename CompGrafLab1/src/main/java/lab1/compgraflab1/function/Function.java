package lab1.compgraflab1.function;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Function {
  public List<Point> getPoints1(int x1, int x2, int step){
       List<Point> points = new ArrayList<>();
      for (int x = x1; x <= x2 ; x+= step) {
           int y = 14 - 2 * x;
           points.add(new Point(x, y));
      }
       return points;
   }

    public List<Point> getPoints2(int x1, int x2, int step){
        List<Point> points = new ArrayList<>();
        for (int x = x1; x <= x2 ; x+= step) {
            int y = 8 - x;
            points.add(new Point(x, y));
        }
        return points;
    }


    public List<Point> getPointsX(int x1, int x2, int step){
        List<Point> points = new ArrayList<>();
        for (int x = x1; x <= x2 ; x+= step) {
            points.add(new Point(0, x));
        }
        return points;
    }

    public List<Point> getPointsY(int x1, int x2, int step){
        List<Point> points = new ArrayList<>();
        for (int x = x1; x <= x2 ; x+= step) {
            points.add(new Point(x, 0));
        }
        return points;
    }
}
