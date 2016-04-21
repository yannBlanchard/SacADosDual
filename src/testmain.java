import java.util.*;

/**
 * Cette classe principale permet d'appeler le générateur d'instances (classe generator)
 * en en donnant les paramètres nombre d'instances, nombre d'objets, ordre de
 * grandeur pour les tailles et les utilités (poids)
 *
 * @author charge TD
 * @version 2015-2016 completee
 */


public class testmain {

    public static void main(String[] args) {
      int taille=5;
      int puissance;
      Instance I;
      boolean[] x=new boolean[taille];  
      ListeObjets Sol= new ListeObjets();
      Generator xtest= new Generator(taille,10,7);

      System.out.println("debut");
      xtest.affiche();
      I=xtest.getInstance();
    
      // creation d'une solution particuliere
      x[0]=true; x[1]=false; x[2]=true; x[3]=false; x[4]=true;
 
      // transcription de la solution exprimee sous forme de variable de decision (ou inconnues) en sous ensemble d'objets
      for(int i=0; i < taille; i++){
         if (x[i]) {
            Sol.ajoute(I.lesObjets.get(i));
         }
      }
     
      System.out.print("Sous ensemble solution \n" + Sol.toString());
      if (Sol.getUtilTotale()>I.utiliteMin) System.out.println("la solution est realisable");

      // affichage de toutes les solutions
      System.out.println("\nAffichage de toutes les solutions (" + Math.pow(2,taille) +")\n");
      for(int j=0;j <Math.pow(2,taille);j++){
        // decomp en base 2 de j et remplissage du x
        for(int i=taille-1;i>0;i--){
            puissance= (int) Math.pow(2,i);
            // equivalent a ce qui suit
            x[i]= (j/puissance >0);
            if (j/puissance >0){
                x[i]=true;         
            }
            else{
              x[i]=false;        
            }
        }
        //terme en 0
        x[0]=(j%2 >0);
        // fin de la construction affichage de x
        for(int i=0; i < taille; i++){
          System.out.print("x["+i+"]="+x[i]+" ");	
        }	
        System.out.println();
        // transcription de la solution exprimee sous forme de variable de decision (ou inconnues) en sous ensemble d'objets
        //remise a zero de l'ensemble
        Sol= new ListeObjets();
        for(int i=0; i < taille; i++){
           if (x[i]) {
              Sol.ajoute(I.lesObjets.get(i));
           }
        }
        System.out.print("Sous ensemble solution \n" + Sol.toString());
        if (Sol.getUtilTotale()>I.utiliteMin) System.out.println("la solution est realisable");
        System.out.println();
    }
  }
  
}
