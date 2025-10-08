public class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade;
    private float altura;

    public CorpoHumano(float massa, float volume, float densidade, float altura){
        this.densidade = densidade;
        this.volume = volume;
        this.massa = massa;
        this.altura = altura;
    }

    public float getMassa() {
        return massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
    }

    public float getDensidade() {
        return densidade;
    }

    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }
    
}
