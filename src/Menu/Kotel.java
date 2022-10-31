package Menu;

import Zdaniya.Zdaniya;

public class Kotel {

    boolean vklVikl = false;

    public void vkl( Zdaniya zdaniya) {
        System.out.println("Включена подача воды " + zdaniya.getMessage());
        vklVikl = true;
    }

    public void vklm( Zdaniya maszdan[]){
        for (int i = 0; i < maszdan.length; i++) {
            if(maszdan[i] != null){
                System.out.println(maszdan[i].getMessage());
            }

        }

    }
}