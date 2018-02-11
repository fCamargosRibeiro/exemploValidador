package br.ucb.talp.services;

import br.ucb.talp.beans.Time;
import java.util.List;

/**
 *
 * @author leonardo
 */
public class TimeServiceImpl implements TimeService {

    @Override
    public boolean existsTime(String nome, List<Time> times) {
        for(Time time : times){
            if(time.getNome().equals(nome))
                return true;
        }
        
        return false;
    }
    
}
