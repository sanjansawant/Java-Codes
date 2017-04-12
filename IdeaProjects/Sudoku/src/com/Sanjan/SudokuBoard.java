package com.Sanjan;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by sanja on 1/9/2017.
 */
public class SudokuBoard {
    private int[][] board = new int[9][9];
	/*private int[][] board =
		{
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9 },
			{ 2, 2, 3, 4, 5, 6, 7, 8, 9 },
			{ 3, 2, 3, 4, 5, 6, 7, 8, 9 },

			{ 4, 2, 3, 4, 5, 6, 7, 8, 9 },
			{ 5, 2, 3, 4, 3, 6, 7, 8, 9 },
			{ 6, 2, 3, 4, 5, 6, 7, 8, 9 },

			{ 7, 2, 3, 4, 5, 6, 7, 8, 9 },
			{ 8, 2, 3, 4, 5, 6, 7, 8, 9 },
			{ 9, 2, 3, 4, 5, 6, 7, 8, 9 }
		};*/

    public SudokuBoard() {

    }

    public boolean loadFromFile(String path) {
        try {
            Scanner file = new Scanner(new File(path));

            // load the board from the file, assuming that each number
            // is separated by a space
            for (int y = 0; y < 9; y++) {
                char[] characters = file.next().toCharArray();
                for (int x = 0; x < 9; x++) {
                    // verify that the digit is between 1 and 9, inclusive
                    char digit = characters[x];
                    if (digit == 'X') {
                        board[y][x] = 0;
                    } else if (digit > '9' || digit < '1') {
                        file.close();
                        return false;
                    } else {
                        board[y][x] = (int) (digit - '0');
                    }
                }
            }

            file.close();


            return true;


        } catch (FileNotFoundException exception) {

            return false;
        }

    }

    @Override
    public String toString() {

        // convert the board into a string
        String toReturn = "";
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                // add an extra space every 3, so it looks like an actual board
                toReturn += board[y][x] + (((x + (x + 2)) % 3 == 0) ? "  " : " ");
            }
            // add an extra line every 3
            toReturn = toReturn.trim() + (((y + (y + 2)) % 3 == 0) ? "\r\n\r\n" : "\r\n");
        }

        return toReturn;
    }

    public boolean solve() {

        return solveHelper(new Point(0, 0));
    }

    private boolean solveHelper(Point p) {
        // we've reached the end
        if (p.x == 0 && p.y == 9){
            System.out.println("====");
            return true;
        }

        // if the value is already solved for, then skip it
        if (board[p.y][p.x] != 0)
            return solveHelper(getNextPoint(p));

        // brute force the value
        for (int i = 1; i <= 9; i++) {
            if (validPoint(p, i)) {
                board[p.y][p.x] = i;
                if (solveHelper(getNextPoint(p)))
                    return true;
            }
        }

        // if it didn't find a solution then we need to reset this to 0
        // so that somewhere later it doesn't think that this was already solved for
        board[p.y][p.x] = 0;

        return false;
    }

    private boolean validPoint(Point p, int value) {
        // check the row
        for (int x = 0; x < 9; x++) {
            if (board[p.y][x] == value && x != p.x)
                return false;
        }

        // check the column
        for (int y = 0; y < 9; y++) {
            if (board[y][p.x] == value && y != p.y)
                return false;
        }

        // check the box
        int topY = (p.y / 3) * 3;
        int topX = (p.x / 3) * 3;
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                Point toCheck = new Point(topX + x, topY + y);
                if (board[toCheck.y][toCheck.x] == value && !toCheck.equals(p))
                    return false;
            }
        }

        return true;
    }

    private Point getNextPoint(Point p) {
        if (p.x == 8)
            return new Point(0, p.y + 1);
        else
            return new Point(p.x + 1, p.y);
    }

}