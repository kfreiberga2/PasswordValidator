package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeForm {
    public JPanel panelMain;
    private JButton btn_1_1;
    private JButton btn_0_1;
    private JButton btn_2_1;
    private JButton btn_1_2;
    private JButton btn_1_0;
    private JButton btn_0_2;
    private JButton btn_0_0;
    private JButton btn_2_2;
    private JButton btn_2_0;
    private JButton btnRestartGame;
    private GameBoard gameBoard;

    public TicTacToeForm() {
        gameBoard = new GameBoard();
        redrawBoard();



        btnRestartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameBoard.initialize();
                redrawBoard();

            }
        });
        btn_0_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(0,0);
            }
        });
        btn_0_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(0,1);
            }
        });
        btn_0_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(0,2);
            }
        });
        btn_1_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(1,0);
            }
        });
        btn_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(1,1);
            }
        });
        btn_1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(1,2);
            }
        });
        btn_2_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(2,0);
            }
        });
        btn_2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(2,1);
            }
        });
        btn_2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markAndRedraw(2,2);
            }
        });
    }
    private void markAndRedraw (int row, int col){
       var result =  gameBoard.markField(row, col);
        redrawBoard();

        switch (result){
            case X:
                JOptionPane.showMessageDialog(null, "X is winner");
                break;
             case O:
                JOptionPane.showMessageDialog(null, "O is winner");
                break;
             case DEUCE:
                JOptionPane.showMessageDialog(null, "This is DEUCE");
                break;
        }
    }

    private void redrawBoard(){
//        for (int i = 0; i < GameBoard.boardSize; i++) {
//            for (int j = 0; j <GameBoard.boardSize ; j++) {
//               var FieldValue =  gameBoard.getFieldValue(i,j);
//               panelMain.
//
//            }
//
//        }
        btn_0_0.setText(gameBoard.getFieldValueAsString(0,0));
        btn_0_1.setText(gameBoard.getFieldValueAsString(0,1));
        btn_0_2.setText(gameBoard.getFieldValueAsString(0,2));
        btn_1_0.setText(gameBoard.getFieldValueAsString(1,0));
        btn_1_1.setText(gameBoard.getFieldValueAsString(1,1));
        btn_1_2.setText(gameBoard.getFieldValueAsString(1,2));
        btn_2_0.setText(gameBoard.getFieldValueAsString(2,0));
        btn_2_1.setText(gameBoard.getFieldValueAsString(2,1));
        btn_2_2.setText(gameBoard.getFieldValueAsString(2,2));

       // var components = panelMain.getComponents();

    }


}
