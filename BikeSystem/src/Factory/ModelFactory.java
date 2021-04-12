package Factory;

import Model.MainModel;
import Model.MainModelManager;

public class ModelFactory {
    private MainModel mainModel;

    public MainModel getModel(){
        if (mainModel ==null){
            mainModel =new MainModelManager();
        }
        return mainModel;
    }
}
