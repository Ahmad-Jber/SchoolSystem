package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Interface in = new Interface();
//        in.connect();
        in.dashboard(new JFrame("Dashboard"));
    }
}
