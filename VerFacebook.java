package com.rim.samples.device.EnSenas;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.blackberry.api.browser.Browser;
     
     //Redirecciona a la pagina de Facebook de la Fundacion
      public class VerFacebook extends MainScreen
    {      
        public VerFacebook()
        {
        Browser.getDefaultSession().displayPage( "http://facebook.com/neoessentia/" );
        }
       
    } 
