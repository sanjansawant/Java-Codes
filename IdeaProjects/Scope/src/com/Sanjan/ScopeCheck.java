package com.Sanjan;

/**
 * Created by sanja on 1/5/2017.
 */
public class ScopeCheck {

    private int varone =1;
    public int publicVar=0;

    public ScopeCheck() {
        System.out.println("scope check called,private var "+ varone +", public var= "+publicVar);
    }

    public int getVarone() {
        return varone;

    }

    public void addTwo(){
        int privateVar=2;
        for(int i=0;i<11;i++){

            System.out.println(this.varone +" * "+i+" = "+(this.varone *i));
        }


    }


    public void accessInnerClass(){
        InnerClass inn=new InnerClass();
        System.out.println(inn.varThree);


    }


    public class InnerClass{
        private int varThree =3;

        public InnerClass() {
            System.out.println("inner class classed,"+", varOne "+
                    varone+" and varthree= "+ varThree);;
        }

        public void addTwo(){

            System.out.println("varOne is still available here "+varone);
            for(int i=0;i<11;i++){

                System.out.println(varThree +" * "+i+" = "+(varThree *i));
            }


        }

    }
}
