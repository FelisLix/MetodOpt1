package org.example;

//для вирішення завдання було використано ресурс: https://github.com/kennyledet/Algorithm-Implementations/tree/master/Simplex_Method/Java/mike168m

public class Main {
    public static void main(String[] args) {
        boolean quit = false;

        //  3x + 3y + 3 -> max
        //
        //  2x + y <= 14 and
        //  x + y <= 8

        float[][] standardized =  {
                { 2,   1,    1,  0,   14},
                { 1,   1,    0,  1,   8},
                {-3,  -3,    0,  0,   0}
        };


        // row and column do not include
        // right hand side values
        // and objective row
        Simplex simplex = new Simplex(2, 4);

        simplex.fillTable(standardized);

        // print it out
        System.out.println("---Starting set---");
        simplex.print();

        // if table is not optimal re-iterate
        while(!quit){
            Simplex.ERROR err = simplex.compute();

            if(err == Simplex.ERROR.IS_OPTIMAL){
                simplex.print();
                quit = true;
            }
            else if(err == Simplex.ERROR.UNBOUNDED){
                System.out.println("---Solution is unbounded---");
                quit = true;
            }
        }
    }
}