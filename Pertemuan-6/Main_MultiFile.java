package com.pbo

import com.terminal.Console;

class Main_MultiFile {
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        Player player2 = new Player("Ucup");
        Player player3 = new Player("Saitama");
        player1.show();
        player2.show();
        player3.show();

        Console_MultiFile.log("hallo");
        Console_MultiFile.log("Hallo");
    }
}
