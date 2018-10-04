package com.company.view;


import com.company.view.messagesPackage.*;

public class SingletonMessages{
    private static SingletonMessages singleton = null;
    
    public final GeneralDefaultMessages generalMessages = new GeneralDefaultMessages();
    public final LoginDefaultMessages loginMessages = new LoginDefaultMessages();
    public final MembersDefaultMessages membersMessages = new MembersDefaultMessages();
    public final MenuDefaultMessages menuMessages = new MenuDefaultMessages();
    public final ResourcesDefaultMessages resourcesMessages = new ResourcesDefaultMessages();
    
    private SingletonMessages(){}
    
    public static SingletonMessages getInstance(){
        if (singleton == null){
            singleton = new SingletonMessages();
        }
        return singleton;
    }
    
    
    
    
    
    
    
}
