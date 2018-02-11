package br.ucb.talp.mb;

import br.ucb.talp.beans.Time;
import br.ucb.talp.services.TimeService;
import br.ucb.talp.services.TimeServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author leonardo
 */
@ManagedBean
@SessionScoped
public class TimeBean{
    private List<Time> times;
    private Time time;
    private TimeService timeService;
    
    public TimeBean(){
        setTimeService(new TimeServiceImpl());
        setTime(new Time());
        setTimes(new ArrayList<Time>());
    }

    public void validaDuplicidade(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value !=null){   
            String nome = value.toString();
            
            if(getTimeService().existsTime(nome, times))
                throw new ValidatorException(new FacesMessage("Time Repetido"));
        }
    }
    
    public String salvar(){
        getTimes().add(getTime());
        clear();
        JSFUtil.addMessage("Cadastrado com sucesso!");
        return "LISTAGEM_TIMES";
    }
    
    public int getQuantidadeLinhas(){
        if(getTimes()!=null)
            return getTimes().size();
        return 0;
    }
    
    public void clear(){
        setTime(new Time());
    }
    
    public void validaAno(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value != null){
            Integer ano = Integer.valueOf(value.toString());
            
            if(ano > 2014 || ano < 1900){
                throw new ValidatorException(new FacesMessage("Ano Inválido"));
            }
        }
    }
    
    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    public TimeService getTimeService() {
        return timeService;
    }

    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }
}
