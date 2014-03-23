package com.codi.issue;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Created by rmpestano on 3/22/14.
 */

//@ViewAccessScoped
@SessionScoped
@Named
public  class AnotherBean implements Serializable{

    protected Logger log = Logger.getLogger(getClass().getSimpleName());

    public void observe(@Observes(notifyObserver = Reception.IF_EXISTS) MyEvent event){
        log.fine("event received:"+event);
    }
}
