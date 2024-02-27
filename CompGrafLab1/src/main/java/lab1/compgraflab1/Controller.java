package lab1.compgraflab1;

import lab1.compgraflab1.function.Function;
import lab1.compgraflab1.function.Point;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @PostMapping("show_data")
    public String updateClient(@RequestParam int x1, @RequestParam int x2, @RequestParam int step, Model model) {
        Function function = new Function();

        List<Point> points1 = function.getPoints1(x1, x2, step);
        List<Integer> xData1 = points1.stream().map(Point::getX).toList();
        List<Integer> yData1 = points1.stream().map(Point::getY).toList();
        model.addAttribute("xData1", xData1);
        model.addAttribute("yData1", yData1);

        List<Point> points2 = function.getPoints2(x1, x2, step);
        List<Integer> yData2 = points2.stream().map(Point::getY).toList();
        model.addAttribute("yData2", yData2);

        List<Point> points3 = function.getPointsX(x1, x2, step);
        List<Integer> yData3 = points3.stream().map(Point::getY).toList();
        model.addAttribute("yData3", yData3);

        List<Point> points4 = function.getPointsY(x1, x2, step);
        List<Integer> yData4 = points4.stream().map(Point::getY).toList();
        model.addAttribute("yData4", yData4);

        return "index";
    }

}
