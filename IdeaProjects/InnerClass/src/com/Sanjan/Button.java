package com.Sanjan;

/**
 * Created by sanja on 1/6/2017.
 */
public class Button {

    private String name;
    private OnClickListener onClickListener;

    public Button(String name) {
        this.name = name;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener=onClickListener;
    }
    public void onClick(){

        this.onClickListener.onClick(this.name);
    }

    public interface OnClickListener{

        void onClick(String name);


    }
}
