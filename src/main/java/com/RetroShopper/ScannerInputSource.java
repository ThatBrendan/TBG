package com.RetroShopper;

import java.util.Scanner;

public class ScannerInputSource implements InputSetUp{
    Scanner scanner;

    {
        scanner = new Scanner(System.in);
    }

    @Override
    public String nextLine() {
        return null;
    }
}
