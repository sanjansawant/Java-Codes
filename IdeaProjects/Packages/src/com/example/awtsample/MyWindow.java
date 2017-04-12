package com.example.awtsample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by sanja on 1/9/2017.
 */
public class MyWindow extends Frame {


    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge=new Font("SansSerif",Font.BOLD,18);
        Font SansSerifSmall=new Font("SansSerif",Font.BOLD,12);
        g.setFont(sansSerifLarge);
        g.drawString("Complete java developer course",60,60);
        g.setFont(SansSerifSmall);
        g.drawString("By Tim bachulka",60,100);
    }
}
