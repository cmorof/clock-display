
public class ClockDisplay
{
    private NumberDisplay horas;
    private NumberDisplay minutos;

    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }

    public void fijarHora(int hours, int minutes)
    {
        horas.setValue(hours);
        minutos.setValue(minutes);
    }
    
    public void avanzarMinutos()
    {
        minutos.increment();
        if (minutos.getValue() == 0){
            horas.increment();
        }
    }
    
    public String mostrarHora()
    {
        return horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
}
