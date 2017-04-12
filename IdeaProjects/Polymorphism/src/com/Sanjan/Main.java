package com.Sanjan;


class Movie{

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return("Unknown");
    }
}


class FishCurry extends Movie{
    public FishCurry() {
        super("FishCurry");
    }

    @Override
    public String plot() {
        return ("Movie on Fishs");
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return ("Movie On soldiers");
    }
}


class Forgettable extends Movie{

    public Forgettable() {
        super("forgettable");
    }

    //no plot method
}

class MazeRunner extends Movie{

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return ("RoadRash");
    }
}


public class Main {

    public static void main(String[] args) {

        for(int i=1;i<11;i++) {
            Movie movie = randomMovie();
            System.out.println("==> "+movie.getName() );
            System.out.println(movie.plot());
            System.out.println();
        }
    }

    public static Movie randomMovie(){

        int movieNumber=(int)(Math.random()*4)+1;//Math.random() will give a double value between 0 and 1 and multiplying it with 5
        //will give value betwwen 0 and 4 and adding 1 will give value between 1 and 5

        System.out.println("movie number is "+movieNumber);
        switch(movieNumber){
            case 1:
                return (new FishCurry());
                //break;
            case 2:
                return (new IndependenceDay());
                //break;
            case 3:
                return (new MazeRunner());
                //break;
            case 4:
                return (new Forgettable());
                //break;
//            default:
//                return null;
//                //break;


        }

        return null;
    }
}
