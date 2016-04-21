/**
 * Created by Yann on 21/04/2016.
 */
public class SacADosDual {
    private Instance instance;
    private int utiliteMin;
    private int nbObjet;
    //private int tableau[][];
    public SacADosDual(Instance i) {
        this.instance = i;
    }



    public void constructArray(){
        nbObjet = instance.nbObjets;
        utiliteMin = instance.utiliteMin; //?

        int tableau[utiliteMin+1][nbObjet];
    }

    public void showSolution(){

    }

    public int getValue(int v1,int v2){

        return Math.min(1,2);
    }

    public void premiereColonne(int utiliteI,int e){
        for(int i =0;i<2;i++){

        }
    }

    public void calculColonne(int nbColonne){
        for(int k = nbColonne -1;k <1;k--){

        }
    }

}
