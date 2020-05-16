package com.company;

import com.company.data.Field;
import com.company.data.PlayerBoard;
import com.company.data.ShipGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShipGameForm extends JFrame {

    private static final int GAME_WIDTH = 1115;

    JPanel mainPanel;
    JPanel buttonPanel;
    JPanel playerBoard;
    JPanel shipSelectionPanel;

    JPanel myFieldPanel;
    JPanel opponentsFieldPanel;

    JButton btnNew;
    JButton btnLoad;
    JButton btnSave;
    JLabel lblActivePlayer;

    JButton[][] myFieldButtons;
    JButton[][] opponentsFieldButtons;

    private ShipGame shipGame = new ShipGame();
    public static final int ELEMENT_SIZE = 50;

    public ShipGameForm() {
        super("Kartupelis");

        this.setSize(GAME_WIDTH, 700);
        this.setResizable(false);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        initializeButtonPanel();
        initializeFieldPanel();
        initializeShipPanel();
        //draw();

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.ipady = 50;

        mainPanel.add(buttonPanel, c);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.ipady = 550;

        mainPanel.add(playerBoard,c);

        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 1;
        c.ipady = 100;

        mainPanel.add(shipSelectionPanel,c);

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initializeShipPanel() {
        shipSelectionPanel = new JPanel();
        shipSelectionPanel.setBackground(Color.GREEN);
    }

    private void initializeFieldPanel() {
        playerBoard = new JPanel();
        playerBoard.setBackground(Color.BLUE);
        playerBoard.setLayout(new GridLayout(1,2));

        myFieldPanel = new JPanel();
        myFieldPanel.setBackground(Color.GRAY);

        opponentsFieldPanel = new JPanel();
        opponentsFieldPanel.setBackground(Color.LIGHT_GRAY);

        var board = shipGame.getActiveBoard();

        addHeaders(myFieldPanel, board);
        addHeaders(opponentsFieldPanel, board);

        addFields(myFieldPanel, myFieldButtons);
        addFields(opponentsFieldPanel, opponentsFieldButtons);

        playerBoard.add(opponentsFieldPanel);
        playerBoard.add(myFieldPanel);
    }

    private void addFields(JPanel myFieldPanel, JButton[][] myFieldButtons) {
        myFieldButtons = new JButton[Field.FIELD_COUNT][Field.FIELD_COUNT];

        int yPos = ELEMENT_SIZE;
        for (int i = 0; i < Field.FIELD_COUNT; i++) {
            int xPos = ELEMENT_SIZE;
            for (int j = 0; j < Field.FIELD_COUNT; j++) {
                JButton btn = new JButton();
                btn.setName("btn_"+i+"_"+j);
                btn.setBounds(xPos,yPos, ELEMENT_SIZE, ELEMENT_SIZE);
                myFieldButtons[i][j] = btn;
                myFieldPanel.add(btn);
                xPos += ELEMENT_SIZE;
            }
            yPos += ELEMENT_SIZE;
        }
    }

    private void initializeButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.RED);
        buttonPanel.setLayout(new GridLayout(1, 4));

        btnNew = new JButton("New game");
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shipGame.restart();
                draw();
            }
        });

        btnLoad = new JButton("Load");
        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shipGame.load();
                draw();
            }
        });

        btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shipGame.save();
            }
        });

        lblActivePlayer = new JLabel();

        setPlayerLabelText();

        buttonPanel.add(btnNew);
        buttonPanel.add(btnLoad);
        buttonPanel.add(btnSave);
        buttonPanel.add(lblActivePlayer);
    }

    private void setPlayerLabelText() {
        if(shipGame.isPlayer1Active()) {
            lblActivePlayer.setText("Player 1");
        } else {
            lblActivePlayer.setText("Player 2");
        }
    }

    private void draw() {
       //var board = shipGame.getActiveBoard();

       playerBoard = new JPanel();
       playerBoard.setBackground(Color.BLUE);
//       playerBoard.setLayout(new GridLayout(1, 2));
//
//       JPanel myPanel = new JPanel();
//       myPanel.setLayout(new GridBagLayout());
//       addHeaders(myPanel, board);
//
//       JPanel opponentsPanel = new JPanel();
//       opponentsPanel.setLayout(new GridBagLayout());
//       addHeaders(opponentsPanel, board);
//
//       playerBoard.add(opponentsPanel);
//       playerBoard.add(myPanel);
    }

    private void addHeaders(JPanel panel, PlayerBoard board) {
        panel.setLayout(null);

        int currentPos = 50;
        for (var header: board.getColumnHeaders()) {
            JLabel label = new JLabel(Character.toString(header), SwingConstants.CENTER);
            label.setBounds(currentPos,0, ELEMENT_SIZE, ELEMENT_SIZE);
            panel.add(label);
            currentPos += ELEMENT_SIZE;
        }

        currentPos = 50;
        for (int i = 1; i <= Field.FIELD_COUNT; i++) {
            JLabel label = new JLabel(Integer.toString(i), SwingConstants.CENTER);
            label.setBounds(0,currentPos, ELEMENT_SIZE, ELEMENT_SIZE);
            panel.add(label);
            currentPos += ELEMENT_SIZE;
        }

//        GridBagConstraints c = new GridBagConstraints();
//        c.fill = GridBagConstraints.HORIZONTAL;
//        int x = 1;
//        for (var header: board.getColumnHeaders()) {
//            JLabel label = new JLabel();
//            label.setText(Character.toString(header));
//            label.setMinimumSize(new Dimension(45,45));
//            label.setPreferredSize(new Dimension(45,45));
//            label.setMaximumSize(new Dimension(45,45));
//            c.gridx = x;
//            c.gridy = 0;
//
//            panel.add(label, c);
//            ++x;
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            JLabel label = new JLabel();
//            label.setText(Integer.toString(i));
//            label.setMinimumSize(new Dimension(45,45));
//            label.setPreferredSize(new Dimension(45,45));
//            label.setMaximumSize(new Dimension(45,45));
//            c.gridx = 0;
//            c.gridy = i;
//
//            panel.add(label,c);
//        }
    }
}
