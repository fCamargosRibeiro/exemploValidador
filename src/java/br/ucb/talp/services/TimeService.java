package br.ucb.talp.services;

import br.ucb.talp.beans.Time;
import java.util.List;

/**
 *
 * @author leonardo
 */
public interface TimeService {
    public boolean existsTime(String nome, List<Time> times);
}
