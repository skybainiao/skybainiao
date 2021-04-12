package Factory;

import ViewModel.ChatVM;
import ViewModel.HomePageVM;
import ViewModel.LoginVM;

public class ViewModelFactory {
    private LoginVM loginVM;
    private HomePageVM homePageVM;
    private ChatVM chatVM;

    public ViewModelFactory(ModelFactory modelFactory){
        loginVM=new LoginVM(modelFactory.getModel());
        homePageVM=new HomePageVM(modelFactory.getModel());

    }

    public LoginVM getLoginVM() {
        return loginVM;
    }

    public HomePageVM getHomePageVM(){
        return homePageVM;
    }
}
