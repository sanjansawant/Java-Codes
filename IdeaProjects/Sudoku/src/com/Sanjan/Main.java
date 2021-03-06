package com.Sanjan;

import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);
        int repeatInt=1;
        while(repeatInt==1){
            JFileChooser fileDialog = new JFileChooser();
            if (fileDialog.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
                return;

            SudokuBoard sudoku = new SudokuBoard();
            if (!sudoku.loadFromFile(fileDialog.getSelectedFile().getPath()))
            {
                System.out.println("File could not be opened.");
                return;
            }

            System.out.println("===========");
            if (!sudoku.solve())
                System.out.println("No solution.\n");
            else
                System.out.println(sudoku.toString());


            System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
            repeatInt = input.nextInt();
        }
    }
}