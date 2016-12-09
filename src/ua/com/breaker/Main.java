package ua.com.breaker;

import javax.swing.*;

/**
 * Created by mastytchmac on 09.12.16.
 */
public class Main {
    public static void main(String[] args) {

        GamePlay gamePlay = new GamePlay();

        JFrame jFrame = new JFrame();
        jFrame.setBounds(10, 10, 700, 600);
        jFrame.setTitle("BrickBreaker");
        jFrame.setResizable(false);
        jFrame.add(gamePlay);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

