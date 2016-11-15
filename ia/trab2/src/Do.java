
import trabfs.machineLeaningFrameWork.core.Problema;
import trabfs.machineLeaningFrameWork.core.Result;
import trabfs.machineLeaningFrameWork.search.Search;
import trabfs.machineLeaningFrameWork.search.metaheuristics.*;

/**
 *
 * @author rbroetto
 */
public class Do {
    
    public static void main(String[] args){
        
        // instanciando o método de busca
        Search metodo = new BPSO();

        // instanciando o problema        
        Problema p = new Problema("entrada/ionosphere.arff");
        
        // executando o método
        Result r = metodo.startSearch(p);   
        r.printResult();                
    }    
}
