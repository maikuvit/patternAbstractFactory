package it.maiku;

import Factories.AbstractFactory;
import Factories.GreenShapeFactory;
import Factories.OrangeShapeFactory;
import Factories.RedShapeFactory;


import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class App 
{
    static AbstractFactory factory = null;
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);
        int n = -1;
        while(n == -1) {
            System.out.println("Quale colore vuoi usare?\n0: green\n1: orange\n2: red");
            n = scan.nextInt();
            switch(n){
                case 0: factory = new GreenShapeFactory(); break;
                case 1: factory = new OrangeShapeFactory(); break;
                case 2: factory = new RedShapeFactory(); break;
                default:
                    System.out.println("errore: inserisci intero valido");
                    n = -1;
                    break;
            }
        }
        final JFrame frame = new JFrame();
        System.out.println("per cambiare forma premi:\n1->cerchio\n2->linea\n3->rettangolo");
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_1:
                        frame.setContentPane(factory.drawCircle());
                        break;
                    case KeyEvent.VK_2:
                        frame.setContentPane(factory.drawLine());
                        break;
                    case KeyEvent.VK_3:
                        frame.setContentPane(factory.drawRectangle());
                        break;
                    default: frame.setContentPane(new JPanel());
                        break;
                    }
                    frame.revalidate();
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
