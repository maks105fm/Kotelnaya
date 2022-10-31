package Menu;

import Zdaniya.*;

public class Menu {
    Kotel kotel = new Kotel();
    Shcool shcool = new Shcool();
    Univer univer = new Univer();
    Adminzdanie adminzdanie = new Adminzdanie();
    Posr posr = new Posr();

    public void menu(){
        System.out.println("Включение подачи воды ");
        kotel.vkl(posr);
        Zdaniya zdaniya [] = new Zdaniya[10];
        zdaniya[0] = shcool;
        zdaniya[1] = univer;
        zdaniya[2] = adminzdanie;

        kotel.vklm(zdaniya);
    }
}
