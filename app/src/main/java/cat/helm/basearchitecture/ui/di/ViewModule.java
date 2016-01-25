/*
Created by Helm  25/1/16.
*/


package cat.helm.basearchitecture.ui.di;

import cat.helm.basearchitecture.ui.MainView;
import dagger.Module;
import dagger.Provides;

@Module
public class ViewModule {

    private final MainView view;

    public ViewModule(MainView view){
        this.view = view;
    }

    @Provides MainView providesMainView(){
        return view;
    }
}
