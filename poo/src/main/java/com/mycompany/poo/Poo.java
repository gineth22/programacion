

package com.mycompany.poo;

public class Poo {

    public static void main(String[] args) {
        Character homero = new Character("homero","inspector de seguridad", 33, "a la gente le puse cuca");
        homero.greeting();
        
        Character bart = new Character("Bartolomeo","vago",10,"ay caramba");
        bart.greeting();
    }
    
    static class Character {
        String name;
        String occupation;
        int age;
        String phrase;

        public Character(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
        
        
       void greeting(){
                System.out.println(this.phrase);
            
        }
       
    }
}
