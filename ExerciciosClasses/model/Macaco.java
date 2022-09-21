package model;

import java.util.ArrayList;

public class Macaco {
    private String nome;
    private ArrayList<String> bucho = new ArrayList();


    public Macaco(String nome) {
        this.nome = nome;
    }

    public void comer(String comida) {
        bucho.add(comida);
    }

    public void verBucho() {
        if (!bucho.isEmpty()){
            for(String i : bucho)
            System.out.println("Bucho: " + i.toString());   
        } else {
            System.out.println("Bucho esta vazio!");
        }
        
    }
    
    // se bucho não for vazio ele tira -1.
    public void digerir() {
        if (!bucho.isEmpty()){
            bucho.remove(bucho.size()-1);
        } else {
            System.out.println("Bucho já esta vazio!");
        }

    
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
