package model;

public class TV {
    private int canal;
    private int volume;
    

    public TV() {
        this.canal = 0;
        this.volume = 0;
    }
    
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if ((canal > 0) && (canal <=100))
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Canal: " + canal + " Volume: " + volume;
    } 

    public void aumentarVolume() {
        if (volume < 100)
        this.volume++;
    }

    public void diminuirVolume() {
        if (volume > 0)
        this.volume--;
    }
    
   
}

