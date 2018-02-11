package br.ucb.talp.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author leonardo
 */
@FacesValidator("numeroIntegrantesValidator")
public class ValidatorNumeroIntegrantes implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value != null){
            Integer numeroIntegrantes = Integer.valueOf(value.toString());
            if(numeroIntegrantes < 20 || numeroIntegrantes > 40)
                throw new ValidatorException(new FacesMessage("Número de integrantes inválido"));
        }
    }
    
}
