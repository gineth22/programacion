

package com.mycompany.poo;

import characters.Character;

public class Poo {

    public static void main(String[] args) {
        Character homero = new Character("homero","inspector de seguridad", 33, "a la gente le puse cuca");
        homero.greeting();
        System.out.println(homero.getAge());
        
        Character bart = new Character();
        bart.setPhrase("ay caramba");
        bart.greeting();
    }
}
