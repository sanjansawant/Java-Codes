package com.company;

/**
 * Created by sanja on 3/30/2017.
 */
public class Button {

    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener=onClickListener;
    }

    public void setOnClick(){

        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{

        void onClick(String title);
    }

}
