package com.company;

public class Main {
    private static Button btnPrint=new Button("Sanjan");
    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener{

            public ClickListener(){

                System.out.println("I've been attached");

            }

            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClick();
    }
}
