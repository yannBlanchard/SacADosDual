import java.util.*;
import java.util.Random;

/**
 * Classe qui permet de générer une instance
 * @version 2015-2016
 * @author Charge de TD 
 */


public class Generator {
   /**
   *
   */
   public int op;
   /**
   *
   */
   public int ou;
   /**
   * l
   */
   public int t;
   /**
   * L'instance
   */
   public Instance lInstance;

public Generator(int t,int op, int ou){
   this.op = op;
   this.t=t;
   this.ou = ou;
   lInstance= MakeInstance(t,op,ou);
}


/**
* methode qui cree une instance 
*@param taille le nb d'objets de l instance
*@param ordrepoids : le poids des objets est tiree au hasard entre 0 et ordrepoids
*@param ordreutilite l'utilite est tiree au hasard entre 0 et ordreutilite
*/

public Instance MakeInstance(int taille, int ordrepoids, int ordreutilite){
   Instance pb; 
   int poids; 
   int util; 
   ListeObjets x;

   x=new ListeObjets();
   for(int i = 0; i<taille; i++) {
       poids=(int)(Math.random()*ordrepoids)+1;
       util=(int)(Math.random()*ordreutilite)+1;
       x.ajoute(new Objet(i+1,poids, util));
   }
   util=(int)(Math.random()*x.getUtilTotale())-5;
   if (util <0) util=0;
   pb=new Instance(taille,x,util);
   return pb;
}


public void affiche(){
       System.out.println("Affichage de instance");
       System.out.println(lInstance.toString());
}

public Instance getInstance(){
   return lInstance;
}

}
