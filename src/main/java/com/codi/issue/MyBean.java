package com.codi.issue;


import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by rmpestano on 3/22/14.
 */
@ViewAccessScoped
@Named
public class MyBean implements Serializable{

    @Inject
    Event<MyEvent> myEvent;


    public void fire(){
        myEvent.fire(new MyEvent());
    }
}
