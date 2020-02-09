package Controller;


public class ApplicationFacade {
    private static class SingletonClassHolder {
        static final ApplicationFacade mSingletonInstance = new ApplicationFacade();
    }
    
    public static ApplicationFacade getInstance() {
        return SingletonClassHolder.mSingletonInstance;
    }

    private ApplicationFacade() {
        Model.ModelFacade objFacade = Model.ModelFacade.getInstance();
        objFacade.setObserverPSRomFile(new MessageOnPSRomFileOpened());
    }

    public void SetPSRomFile(String p_strPathName){
        Model.ModelFacade objFacade = Model.ModelFacade.getInstance();
                
        objFacade.setPSRomFile(p_strPathName);
    }
}
