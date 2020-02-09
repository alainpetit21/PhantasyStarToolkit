

import Controller.ApplicationFacade;
import Model.ModelFacade;

public class PhantasyStarToolkit {
    static private ModelFacade mObjModelFacade;
    static private ApplicationFacade mObjApplicationFacade;

    public static void main(String[] args) {
        //////////////////
        //The Model Layer
        mObjModelFacade= ModelFacade.getInstance();
        
        //////////////////
        //The Controller Layer
        mObjApplicationFacade= ApplicationFacade.getInstance();
        mObjApplicationFacade.SetPSRomFile("/home/apetit/Work/AlainPetit/Code/PhantasyStarToolkit/data/Phantasy Star (USA, Europe) (Rev 2).sms");
    }
}
