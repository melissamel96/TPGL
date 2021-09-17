/**
 *
 * @author roudet
 */
public class Framboise {
    private double prix;
    private String origine;
	
    public Framboise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Framboise(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Framboise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Framboises sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Framboise or = (Framboise) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Framboise a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Framboise fr = new Framboise(2.49,"espagne");
        or.toString();
        Framboise fr1 = new Framboise(1.25,"mexique");


        System.out.println("la Framboise fr coute:"+ fr.getPrix());
         System.out.println("la Framboise fr a des:"+ or.isSeedless());

        
	System.out.println("premier test Framboise");
   }
}
