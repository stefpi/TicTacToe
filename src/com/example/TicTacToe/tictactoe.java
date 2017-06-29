package com.example.TicTacToe;

import oracle.jrockit.jfr.JFR;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tictactoe{

    public static void gridLayoutGameX(Container pane){
        GridBagConstraints g = new GridBagConstraints();
        pane.setLayout(new GridLayout(3, 3));

        JButton tr = new JButton();
        g.gridx = 0;
        g.gridy = 2;
        pane.add(tr, g);

        JButton tm = new JButton();
        g.gridx = 1;
        g.gridy = 2;
        pane.add(tm, g);

        JButton tl = new JButton();
        g.gridx = 2;
        g.gridy = 2;
        pane.add(tl, g);

        JButton mr = new JButton();
        g.gridx = 0;
        g.gridy = 1;
        pane.add(mr, g);

        JButton mm = new JButton();
        g.gridx = 1;
        g.gridy = 1;
        pane.add(mm, g);

        JButton ml = new JButton();
        g.gridx = 2;
        g.gridy = 1;
        pane.add(ml, g);

        JButton br = new JButton();
        g.gridx = 0;
        g.gridy = 0;
        pane.add(br, g);

        JButton bm = new JButton();
        g.gridx = 1;
        g.gridy = 0;
        pane.add(bm, g);

        JButton bl = new JButton();
        g.gridx = 2;
        g.gridy = 0;
        pane.add(bl, g);

        tr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tr.setText("X");
            }
        });

        tm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tm.setText("X");
            }
        });

        tl.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                tl.setText("X");
            }
        });

        mr.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                mr.setText("X");
            }
        });

        mm.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                mm.setText("X");
            }
        });

        ml.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                ml.setText("X");
            }
        });

        br.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                br.setText("X");
            }
        });

        bm.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                bm.setText("X");
            }
        });

        bl.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                bl.setText("X");
            }
        });
    }

    public static void gridLayoutGameY(Container pane){
        GridBagConstraints g = new GridBagConstraints();
        pane.setLayout(new GridLayout(3, 3));

        JButton tr = new JButton();
        g.gridx = 0;
        g.gridy = 2;
        pane.add(tr, g);

        JButton tm = new JButton();
        g.gridx = 1;
        g.gridy = 2;
        pane.add(tm, g);

        JButton tl = new JButton();
        g.gridx = 2;
        g.gridy = 2;
        pane.add(tl, g);

        JButton mr = new JButton();
        g.gridx = 0;
        g.gridy = 1;
        pane.add(mr, g);

        JButton mm = new JButton();
        g.gridx = 1;
        g.gridy = 1;
        pane.add(mm, g);

        JButton ml = new JButton();
        g.gridx = 2;
        g.gridy = 1;
        pane.add(ml, g);

        JButton br = new JButton();
        g.gridx = 0;
        g.gridy = 0;
        pane.add(br, g);

        JButton bm = new JButton();
        g.gridx = 1;
        g.gridy = 0;
        pane.add(bm, g);

        JButton bl = new JButton();
        g.gridx = 2;
        g.gridy = 0;
        pane.add(bl, g);

        tr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tr.setText("O");
            }
        });

        tm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tm.setText("O");
            }
        });

        tl.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                tl.setText("O");
            }
        });

        mr.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                mr.setText("O");
            }
        });

        mm.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                mm.setText("O");
            }
        });

        ml.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){ml.setText("O");}
        });

        br.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                br.setText("O");
            }
        });

        bm.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                bm.setText("O");
            }
        });

        bl.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                bl.setText("O");
            }
        });



    }

    public static void gridLayoutStart(Container pane){

        GridBagConstraints s = new GridBagConstraints();
        pane.setLayout(new GridLayout(1,2));

        JButton x = new JButton("X");
        s.gridx = 0;
        s.gridx = 0;
        pane.add(x, s);

        JButton y = new JButton("O");
        s.gridx = 1;
        s.gridy = 0;
        pane.add(y, s);

        x.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frameX = new JFrame("Tic Tac Toe");
                frameX.pack();
                frameX.setVisible(true);
                frameX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameX.setExtendedState(JFrame.MAXIMIZED_BOTH);
                gridLayoutGameX(frameX.getContentPane());
            }
        });

        y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frameY = new JFrame("Tic Tac Toe");
                frameY.pack();
                frameY.setVisible(true);
                frameY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameY.setExtendedState(JFrame.MAXIMIZED_BOTH);
                gridLayoutGameY(frameY.getContentPane());
            }
        });
    }

    public static void launchPlayGUI(){
        //JFrame
        JFrame start = new JFrame("Tic Tac Toe");
        start.pack();
        start.setVisible(true);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutStart(start.getContentPane());



//        //Adding Components to Game
//        gridLayoutGame(frame.getContentPane());
//        frame.pack();
//        //
//        //Launching Play Gui
//        frame.setVisible(true);

    }


    public static void main(String[] args) {
        launchPlayGUI();
    }
}
