package Main;


public class Mengubahsuhu { double Celcius;

    public Mengubahsuhu(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double ToFahrenheit(){
        return (Celcius*1.8+32);
    }
    double ToReamur(){
        return (Celcius*0.8);
    }
    double ToKelvin(){
        return (Celcius+273.15);
    }
    String kondisi(){
        if(Celcius <= 0){
            return "Beku";
        }
        else if(Celcius >= 100){
            return "Mendidih";
        }
        else{
            return "Normal";
        }
    }
    
}